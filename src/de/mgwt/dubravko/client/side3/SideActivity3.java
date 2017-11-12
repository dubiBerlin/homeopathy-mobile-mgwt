package de.mgwt.dubravko.client.side3;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler;

import de.mgwt.dubravko.client.ClientFactory;
import de.mgwt.dubravko.client.side4.SidePlace4;

public class SideActivity3 extends MGWTAbstractActivity{

	private ClientFactory clientFactory;
	
	public SideActivity3(ClientFactory clientFactory3) {
		clientFactory = clientFactory3;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		
		Place place3 = clientFactory.getPlaceController().getWhere();
		
		if(place3 instanceof SidePlace3){
			String id = ((SidePlace3) place3).getID();
			final SideView3 view = clientFactory.getFileView3(id);
			panel.setWidget(view);
			addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
				public void onCellSelected(CellSelectedEvent event) {
					clientFactory.getPlaceController().goTo(new SidePlace4(view.getOptionsInList3().get(event.getIndex())));
				}
			}));		
			panel.setWidget(view);
		}
		
		
		
	}

}
