package de.mgwt.dubravko.client;

import com.google.gwt.place.shared.Place;
import com.googlecode.mgwt.mvp.client.Animation;
import com.googlecode.mgwt.mvp.client.AnimationMapper;

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
import de.mgwt.dubravko.client.startseite.StartSeitePlace;

public class PhoneAnimationMapper implements AnimationMapper {

	@Override
	public Animation getAnimation(Place oldPlace, Place newPlace) {
		//System.out.println("PhoneAnimationMapper");
		if(oldPlace instanceof StartSeitePlace && newPlace instanceof DisclaimerPlace){
			//System.out.println("PhoneAnimationMapper oldPlace instanceof NeueVokabelPlace && newPlace instanceof StartPlace");
			return Animation.POP;
		}
		if(oldPlace instanceof DisclaimerPlace2 && newPlace instanceof StartSeitePlace){
			//System.out.println("PhoneAnimationMapper oldPlace instanceof AlleVokabelnPlace && newPlace instanceof StartPlace");
			return Animation.POP_REVERSE;
		}
		if(oldPlace instanceof DisclaimerPlace && newPlace instanceof DisclaimerPlace2){
			return Animation.SLIDE;
		}
//		if(oldPlace instanceof StartSeitePlace && newPlace instanceof SeitePlace2){
//			return Animation.SLIDE;
//		}
//		if(oldPlace instanceof SeitePlace2 && newPlace instanceof StartSeitePlace){
//			return Animation.SLIDE_REVERSE;
//		}
//		if(oldPlace instanceof SeitePlace2 && newPlace instanceof SeitePlace3){
//			return Animation.SLIDE;
//		}
//		if(oldPlace instanceof SeitePlace3 && newPlace instanceof SeitePlace2){
//			return Animation.SLIDE_REVERSE;
//		}
//		if(oldPlace instanceof SeitePlace3 && newPlace instanceof SeitePlace4){
//			return Animation.SLIDE;
//		}
//		if(oldPlace instanceof SeitePlace4 && newPlace instanceof SeitePlace3){
//			return Animation.SLIDE_REVERSE;
//		}
//		if(oldPlace instanceof SeitePlace2 && newPlace instanceof SeitePlace4){
//			return Animation.SLIDE;
//		}
//		if(oldPlace instanceof SeitePlace4 && newPlace instanceof SeitePlace2){
//			return Animation.SLIDE_REVERSE;
//		}
//		if(oldPlace instanceof SeitePlace4 && newPlace instanceof SeitePlace5){
//			return Animation.SLIDE;
//		}
//		if(oldPlace instanceof SeitePlace5 && newPlace instanceof SeitePlace4){
//			return Animation.SLIDE_REVERSE;
//		}
//		if(oldPlace instanceof SeitePlace5 && newPlace instanceof SeitePlace6){
//			return Animation.SLIDE;
//		}
//		if(oldPlace instanceof SeitePlace6 && newPlace instanceof SeitePlace5){
//			return Animation.SLIDE_REVERSE;
//		}
//		if(oldPlace instanceof StartSeitePlace && newPlace instanceof FileDisplayPlace){
//			return Animation.DISSOLVE;
//		}
		if(oldPlace instanceof FileDisplayPlace && newPlace instanceof StartSeitePlace){
			return Animation.DISSOLVE_REVERSE;
		}
		if(oldPlace instanceof FileDisplayPlace && newPlace instanceof SidePlace2){
			return Animation.DISSOLVE;
		}
		if(oldPlace instanceof SidePlace2 && newPlace instanceof FileDisplayPlace){
			return Animation.DISSOLVE_REVERSE;
		}
		if(oldPlace instanceof SidePlace2 && newPlace instanceof SidePlace3){
			return Animation.DISSOLVE;
		}
		if(oldPlace instanceof SidePlace3 && newPlace instanceof SidePlace2){
			return Animation.DISSOLVE;
		}
		if(oldPlace instanceof SidePlace3 && newPlace instanceof SidePlace4){
			return Animation.DISSOLVE;
		}
		if(oldPlace instanceof SidePlace4 && newPlace instanceof SidePlace3){
			return Animation.DISSOLVE;
		}
		return Animation.SLIDE;
	}

}
