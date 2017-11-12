package de.mgwt.dubravko.client.side4;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import de.mgwt.dubravko.client.ClientFactory;

public class SideActivity4 extends MGWTAbstractActivity{

	private ClientFactory clientFactory;
	
	public SideActivity4(ClientFactory clientFactory3) {
		clientFactory = clientFactory3;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		
		SideView4 view = null;
		
		Place place4 = clientFactory.getPlaceController().getWhere();
		System.out.println("SIDEACTIVITY4");
		if(place4 instanceof SidePlace4){
			String id = ((SidePlace4) place4).getID();
			view = clientFactory.getFileView4(id);
			panel.setWidget(view);
		}
		
		
		
	}

}
