package de.mgwt.dubravko.client.seite3;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SeitePlace3 extends Place{

	private final String id;
	
	public SeitePlace3(String id) {
		this.id = id;
	}
	
	public String getID(){
		return id;
	}
	
	public static class SeitePlaceTokenizer3 implements PlaceTokenizer<SeitePlace3>{

		@Override
		public SeitePlace3 getPlace(String id) {
			return new SeitePlace3(id);
		}

		@Override
		public String getToken(SeitePlace3 place) {
			return place.getID();
		}
		
	}
}
