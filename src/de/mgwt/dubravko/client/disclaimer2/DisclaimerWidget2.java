package de.mgwt.dubravko.client.disclaimer2;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;


public class DisclaimerWidget2 extends Composite{

	LayoutPanel widget;
	Label disclaimerLabel;
	
	public DisclaimerWidget2() {
		
		widget = new LayoutPanel();
		widget.setStyleName("disclaimerPanel");
		
		disclaimerLabel = new Label();
//		disclaimerLabel.setStyleName("disclaimerLabel");
		HTML htmlText = new HTML();
		htmlText.setStyleName("disclaimerLabel");
		htmlText.setHTML(
				"Dieses Programm kann keine fachkundige Beurteilung des " +
				"Gesundheitszustandes und der Schwere einer Erkrankung ersetzen.<br>" +
				"Es ersetzt keinen Arztbesuch!");
		
		
		widget.add(htmlText);
		initWidget(widget);
	}
	
}
