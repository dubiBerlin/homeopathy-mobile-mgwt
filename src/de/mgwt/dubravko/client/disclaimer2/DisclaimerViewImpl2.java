package de.mgwt.dubravko.client.disclaimer2;

import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.Button;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;

public class DisclaimerViewImpl2 implements DisclaimerView2{

	LayoutPanel mainPanel;
	Button disclaimerButton;
	
	public DisclaimerViewImpl2() {
		mainPanel = new LayoutPanel();
		DisclaimerWidget2 disclaimerWidget = new DisclaimerWidget2();
		
		mainPanel.add(disclaimerWidget);
		
		disclaimerButton = new Button("Gelesen");
		disclaimerButton.setImportant(true);
		mainPanel.add(disclaimerButton);
		
	}

	@Override
	public Widget asWidget() {
		return mainPanel;
	}

	@Override
	public Button getDisclaimerButton2() {
		return disclaimerButton;
	}

}
