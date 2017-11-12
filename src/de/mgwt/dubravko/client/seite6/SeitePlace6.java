package de.mgwt.dubravko.client.seite6;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class SeitePlace6 extends Place{

	
	private final String id;
//	private final String idVonSeite1;
//	private final String idVonSeite2;
	
//	public SeitePlace4(String id, String prevId1, String prevId2) {
//		System.out.println("seite4 place konstruktor 1");
//		this.id = id;
//		this.idVonSeite1 = prevId1;
//		this.idVonSeite2 = prevId2;
//	}
	
	public SeitePlace6(String id) {
//		System.out.println("seite4 place konstruktor 2");
		this.id = id;
//		this.idVonSeite1 = "";
//		this.idVonSeite2 = "";
	}
	
	public String getID(){
		return id;
	}
	
//	public String getidVonSeite1(){
//		return idVonSeite1;
//	}
//	
//	public String getidVonSeite2(){
//		return idVonSeite2;
//	}
	
	public static class SeitePlaceTokenizer6 implements PlaceTokenizer<SeitePlace6>{

		@Override
		public SeitePlace6 getPlace(String id) {
//			String aha = null;
//			String real = null;
			return new SeitePlace6(id);
		}

		@Override
		public String getToken(SeitePlace6 place) {
			return place.getID();
		}
		
	}
}
