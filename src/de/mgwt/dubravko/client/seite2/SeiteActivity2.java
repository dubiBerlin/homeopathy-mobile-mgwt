package de.mgwt.dubravko.client.seite2;


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
import de.mgwt.dubravko.client.seite3.SeitePlace3;
import de.mgwt.dubravko.client.seite4.SeitePlace4;
import de.mgwt.dubravko.client.startseite.StartSeitePlace;

public class SeiteActivity2 extends MGWTAbstractActivity{

	private List<String> list;
	private final ClientFactory clientFactory;
	
	public SeiteActivity2(ClientFactory client){
		this.clientFactory = client;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		SeiteView2 view = clientFactory.getSeiteView2();
		
		Place place = clientFactory.getPlaceController().getWhere();
		
		if(place instanceof SeitePlace2){
			SeitePlace2 seitePlace2 = (SeitePlace2)place;
			
			final int id = Integer.valueOf(seitePlace2.getID());
			
			System.out.println("SeiteActivity2 übergebener index : "+id);
			
			final Utility util = new Utility();
			
			list = util.getListById(id);
			
			view.render(list);
			
			// Handler für die einzelnen Listenzeilen anmelden
			addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
				public void onCellSelected(CellSelectedEvent event) {
					// hole die Nr der getippten Zeile
					int index = event.getIndex();
					
					// verwandle den getippten der ersten Seite in einen String
					String indexString = String.valueOf(id);
					System.out.println("nochmal der index = "+indexString);
					// hänge den auf der zweiten Seite gewählten index hinten ran
					indexString = indexString + ""+String.valueOf(index);
					// Param1 : Nr der geklickten Zeile von Seite 2
					// Param2 : Nr der geklickten Zeile auf der ersten Seite
					// 100 Infektanfälligkeit -> Eigenblut , keine Weiterleitung
					if(!indexString.equals("100")){
						/* Zähneknirschen überspringt Seite 3 weil es gleich zum Heilmittel führt */
						if( util.isIdForForwarding5(indexString)|| util.isIdForForwarding5(String.valueOf(id)) ){
							
							/* index von 300 und 301 -> daumenlutschen + 100 um kollision mit 301 vermeiden */
							if(indexString.equals("311") || indexString.equals("310")){
								indexString = indexString+"100";
							}
							clientFactory.getPlaceController().goTo(new SeitePlace4(indexString));
						}else{
							clientFactory.getPlaceController().goTo(new SeitePlace3(indexString));
						}
					}
				}
			}));
		}
		if(!MGWT.getOsDetection().isAndroid() && !MGWT.getOsDetection().isDesktop()){
			// Backbutton Handler
			addHandlerRegistration(view.getHeaderButton().addTapHandler(new TapHandler() {
				public void onTap(TapEvent event) {
					clientFactory.getPlaceController().goTo(new StartSeitePlace());
				}
			}));
		}
		
		
		
		panel.setWidget(view);
	}

}
