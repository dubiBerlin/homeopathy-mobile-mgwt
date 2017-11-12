package de.mgwt.dubravko.client.side4;

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

public class SideViewImpl4 implements SideView4{

	private LayoutPanel mainPanel;
	private HeaderButton headerBackButton;
	private CellList<String> cellList;	// CellList gerüsst
	private List<String> list;	
	private List<String>keys;
	private String ordner = "Symptome"; 
	
	public SideViewImpl4(String id) {
		
		mainPanel = new LayoutPanel();
		HeaderPanel headerPanel = new HeaderPanel();
		headerBackButton = new HeaderButton();
		headerBackButton.setText("Back");
		if(MGWT.getOsDetection().isIOs()){
			headerBackButton.setBackButton(true);
		}
		headerPanel.setLeftWidget(headerBackButton);
		cellList = new CellList<String>(new StartSeiteViewCell());
		list =  new ArrayList<String>();
		keys =  new ArrayList<String>();
		LoadingXMLHelper loadOptionsFromXMLFile = new LoadingXMLHelper(ordner, id, keys, list, cellList);
		
		mainPanel.add(headerPanel);
		mainPanel.add(loadOptionsFromXMLFile);	
	}

	@Override
	public Widget asWidget() {
		return mainPanel;
	}

	@Override
	public HeaderButton getHeaderBackButton() {
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
	public List<String> getOptionsInList4() {
		return list;
	}

	@Override
	public List<String> getKeys4() {
		return keys;
	}
	
	

}
