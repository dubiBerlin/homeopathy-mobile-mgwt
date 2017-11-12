package de.mgwt.dubravko.client.disclaimer2;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;


public class DisclaimerPlace2 extends Place {

	public static class DisclaimerPlaceTokenizer2 implements PlaceTokenizer<DisclaimerPlace2> {

		@Override
		public DisclaimerPlace2 getPlace(String token) {
			return new DisclaimerPlace2();
		}

		public String getToken(DisclaimerPlace2 place) {
			return "";
		}

	}
	
}
