package de.mgwt.dubravko.client.seite5;


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
import de.mgwt.dubravko.client.seite4.Utility4;
import de.mgwt.dubravko.client.seite6.SeitePlace6;

public class SeiteActivity5 extends MGWTAbstractActivity{

	private List<Heilmittel> list;
	private final ClientFactory clientFactory;
	Utility5 util;
	String  indexe;
	
	public SeiteActivity5(ClientFactory client){
		this.clientFactory = client;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		
		final SeiteView5 view = clientFactory.getSeiteView5();
		
		Place place = clientFactory.getPlaceController().getWhere();
		
		util = new Utility5();
		
		if(place instanceof SeitePlace5){
			SeitePlace5 seitePlace5 = (SeitePlace5)place;
			
			indexe = seitePlace5.getID();
			
//			String idSeite1 = String.valueOf(indexe.charAt(0));
//			String idSeite2 = String.valueOf(indexe.charAt(1));
//			String idSeite3 = String.valueOf(indexe.charAt(2));
			
			if(util.isIdForForwarding5(indexe)){
				
				list = util.getListByIdForwardOptions(indexe);
				
				// Handler für Celllist
				addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
					public void onCellSelected(CellSelectedEvent event) {
						indexe = indexe+""+String.valueOf(event.getIndex());
						clientFactory.getPlaceController().goTo(new SeitePlace6(indexe));
					}
				}));
			}
			else{
				util = new Utility5();
				list = util.getListById(indexe);
			}
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
