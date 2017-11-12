package de.mgwt.dubravko.client.seite6;


import java.util.List;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.dom.client.event.tap.TapEvent;
import com.googlecode.mgwt.dom.client.event.tap.TapHandler;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler;

import de.mgwt.dubravko.client.ClientFactory;
import de.mgwt.dubravko.client.model.Heilmittel;

public class SeiteActivity6 extends MGWTAbstractActivity{

	private List<Heilmittel> list;
	private final ClientFactory clientFactory;
	Utility6 util;
	
	public SeiteActivity6(ClientFactory client){
		this.clientFactory = client;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		
		final SeiteView6 view = clientFactory.getSeiteView6();
		
		Place place = clientFactory.getPlaceController().getWhere();
		
		if(place instanceof SeitePlace6){
			SeitePlace6 seitePlace5 = (SeitePlace6)place;
			
			String  indexe = seitePlace5.getID();
			
			String idSeite1 = String.valueOf(indexe.charAt(0));
			String idSeite2 = String.valueOf(indexe.charAt(1));
			String idSeite3 = String.valueOf(indexe.charAt(2));
			
			util = new Utility6();
			
		    list = util.getListById(indexe);
			
			view.render(list);
			
		}
		
		// Handler für Celllist
		addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
			public void onCellSelected(CellSelectedEvent event) {
				// Ruft das alert-Fenster auf.
				// 1. Parameter : Name des Medikaments
				// 2. Parameter : 
				//view.alertSomeStuff(list.get(event.getIndex()).getName(), util.gehtMotherfucker(list.get(event.getIndex()).getName()));
			}
		}));
		
		if(!MGWT.getOsDetection().isAndroid() && !MGWT.getOsDetection().isDesktop()){
			// Backbutton Handler
			addHandlerRegistration(view.getHeaderBackButton().addTapHandler(new TapHandler() {
				public void onTap(TapEvent event) {
	//				clientFactory.getPlaceController().goTo(new SeitePlace3(String.valueOf(idSeite2), idSeite1));
				}
			}));
		}
		panel.setWidget(view);
	}

}
