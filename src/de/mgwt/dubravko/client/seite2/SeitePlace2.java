package de.mgwt.dubravko.client.seite2;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SeitePlace2 extends Place{

	
	private final String id;
	
	public SeitePlace2(String id) {
		
		this.id = id;
	}
	
	public String getID(){
		return id;
	}
	
	public static class SeitePlaceTokenizer2 implements PlaceTokenizer<SeitePlace2>{

		@Override
		public SeitePlace2 getPlace(String id) {
			return new SeitePlace2(id);
		}

		@Override
		public String getToken(SeitePlace2 place) {
			return place.getID();
		}
		
	}
}
