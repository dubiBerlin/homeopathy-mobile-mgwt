package de.mgwt.dubravko.client.side2;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

/*
 * Place: 
 * */

public class SidePlace2  extends Place{

	private final String id;
	
	public SidePlace2(String id) {
		this.id = id;
	}
	
	public String getID(){
		return id;
	}
	
	public static class FilePlaceTokenizer1 implements PlaceTokenizer<SidePlace2>{

		@Override
		public SidePlace2 getPlace(String id) {
			return new SidePlace2(id);
		}

		@Override
		public String getToken(SidePlace2 place) {
			return place.getID();
		}
	}
}
