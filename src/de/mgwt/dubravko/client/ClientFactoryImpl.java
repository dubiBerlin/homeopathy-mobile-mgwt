package de.mgwt.dubravko.client;

import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import de.mgwt.dubravko.client.disclaimer.DisclaimerView;
import de.mgwt.dubravko.client.disclaimer.DisclaimerViewImpl;
import de.mgwt.dubravko.client.disclaimer2.DisclaimerView2;
import de.mgwt.dubravko.client.disclaimer2.DisclaimerViewImpl2;
import de.mgwt.dubravko.client.phoneGapTest.FileDisplayViewImpl;
import de.mgwt.dubravko.client.phoneGapTest.FileDisplayView;
import de.mgwt.dubravko.client.seite2.SeiteView2;
import de.mgwt.dubravko.client.seite2.SeiteViewImpl2;
import de.mgwt.dubravko.client.seite3.SeiteView3;
import de.mgwt.dubravko.client.seite3.SeiteViewImpl3;
import de.mgwt.dubravko.client.seite4.SeiteView4;
import de.mgwt.dubravko.client.seite4.SeiteViewImpl4;
import de.mgwt.dubravko.client.seite5.SeiteView5;
import de.mgwt.dubravko.client.seite5.SeiteViewImpl5;
import de.mgwt.dubravko.client.seite6.SeiteView6;
import de.mgwt.dubravko.client.seite6.SeiteViewImpl6;
import de.mgwt.dubravko.client.side2.SideView2;
import de.mgwt.dubravko.client.side2.SideViewImpl2;
import de.mgwt.dubravko.client.side3.SideView3;
import de.mgwt.dubravko.client.side3.SideViewImpl3;
import de.mgwt.dubravko.client.side4.SideView4;
import de.mgwt.dubravko.client.side4.SideViewImpl4;
import de.mgwt.dubravko.client.startseite.StartSeiteView;
import de.mgwt.dubravko.client.startseite.StartSeiteViewImpl;

public class ClientFactoryImpl  implements ClientFactory{

	private EventBus eventBus;
	private PlaceController placeController;
	private StartSeiteView startSeiteView;
	private DisclaimerView disclaimerView;
	private DisclaimerView2 disclaimerView2;
	private SeiteView2 seiteView2;
	private SeiteView3 seiteView3;
	private SeiteView4 seiteView4;
	private SeiteView5 seiteView5;
	private SeiteView6 seiteView6;
	private FileDisplayView fileDisplayMGWT;
	private SideView2 fileView2;
	private SideView3 fileView3;
	private SideView4 fileView4;
	
	public ClientFactoryImpl() {
		eventBus = new SimpleEventBus();
		placeController = new PlaceController(eventBus);
	}
	
	@Override
	public EventBus getEventBus() {
		return eventBus;
	}

	@Override
	public PlaceController getPlaceController() {
		return placeController;
	}

	@Override
	public FileDisplayView getFileDisplayMGWT() {
		if(fileDisplayMGWT == null){
			fileDisplayMGWT = new FileDisplayViewImpl();
		}
		return fileDisplayMGWT;
	}
	
	@Override
	public StartSeiteView getStartSeiteView() {
		if(startSeiteView == null){
			startSeiteView = new StartSeiteViewImpl();
		}
		return startSeiteView;
	}

	@Override
	public DisclaimerView getDisclaimerView() {
		if(disclaimerView == null){
			disclaimerView = new DisclaimerViewImpl();
		}
		return disclaimerView;
	}

	@Override
	public DisclaimerView2 getDisclaimerView2() {
		if(disclaimerView2 == null){
			disclaimerView2 = new DisclaimerViewImpl2();
		}
		return disclaimerView2;
	}

	@Override
	public SeiteView2 getSeiteView2() {
		if(seiteView2 == null){
			seiteView2 = new SeiteViewImpl2();
		}
		return seiteView2;
	}

	@Override
	public SeiteView3 getSeiteView3() {
		if(seiteView3 == null){
			seiteView3 = new SeiteViewImpl3();
		}
		return seiteView3;
	}

	@Override
	public SeiteView4 getSeiteView4() {
		if(seiteView4 == null){
			seiteView4 = new SeiteViewImpl4();
		}
		return seiteView4;
	}

	@Override
	public SeiteView5 getSeiteView5() {
		if(seiteView5 == null){
			seiteView5 = new SeiteViewImpl5();
		}
		return seiteView5;
	}

	@Override
	public SeiteView6 getSeiteView6() {
		if(seiteView6 == null){
			seiteView6 = new SeiteViewImpl6();
		}
		return seiteView6;
	}

	@Override
	public SideView2 getFileView2(String id) {
		fileView2 = new SideViewImpl2(id);
		return fileView2;
	}

	@Override
	public SideView3 getFileView3(String id) {
		fileView3 = new SideViewImpl3(id);
		return fileView3;
	}

	@Override
	public SideView4 getFileView4(String id) {
		fileView4 = new SideViewImpl4(id);
		return fileView4;
	}


	

}
