package de.mgwt.dubravko.client.disclaimer;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;


public class DisclaimerWidget extends Composite{

	LayoutPanel widget;
	Label disclaimerLabel;
	
	public DisclaimerWidget() {
		
		widget = new LayoutPanel();
		widget.setStyleName("disclaimerPanel");
		
		disclaimerLabel = new Label();
//		disclaimerLabel.setStyleName("disclaimerLabel");
		HTML htmlText = new HTML();
		htmlText.setStyleName("disclaimerLabel");
		htmlText.setHTML("Die Gesundheit ist unser h&ouml;chstes Gut!<br> Gehen Sie "+
				"sorgf&auml;ltig damit um!<br>Die Hom&ouml;opathie bietet eine sanfte Hilfe um mit "+
				"Erkrankungen zu &uuml;berwinden, durch sie zu wachsen.<br>");
		
		
		widget.add(htmlText);
		initWidget(widget);
	}
	
}
