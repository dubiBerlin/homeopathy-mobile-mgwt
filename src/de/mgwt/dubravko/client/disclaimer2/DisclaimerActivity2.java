package de.mgwt.dubravko.client.disclaimer2;


import com.google.code.gwt.database.client.Database;
import com.google.code.gwt.database.client.SQLError;
import com.google.code.gwt.database.client.SQLResultSet;
import com.google.code.gwt.database.client.SQLTransaction;
import com.google.code.gwt.database.client.StatementCallback;
import com.google.code.gwt.database.client.TransactionCallback;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

import de.mgwt.dubravko.client.ClientFactory;
import de.mgwt.dubravko.client.startseite.StartSeitePlace;

public class DisclaimerActivity2 extends MGWTAbstractActivity{

	private final ClientFactory clientFactory;
	
	
	public DisclaimerActivity2(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		
		DisclaimerView2 disclaimerView2 = clientFactory.getDisclaimerView2();
		
		addHandlerRegistration(disclaimerView2.getDisclaimerButton2().addTapHandler(new TapHandler() {
			public void onTap(TapEvent event) {
				disclaimerConfirm();
				
			}
		}));
		
		
		panel.setWidget(disclaimerView2);
	}
	
	private void disclaimerConfirm(){
		if(Database.isSupported()){
			 Database db = Database.openDatabase("Disclaimer", "1.0", "Homoeopathie", 10000);
			 db.transaction(new TransactionCallback() {
				public void onTransactionStart(SQLTransaction tx) {
					tx.executeSql("INSERT INTO Disclaimer (disclaimer) VALUES (?)", new Object[]{"set"}, new StatementCallback<JavaScriptObject>() {
						public void onSuccess(SQLTransaction transaction, SQLResultSet<JavaScriptObject> resultSet) {
							System.out.println("hat geklappt");
							clientFactory.getPlaceController().goTo(new StartSeitePlace());
						}

						public boolean onFailure(SQLTransaction transaction,SQLError error) {
							System.out.println("hat nicht geklappt mit dem einfügen des Datansatzes!");
							return false;
						}
					});
				}
					
				public void onTransactionSuccess() {}
				
				public void onTransactionFailure(SQLError error) {
					//setTextMessageLabel("Could not open database", label );
				}
			});
		}
	}

}
