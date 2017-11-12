package de.mgwt.dubravko.client.startseite;


import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class StartSeitePlace extends Place{

	public static class StartSeitePlaceTokenizer implements PlaceTokenizer<StartSeitePlace> {

		@Override
		public StartSeitePlace getPlace(String token) {
			return new StartSeitePlace();
		}

		public String getToken(StartSeitePlace place) {
			return "";
		}

	}
	
}
