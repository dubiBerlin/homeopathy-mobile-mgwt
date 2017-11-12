package de.mgwt.dubravko.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;

import de.mgwt.dubravko.client.disclaimer.DisclaimerActivity;
import de.mgwt.dubravko.client.disclaimer.DisclaimerPlace;
import de.mgwt.dubravko.client.disclaimer2.DisclaimerActivity2;
import de.mgwt.dubravko.client.disclaimer2.DisclaimerPlace2;
import de.mgwt.dubravko.client.phoneGapTest.FileDisplayActivity;
import de.mgwt.dubravko.client.phoneGapTest.FileDisplayPlace;
import de.mgwt.dubravko.client.seite2.SeiteActivity2;
import de.mgwt.dubravko.client.seite2.SeitePlace2;
import de.mgwt.dubravko.client.seite3.SeiteActivity3;
import de.mgwt.dubravko.client.seite3.SeitePlace3;
import de.mgwt.dubravko.client.seite4.SeiteActivity4;
import de.mgwt.dubravko.client.seite4.SeitePlace4;
import de.mgwt.dubravko.client.seite5.SeiteActivity5;
import de.mgwt.dubravko.client.seite5.SeitePlace5;
import de.mgwt.dubravko.client.seite6.SeiteActivity6;
import de.mgwt.dubravko.client.seite6.SeitePlace6;
import de.mgwt.dubravko.client.side2.SideActivity2;
import de.mgwt.dubravko.client.side2.SidePlace2;
import de.mgwt.dubravko.client.side3.SideActivity3;
import de.mgwt.dubravko.client.side3.SidePlace3;
import de.mgwt.dubravko.client.side4.SideActivity4;
import de.mgwt.dubravko.client.side4.SidePlace4;
import de.mgwt.dubravko.client.startseite.StartSeiteActivity;
import de.mgwt.dubravko.client.startseite.StartSeitePlace;

public class PhoneActivityMapper implements ActivityMapper{

	private final ClientFactory clientFactory;

	public PhoneActivityMapper(ClientFactory clientFactory){
		this.clientFactory = clientFactory;
	}

	@Override
	public Activity getActivity(Place place) {
		if(place instanceof StartSeitePlace){
			return new StartSeiteActivity(clientFactory);
		}
		if(place instanceof DisclaimerPlace){
			return new DisclaimerActivity(clientFactory);
		}
		if(place instanceof DisclaimerPlace2){
			return new DisclaimerActivity2(clientFactory);
		}
		if(place instanceof SeitePlace2){
			return new SeiteActivity2(clientFactory);
		}
		if(place instanceof SeitePlace3){
			return new SeiteActivity3(clientFactory);
		}
		if(place instanceof SeitePlace4){
			return new SeiteActivity4(clientFactory);
		}
		if(place instanceof SeitePlace5){
			return new SeiteActivity5(clientFactory);
		}
		if(place instanceof SeitePlace6){
			return new SeiteActivity6(clientFactory);
		}
		if(place instanceof FileDisplayPlace){
			return new FileDisplayActivity(clientFactory);
		}
		if(place instanceof SidePlace2){
			return new SideActivity2(clientFactory);
		}
		if(place instanceof SidePlace3){
			return new SideActivity3(clientFactory);
		}
		if(place instanceof SidePlace4){
			return new SideActivity4(clientFactory);
		}
		return new StartSeiteActivity(clientFactory);
	}

}
