package de.mgwt.dubravko.client.side3;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.widget.CellList;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;
import de.mgwt.dubravko.client.shared.LoadingXMLHelper;
import de.mgwt.dubravko.client.startseite.StartSeiteViewCell;

public class SideViewImpl3 implements SideView3{

	private LayoutPanel mainPanel;
	private HeaderButton headerBackButton;
	private CellList<String> cellList;	// CellList gerüsst
	private List<String> list;	
	
	public SideViewImpl3(String id) {
		Window.alert("SideViewImpl3 : "+id);
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
		LoadingXMLHelper loadOptionsFromXMLFile = new LoadingXMLHelper("Koerperdetails", id, null, list, cellList);
		
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
	public List<String> getOptionsInList3() {
		return list;
	}
	
	

}
