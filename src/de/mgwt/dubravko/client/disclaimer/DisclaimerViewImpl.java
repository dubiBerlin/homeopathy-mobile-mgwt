package de.mgwt.dubravko.client.disclaimer;

import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.Button;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;


public class DisclaimerViewImpl implements DisclaimerView{

	LayoutPanel mainPanel;
	Button disclaimerButton;
	
	public DisclaimerViewImpl() {
		mainPanel = new LayoutPanel();
		DisclaimerWidget disclaimerWidget = new DisclaimerWidget();
		
		mainPanel.add(disclaimerWidget);
		
		disclaimerButton = new Button("weiter");
		disclaimerButton.setRound(true);
		mainPanel.add(disclaimerButton);
		
	}

	@Override
	public Widget asWidget() {
		return mainPanel;
	}

	@Override
	public Button getDisclaimerButton() {
		return disclaimerButton;
	}

}
