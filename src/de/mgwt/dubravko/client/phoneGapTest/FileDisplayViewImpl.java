package de.mgwt.dubravko.client.phoneGapTest;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.NodeList;
import com.google.gwt.xml.client.XMLParser;
import com.googlecode.mgwt.ui.client.widget.CellList;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.LayoutPanel;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;

import de.mgwt.dubravko.client.shared.LoadingXMLHelper;
import de.mgwt.dubravko.client.startseite.StartSeiteViewCell;

public class FileDisplayViewImpl implements FileDisplayView{

	private ScrollPanel scrollPanel;
	private LayoutPanel mainPanel;
	private CellList<String> cellList;
	private List<String> list;
	
	public FileDisplayViewImpl() {
		
		HeaderPanel headerPanel = new HeaderPanel();
		headerPanel.setCenterWidget(new HTML("Homeopathy - G.Gnielka"));
		
		cellList = new CellList<String>(new StartSeiteViewCell());
		list =  new ArrayList<String>();
		LoadingXMLHelper isLoadingXMLFiles = new LoadingXMLHelper("koerper", "korperregionen", null, list, cellList);
		/*  Label wurde nicht hinzugefügt */
		mainPanel = new LayoutPanel();
		mainPanel.add(headerPanel);
		mainPanel.add(isLoadingXMLFiles);
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
	public List<String> getOptionsInList() {
		return list;
	}

}
