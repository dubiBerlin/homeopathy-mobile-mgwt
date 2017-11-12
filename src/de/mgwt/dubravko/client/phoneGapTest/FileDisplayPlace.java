package de.mgwt.dubravko.client.phoneGapTest;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class FileDisplayPlace  extends Place{

	private String helloName;
	
	public FileDisplayPlace(String token)
	{
		this.helloName = token;
	}

	public String getFileDisplayPlace()
	{
		return helloName;
	}
	
	public static class FileDisplayPlaceTokenizer implements PlaceTokenizer<FileDisplayPlace>
	{

		@Override
		public String getToken(FileDisplayPlace place)
		{
			return place.getFileDisplayPlace();
		}

		@Override
		public FileDisplayPlace getPlace(String token)
		{
			return new FileDisplayPlace(token);
		}

	}
	
}
