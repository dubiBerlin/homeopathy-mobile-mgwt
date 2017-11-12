package de.mgwt.dubravko.client.startseite;

import java.util.List;

import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.widget.CellList;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;

public class StartSeiteViewImpl implements StartSeiteView{

	private LayoutPanel mainPanel;
	private CellList<String> cellList;
	private HeaderButton headerButtonToPhoneGap;
	
	public StartSeiteViewImpl() {
		
		mainPanel = new LayoutPanel();
		
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.setCenter("Homeopathy - G.Gnielka");
		headerButtonToPhoneGap = new HeaderButton();
		headerButtonToPhoneGap.setRoundButton(true);
		headerButtonToPhoneGap.setSize("100px", "");
		headerButtonToPhoneGap.setText("PhoneGap");
		headerButtonToPhoneGap.setForwardButton(true);
		headerPanel.setRightWidget(headerButtonToPhoneGap);
		
		mainPanel.add(headerPanel);
		
		cellList = new CellList<String>(new StartSeiteViewCell());
		cellList.setRound(true);
		
		ScrollPanel scrollPanel = new ScrollPanel();
		scrollPanel.add(cellList);
		
		mainPanel.add(scrollPanel);
	}

	@Override
	public Widget asWidget() {
		return mainPanel;
	}

	@Override
	public void render(List<String> options) {
		cellList.render(options);
		
	}

	@Override
	public HasCellSelectedHandler getList() {
		return cellList;
	}

	@Override
	public HeaderButton getHeaderToPhoneGapButton() {
		return headerButtonToPhoneGap;
	}

	
	


}
