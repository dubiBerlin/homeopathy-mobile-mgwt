package de.mgwt.dubravko.client.startseite;


import java.util.List;
import com.google.code.gwt.database.client.Database;
import com.google.code.gwt.database.client.SQLError;
import com.google.code.gwt.database.client.SQLResultSet;
import com.google.code.gwt.database.client.SQLTransaction;
import com.google.code.gwt.database.client.StatementCallback;
import com.google.code.gwt.database.client.TransactionCallback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableEvent;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableHandler;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutEvent;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutHandler;
import com.googlecode.gwtphonegap.client.device.Device;
import com.googlecode.gwtphonegap.client.file.DirectoryEntry;
import com.googlecode.gwtphonegap.client.file.EntryBase;
import com.googlecode.gwtphonegap.client.file.FileCallback;
import com.googlecode.gwtphonegap.client.file.FileEntry;
import com.googlecode.gwtphonegap.client.file.FileError;
import com.googlecode.gwtphonegap.client.file.FileSystem;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler;
import de.mgwt.dubravko.client.disclaimer.DisclaimerPlace;
import de.mgwt.dubravko.client.phoneGapTest.FileDisplayPlace;
import de.mgwt.dubravko.client.seite2.SeitePlace2;
import de.mgwt.dubravko.client.ClientFactory;

public class StartSeiteActivity extends MGWTAbstractActivity{

	private List<String> list;
	private final ClientFactory clientFactory;
	private static PhoneGap phoneGap;
	
	
	public StartSeiteActivity(ClientFactory clientFactory){
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		phoneGap = (PhoneGap)GWT.create(PhoneGap.class);

//		initPhoneGap();
//		getXMLFiles();
//		getDirectory();
		
		StartSeiteView view = clientFactory.getStartSeiteView();
		
		list =  StartSeiteUtility.getList();
		
		view.render(list);
		
		// Erstellen der Datenbank falls noch nicht vorhanden
		if(Database.isSupported()){
			Database db = Database.openDatabase("Disclaimer", "1.0", "Homoeopathie", 10000);
			db.transaction(new TransactionCallback() {
			    public void onTransactionStart(SQLTransaction tx) {
			        tx.executeSql("CREATE TABLE IF NOT EXISTS disclaimer ("
			        	      + "disclaimer VARCHAR(50))", null);
			    }
			    public void onTransactionFailure(SQLError error) {}
			    public void onTransactionSuccess() {}
			});
		}
		
		// in Datenbank nachschauen ob schon Wert für Disclaimer gesetzt wurde.
		if(Database.isSupported()){
			
			Database db = Database.openDatabase("Disclaimer", "1.0", "Homoeopathie", 10000);
			 db.transaction(new TransactionCallback() {
				public void onTransactionStart(SQLTransaction tx) {
					tx.executeSql("SELECT * FROM Disclaimer", null, new StatementCallback<JavaScriptObject>() {
						public void onSuccess(SQLTransaction transaction, SQLResultSet<JavaScriptObject> resultSet) {
							// Falls ja, zum Disclaimer umleiten
							
							if(resultSet.getRows().getLength() == 0){
								clientFactory.getPlaceController().goTo(new DisclaimerPlace());
							}
						}

						public boolean onFailure(SQLTransaction transaction,SQLError error) {
							return false;
						}
					});
				}
					
				public void onTransactionSuccess() {}
				
				public void onTransactionFailure(SQLError error) {}
			});
		}
		
		addHandlerRegistration(view.getHeaderToPhoneGapButton().addTapHandler(new TapHandler() {
			public void onTap(TapEvent event) {
				clientFactory.getPlaceController().goTo(new FileDisplayPlace("phonegap"));
			}
		}));
		
		addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
			public void onCellSelected(CellSelectedEvent event) {
				
				if(event.getIndex()==0){
					disclaimerAktivieren();
				}
				else{
					int index = event.getIndex();
					clientFactory.getPlaceController().goTo(new SeitePlace2(String.valueOf(index)));
				}
			}
		}));
		
		panel.setWidget(view);
	}
	
	public static void getDirectory(){
		
		phoneGap.getFile().requestFileSystem(FileSystem.LocalFileSystem_PERSISTENT, 0, new FileCallback<FileSystem, FileError>() {

	        @Override
	        public void onSuccess(FileSystem entry) {
	                DirectoryEntry root = entry.getRoot();
	                //to something with the directory entry
	                Window.alert("YES");
	        }

	        @Override
	        public void onFailure(FileError error) {
	        	Window.alert("oops "+error.getErrorCode());

	        }
	});
////		final PhoneGap phoneGap = (PhoneGap)GWT.create(PhoneGap.class);
//		phoneGap.getFile().requestFileSystem(FileSystem.LocalFileSystem_PERSISTENT, 0,
//		        new FileCallback<FileSystem, FileError>() {
//
//		          @Override
//		          public void onSuccess(FileSystem entry) {
//		            System.out.println("SUCCESS "+entry.getName());
//
//		          }
//
//		          @Override
//		          public void onFailure(FileError error) {
//		        	  System.out.println("Failed to request file system with error code: " + error.getErrorCode());
//		        	  System.out.println("NOT_FOUND_ERR 		   "+error.NOT_FOUND_ERR);
//		        	  System.out.println("PATH_EXISTS_ERR 		   "+error.PATH_EXISTS_ERR);
//		        	  System.out.println("INVALID_STATE_ERR        "+error.INVALID_STATE_ERR);
//		        	  System.out.println("ENCODING_ERR             "+error.ENCODING_ERR);
//		        	  System.out.println("INVALID_MODIFICATION_ERR "+error.INVALID_MODIFICATION_ERR);
//		        	  System.out.println("PATH_EXISTS_ERR          "+error.PATH_EXISTS_ERR);
//		        	  System.out.println("QUOTA_EXCEEDED_ERR       "+error.QUOTA_EXCEEDED_ERR);
//		        	  
//		          }
//		        });
	}
	
	public static void getXMLFiles(){
		final String yourPath = "file:///war/xml";
		System.out.println("getXMLFiles()");
	//	final PhoneGap phoneGap = (PhoneGap)GWT.create(PhoneGap.class);
		
		phoneGap.getFile().resolveLocalFileSystemURI(yourPath, new FileCallback<EntryBase, FileError>() {
			
			@Override
			public void onSuccess(EntryBase entry) {
				FileEntry fileEntry = entry.getAsFileEntry();
				
				Window.alert("SUCCESS");
				
			}
			
			@Override
			public void onFailure(FileError error) {
				 Window.alert("XML file not found.");
				
			}
		});
	}
	
	public static void initPhoneGap(){
//		final PhoneGap phoneGap = GWT.create(PhoneGap.class);
		
		Device device = phoneGap.getDevice();
		System.out.println("device.getPlatform() ");
		
		phoneGap.addHandler(new PhoneGapAvailableHandler() {

		 @Override
		    public void onPhoneGapAvailable(PhoneGapAvailableEvent event) {
		     // build your ui and caLet ll phonegap
		        String phoneGapVersion = phoneGap.getDevice().getPhoneGapVersion();
		        //RootPanel.get().add(new HTML("Using phonegap version: " + phoneGapVersion));
		        //Window.alert("Using phonegap version: " + phoneGapVersion);
		    }
		});

		phoneGap.addHandler(new PhoneGapTimeoutHandler() {

			@Override
			public void onPhoneGapTimeout(PhoneGapTimeoutEvent event) {
				 Window.alert("can not load phonegap");
				
			}
		});
		phoneGap.initializePhoneGap();
	}
	
	public void disclaimerAktivieren(){
		if(Database.isSupported()){
			System.out.println("disclaimerAktivieren()");
			Database db = Database.openDatabase("Disclaimer", "1.0", "Homoeopathie", 10000);
			 db.transaction(new TransactionCallback() {
				public void onTransactionStart(SQLTransaction tx) {
					tx.executeSql("DELETE FROM Disclaimer", null, new StatementCallback<JavaScriptObject>() {
						public void onSuccess(SQLTransaction transaction, SQLResultSet<JavaScriptObject> resultSet) {
							Window.alert("Dislaimer aktiviert!");
						}

						public boolean onFailure(SQLTransaction transaction,SQLError error) {
							return false;
						}
					});
				}
					
				public void onTransactionSuccess() {}
				
				public void onTransactionFailure(SQLError error) {}
			});
		}
	}
	
}
