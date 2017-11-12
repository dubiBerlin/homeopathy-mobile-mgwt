package de.mgwt.dubravko.client.disclaimer;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;


public class DisclaimerPlace extends Place {

	public static class DisclaimerPlaceTokenizer implements PlaceTokenizer<DisclaimerPlace> {

		@Override
		public DisclaimerPlace getPlace(String token) {
			return new DisclaimerPlace();
		}

		public String getToken(DisclaimerPlace place) {
			return "";
		}

	}
	
}
