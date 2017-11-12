package de.mgwt.dubravko.client.seite4;

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
import de.mgwt.dubravko.client.seite5.SeitePlace5;

public class SeiteActivity4 extends MGWTAbstractActivity{

	private List<Heilmittel> list;
	private final ClientFactory clientFactory;
	Utility4 util;
	String  indexe = null;
	
	public SeiteActivity4(ClientFactory client){
		this.clientFactory = client;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		
		final SeiteView4 view = clientFactory.getSeiteView4();
		
		Place place = clientFactory.getPlaceController().getWhere();
		
		if(place instanceof SeitePlace4){
			SeitePlace4 seitePlace4 = (SeitePlace4)place;
			util = new Utility4();
			
			indexe = seitePlace4.getID();
			
			String idSeite1 = String.valueOf(indexe.charAt(0));
			String idSeite2 = String.valueOf(indexe.charAt(1));
			String idSeite3 = String.valueOf(indexe.charAt(2));
			
			// abchecken ob es eine ID ist die zur Seite5 führt
			if(util.isIdForForwarding(indexe)){
				
				list = Utility4.getListByIdForwardOptions(indexe);
				view.render(list);
				
				// Handler für Celllist
				addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
					public void onCellSelected(CellSelectedEvent event) {
						// Ruft das alert-Fenster auf.
						// 1. Parameter : Name des Medikaments
						// 2. Parameter : 
						
						indexe = indexe+""+String.valueOf(event.getIndex());
						
						clientFactory.getPlaceController().goTo(new SeitePlace5(indexe));
					}
				}));
				
			}else{
				
				list = Utility4.getListById(indexe);
				view.render(list);
				
				// Handler für Celllist
				addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
					public void onCellSelected(CellSelectedEvent event) {
						// Ruft das alert-Fenster auf.
						// 1. Parameter : Name des Medikaments
						// 2. Parameter : 
						view.alertSomeStuff(list.get(event.getIndex()).getName(), util.gehtMotherfucker(list.get(event.getIndex()).getName()));
					}
				}));
				
			}	
		}
		
		
		
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
