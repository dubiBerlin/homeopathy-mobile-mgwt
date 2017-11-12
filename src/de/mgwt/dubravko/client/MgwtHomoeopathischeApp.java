package de.mgwt.dubravko.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableEvent;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableHandler;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutEvent;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutHandler;
import com.googlecode.gwtphonegap.client.device.Device;
import com.googlecode.gwtphonegap.client.file.DirectoryEntry;
import com.googlecode.gwtphonegap.client.file.FileCallback;
import com.googlecode.gwtphonegap.client.file.FileError;
import com.googlecode.gwtphonegap.client.file.FileSystem;
import com.googlecode.mgwt.mvp.client.AnimatableDisplay;
import com.googlecode.mgwt.mvp.client.AnimatingActivityManager;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import de.mgwt.dubravko.client.phoneGapTest.FileDisplayPlace;

public class MgwtHomoeopathischeApp implements EntryPoint {
	
	public void onModuleLoad() {
//		initPhoneGap();
		GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {

			@Override
			public void onUncaughtException(Throwable e) {
				//TODO put in your own meaninful handler
				e.printStackTrace();

			}
		});

		new Timer() {
			@Override
			public void run() {
				start();

			}
		}.schedule(1);
	}
	
	private void start() {
		
//		initPhoneGap();
		
	  	//set viewport and other settings for mobile
		MGWT.applySettings(MGWTSettings.getAppSetting());
		final ClientFactory clientFactory = new ClientFactoryImpl();

		// Start PlaceHistoryHandler with our PlaceHistoryMapper
		AppPlaceHistoryMapper historyMapper = GWT.create(AppPlaceHistoryMapper.class);
		final PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);

		historyHandler.register(clientFactory.getPlaceController(), clientFactory.getEventBus(), new FileDisplayPlace("dubravko"));

		createPhoneDisplay(clientFactory);

		historyHandler.handleCurrentHistory();

	}
	
	private void createPhoneDisplay(ClientFactory clientFactory) {
		AnimatableDisplay display = GWT.create(AnimatableDisplay.class);

		PhoneActivityMapper appActivityMapper = new PhoneActivityMapper(clientFactory);

		PhoneAnimationMapper appAnimationMapper = new PhoneAnimationMapper();

		AnimatingActivityManager activityManager = new AnimatingActivityManager(appActivityMapper, appAnimationMapper, clientFactory.getEventBus());

		activityManager.setDisplay(display);

		RootPanel.get().add(display);
	}
	
	public void initPhoneGap(){
		final PhoneGap phoneGap = GWT.create(PhoneGap.class);
		
		@SuppressWarnings("unused")
		Device device = phoneGap.getDevice();
		phoneGap.addHandler(new PhoneGapAvailableHandler() {
			@Override
		    public void onPhoneGapAvailable(PhoneGapAvailableEvent event) {
		     // build your ui and caLet ll phonegap
		        Window.alert(phoneGap.getDevice().getVersion()+" "+phoneGap.getDevice().getPhoneGapVersion());
		        
		        phoneGap.getFile().requestFileSystem(FileSystem.LocalFileSystem_PERSISTENT, 0, new FileCallback<FileSystem, FileError>() {
		        	public void onSuccess(FileSystem entry) {
	                    DirectoryEntry root = entry.getRoot();
	                    Window.alert("Full Path : "+root.getFullPath());
	                    Window.alert("toURI : "+root.toURI());
	                    Window.alert("Name : "+root.getName());
	                    
//	                    DirectoryReader directoryReader =  root.createReader();
//	                    directoryReader.readEntries(new FileCallback<LightArray<EntryBase>,FileError>(){
//	                    		
//	                    	 public void onSuccess(LightArray<EntryBase> entries) {
//                                 
//	                    		 String files = "";
//	                    		 String directories = "";
//	                    		 
//	                    		 for (int i = 0; i < entries.length(); i++) {
//                                     EntryBase entryBase = entries.get(i);
//
//                                     if (entryBase.isDirectory()) {
//                                         DirectoryEntry directoryEntry = entryBase.getAsDirectoryEntry();
//                                         String name = directoryEntry.getName();
//                                         directories = directories+" <- dir\n"+name;
//                                     } else {
//                                         FileEntry fileEntry = entryBase.getAsFileEntry();
//                                         String name = fileEntry.getName();
//                                         files = files +" <- file\n"+name;
//                                         //to something with the FileEntry
//                                     }
//	                             }
//	                    		 Window.alert(files+"\n"+directories);
//	                         }
//	                    	 public void onFailure(FileError error) {}
//	                    });
	                  
		            }

		            @Override
		            public void onFailure(FileError error) {
		            	Window.alert("Nix mit MAFIa");
		            }
		    });
		        
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
}
