package de.mgwt.dubravko.client.seite3;

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
import de.mgwt.dubravko.client.seite4.SeitePlace4;
import de.mgwt.dubravko.client.startseite.StartSeitePlace;

public class SeiteActivity3 extends MGWTAbstractActivity{

	private List<String> list;
	private final ClientFactory clientFactory;
	String indexe = null;
	
	public SeiteActivity3(ClientFactory client){
		this.clientFactory = client;
	}
	
	@SuppressWarnings("static-access")
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		
		SeiteView3 view = clientFactory.getSeiteView3();
		
		Place place = clientFactory.getPlaceController().getWhere();
		
		if(place instanceof SeitePlace3){
			SeitePlace3 seitePlace3 = (SeitePlace3)place;
			
			indexe = seitePlace3.getID();
			
			String idvonSeite1 = "";
			String idvonSeite2 = "";
			
			if(indexe.length() > 2){
				idvonSeite1 = String.valueOf(indexe.charAt(0))+""+String.valueOf(indexe.charAt(1));
				idvonSeite2 = String.valueOf(indexe.charAt(2));
			}else{
				idvonSeite1 = String.valueOf(indexe.charAt(0));
				idvonSeite2 = String.valueOf(indexe.charAt(1));
			}
			Utility3 util = new Utility3();
			
			list = util.getListById(idvonSeite2,idvonSeite1);
			
			addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
				public void onCellSelected(CellSelectedEvent event) {
					indexe = indexe+""+String.valueOf(event.getIndex());
					clientFactory.getPlaceController().goTo(new SeitePlace4(indexe));				
				}
			}));
			
			view.render(list);
			
		}
		
		if(!MGWT.getOsDetection().isAndroid() && !MGWT.getOsDetection().isDesktop()){
			// Backbutton Handler
			addHandlerRegistration(view.getHeaderBackButton().addTapHandler(new TapHandler() {
				public void onTap(TapEvent event) {
					clientFactory.getPlaceController().goTo(new StartSeitePlace());
				}
			}));
		}
		
		panel.setWidget(view);
	}

	
	
}
