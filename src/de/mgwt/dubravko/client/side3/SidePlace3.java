package de.mgwt.dubravko.client.side3;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SidePlace3 extends Place{

	private final String id;
	
	public SidePlace3(String id) {
		this.id = id;
	}
	
	public String getID(){
		return id;
	}
	
	public static class SeitePlaceTokenizer3 implements PlaceTokenizer<SidePlace3>{

		@Override
		public SidePlace3 getPlace(String id) {
			return new SidePlace3(id);
		}

		@Override
		public String getToken(SidePlace3 place) {
			return place.getID();
		}
		
	}
}
