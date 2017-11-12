package de.mgwt.dubravko.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import de.mgwt.dubravko.client.disclaimer.DisclaimerView;
import de.mgwt.dubravko.client.disclaimer2.DisclaimerView2;
import de.mgwt.dubravko.client.phoneGapTest.FileDisplayView;
import de.mgwt.dubravko.client.seite2.SeiteView2;
import de.mgwt.dubravko.client.seite3.SeiteView3;
import de.mgwt.dubravko.client.seite4.SeiteView4;
import de.mgwt.dubravko.client.seite5.SeiteView5;
import de.mgwt.dubravko.client.seite6.SeiteView6;
import de.mgwt.dubravko.client.side2.SideView2;
import de.mgwt.dubravko.client.side3.SideView3;
import de.mgwt.dubravko.client.side4.SideView4;
import de.mgwt.dubravko.client.startseite.StartSeiteView;

public interface ClientFactory {

	public EventBus getEventBus();

	public PlaceController getPlaceController();
	
	public DisclaimerView getDisclaimerView();

	public DisclaimerView2 getDisclaimerView2();
	
	public FileDisplayView getFileDisplayMGWT();
	
	public SideView2 getFileView2(String id);
	
	public SideView3 getFileView3(String id);
	
	public SideView4 getFileView4(String id);
	/**********************************************/
	
	public StartSeiteView getStartSeiteView(); 
	
	public SeiteView2 getSeiteView2();
	
	public SeiteView3 getSeiteView3();
	
	public SeiteView4 getSeiteView4();
	
	public SeiteView5 getSeiteView5();
	
	public SeiteView6 getSeiteView6();
}
