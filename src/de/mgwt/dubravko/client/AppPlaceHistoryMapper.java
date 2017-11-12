package de.mgwt.dubravko.client;


import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

import de.mgwt.dubravko.client.disclaimer.DisclaimerPlace;
import de.mgwt.dubravko.client.disclaimer2.DisclaimerPlace2;
import de.mgwt.dubravko.client.phoneGapTest.FileDisplayPlace;
import de.mgwt.dubravko.client.seite2.SeitePlace2;
import de.mgwt.dubravko.client.seite3.SeitePlace3;
import de.mgwt.dubravko.client.seite4.SeitePlace4;
import de.mgwt.dubravko.client.seite5.SeitePlace5;
import de.mgwt.dubravko.client.seite6.SeitePlace6;
import de.mgwt.dubravko.client.side2.SidePlace2;
import de.mgwt.dubravko.client.side3.SidePlace3;
import de.mgwt.dubravko.client.side4.SidePlace4;
import de.mgwt.dubravko.client.startseite.StartSeitePlace.StartSeitePlaceTokenizer;

@WithTokenizers({StartSeitePlaceTokenizer.class, DisclaimerPlace.DisclaimerPlaceTokenizer.class,
	DisclaimerPlace2.DisclaimerPlaceTokenizer2.class, SeitePlace2.SeitePlaceTokenizer2.class,
	SeitePlace3.SeitePlaceTokenizer3.class, SeitePlace4.SeitePlaceTokenizer4.class
	, SeitePlace5.SeitePlaceTokenizer5.class, SeitePlace6.SeitePlaceTokenizer6.class
	, FileDisplayPlace.FileDisplayPlaceTokenizer.class, SidePlace2.FilePlaceTokenizer1.class
	, SidePlace3.SeitePlaceTokenizer3.class, SidePlace4.SeitePlaceTokenizer4.class,
	
	})
public interface AppPlaceHistoryMapper extends PlaceHistoryMapper {
	
}
