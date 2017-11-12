package de.mgwt.dubravko.client.side2;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler;
import de.mgwt.dubravko.client.ClientFactory;
import de.mgwt.dubravko.client.side3.SidePlace3;

public class SideActivity2  extends MGWTAbstractActivity{

	private ClientFactory clientFactory;
	
	public SideActivity2(ClientFactory clientFactoryParam) {
		this.clientFactory = clientFactoryParam;
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		
		SideView2 view = null;
		 
		Place place = clientFactory.getPlaceController().getWhere();
		
		/* Sicherheitsabfrage  */
		if(place instanceof SidePlace2){
			/* übergebene ID rausholen */
			String id = ((SidePlace2) place).getID();
			view = clientFactory.getFileView2(id);
		}
		final SideView2 view2 = view;
		addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
			public void onCellSelected(CellSelectedEvent event) {
				clientFactory.getPlaceController().goTo(new SidePlace3(view2.getOptionsInList2().get(event.getIndex())));
			}
		}));		
		panel.setWidget(view);
		
	}

	
	
}
