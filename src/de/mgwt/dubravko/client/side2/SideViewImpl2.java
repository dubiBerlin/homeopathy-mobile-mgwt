package de.mgwt.dubravko.client.side2;

import java.util.ArrayList;
import java.util.List;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.CellList;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;
import de.mgwt.dubravko.client.shared.LoadingXMLHelper;
import de.mgwt.dubravko.client.startseite.StartSeiteViewCell;

public class SideViewImpl2 implements SideView2{

	private LayoutPanel mainPanel;
	private CellList<String> cellList;	// CellList gerüsst
	private List<String> list;			// Liste mit den ausgelesenen Strings
	private HeaderButton headerBackButton;
	private HeaderPanel headerPanel;
	private String xmlDatei;	// die XML Datei die im Ordner Koerperregion angesprochen werden soll
	private LoadingXMLHelper callXMLcontent;
	
	public SideViewImpl2(String id) {
		xmlDatei = id;
		mainPanel = new LayoutPanel();
		headerPanel = new HeaderPanel();
		headerBackButton = new HeaderButton();
		headerBackButton.setText("Back");
		if(MGWT.getOsDetection().isIOs()){
			headerBackButton.setBackButton(true);
		}
		headerPanel.setLeftWidget(headerBackButton);
		headerPanel.setCenter("Homeopathy - G.Gnielka");
		mainPanel.add(headerPanel);
		
		cellList = new CellList<String>(new StartSeiteViewCell());
		list =  new ArrayList<String>();
		
		callXMLcontent = new LoadingXMLHelper("Koerperregion", xmlDatei, null, list, cellList);
		mainPanel.add(callXMLcontent);
	}

	@Override
	public Widget asWidget() {
		return mainPanel;
	}

	@Override
	public HeaderButton getHeaderButton() {
		return headerBackButton;
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
	public HeaderPanel getHeaderPanel() {
		return headerPanel;
	}

	@Override
	public List<String> getOptionsInList2() {
		return list;
	}
	
	
}
