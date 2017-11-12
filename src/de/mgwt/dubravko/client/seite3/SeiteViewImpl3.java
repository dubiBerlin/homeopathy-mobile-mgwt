package de.mgwt.dubravko.client.seite3;

import java.util.List;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.CellList;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;

import de.mgwt.dubravko.client.startseite.StartSeiteViewCell;

public class SeiteViewImpl3 implements SeiteView3{

	private LayoutPanel mainPanel;
	private ScrollPanel scrollPanel;
	private CellList<String> cellList;
	private HeaderButton headerBackButton;
	
	public SeiteViewImpl3() {
		mainPanel = new LayoutPanel();
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.setCenter("Homeopathy - G.Gnielka");
		
		if(!MGWT.getOsDetection().isDesktop() && !MGWT.getOsDetection().isAndroid()){
			headerBackButton = new HeaderButton();
			headerBackButton.setBackButton(true);
			headerBackButton.setText("Back");
			headerPanel.setLeftWidget(headerBackButton);
		}
		
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
	public HeaderButton getHeaderBackButton() {
		return headerBackButton;
	}

}
