package de.mgwt.dubravko.client.side4;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SidePlace4 extends Place{

	private final String id;
	
	public SidePlace4(String id) {
		this.id = id;
	}
	
	public String getID(){
		return id;
	}
	
	public static class SeitePlaceTokenizer4 implements PlaceTokenizer<SidePlace4>{

		@Override
		public SidePlace4 getPlace(String id) {
			return new SidePlace4(id);
		}

		@Override
		public String getToken(SidePlace4 place) {
			return place.getID();
		}
		
	}
}
