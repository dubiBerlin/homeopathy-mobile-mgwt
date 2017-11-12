package de.mgwt.dubravko.client.seite4;

import java.util.List;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.dialog.Dialogs;
import com.googlecode.mgwt.ui.client.widget.CellList;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;

import de.mgwt.dubravko.client.model.Heilmittel;


public class SeiteViewImpl4 implements SeiteView4{

	private LayoutPanel mainPanel;
	private CellList<Heilmittel> cellList;
	private HeaderButton headerBackButton;
	
	public SeiteViewImpl4() {
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
		
		cellList = new CellList<Heilmittel>(new ViewCell4());
		cellList.setRound(true);
		
		ScrollPanel scrollPanel = new ScrollPanel();
		scrollPanel.add(cellList);
		
		mainPanel.add(scrollPanel);
	}

	@Override
	public Widget asWidget() {
		System.out.println("asWidget");
		return mainPanel;
	}

	@Override
	public void render(List<Heilmittel> options) {
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

	@Override
	public void alertSomeStuff(String title, String text) {
		Dialogs.alert(title, text, null);
		
	}

}
