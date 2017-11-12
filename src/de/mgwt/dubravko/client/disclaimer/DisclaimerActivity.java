package de.mgwt.dubravko.client.disclaimer;


import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;

import de.mgwt.dubravko.client.ClientFactory;
import de.mgwt.dubravko.client.disclaimer2.DisclaimerPlace2;

public class DisclaimerActivity extends MGWTAbstractActivity{

	private final ClientFactory clientFactory;
	
	
	public DisclaimerActivity(ClientFactory clientFactory) {
		this.clientFactory = clientFactory;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		
		DisclaimerView disclaimerView = clientFactory.getDisclaimerView();
		
		addHandlerRegistration(disclaimerView.getDisclaimerButton().addTapHandler(new TapHandler() {
			public void onTap(TapEvent event) {
				clientFactory.getPlaceController().goTo(new DisclaimerPlace2());
			}
		}));
		
		
		panel.setWidget(disclaimerView);
	}

}
