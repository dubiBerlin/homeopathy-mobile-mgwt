package de.mgwt.dubravko.client.shared;

import java.util.List;
import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.NodeList;
import com.google.gwt.xml.client.XMLParser;
import com.googlecode.mgwt.ui.client.widget.CellList;
import com.googlecode.mgwt.ui.client.widget.ScrollPanel;

public class LoadingXMLHelper extends Composite {

	List<String> listOptions;
	
	public LoadingXMLHelper(String ordner, String xmlDatei, final List<String> keys, final List<String> list, final CellList<String> cellList){
		ScrollPanel scrollPanel = new ScrollPanel();
		System.out.println("LoadingXMLHelper uebergebener Ordner : "+ordner+"\nDatei : "+xmlDatei);
		listOptions = list;
		
		RequestBuilder builder = 
				new RequestBuilder(RequestBuilder.GET, GWT.getHostPageBaseURL()+""+ordner+"/"+xmlDatei+".xml");
		try{
			builder.sendRequest(null, new RequestCallback() {
				
				@Override
				public void onResponseReceived(Request request, Response response) {
					
					Document document = XMLParser.parse(response.getText());
					// greift auf Elternknoten zu -> <Babys>
				    Element elementRoot = (Element)document.getFirstChild();
				    
					if(keys==null){
						NodeList details = elementRoot.getElementsByTagName("Detail");
					    
					    for(int i = 0; i < details.getLength(); i++){
					    	listOptions.add(elementRoot
					    		.getElementsByTagName("Detail")
					    		.item(i)
					    		.getFirstChild()
					    		.getNodeValue());
					    		System.out.print(elementRoot
					    		.getElementsByTagName("Detail")
					    		.item(i)
					    		.getFirstChild()
					    		.getNodeValue());
					    }
					}
					if(keys!=null){
						/* wenn man sich auf Seite 4 befindet und die Daten aus dem Ordner Symptome */
						NodeList values = elementRoot.getElementsByTagName("value");
						
						/* List füllen für die Celllist */
						for(int i = 0; i < values.getLength(); i++){
							listOptions.add(elementRoot
						    		.getElementsByTagName("value")
						    		.item(i)
						    		.getFirstChild()
						    		.getNodeValue());
						}
						
						NodeList keysNode = elementRoot.getElementsByTagName("key");
						
						for(int i = 0; i < keysNode.getLength(); i++){
							keys.add(elementRoot
						    		.getElementsByTagName("key")
						    		.item(i)
						    		.getFirstChild()
						    		.getNodeValue());
						}
					}
					
					
				    
//System.out.println("erster KEy wert : "+document.getElementsByTagName("key").item(1).getFirstChild().getNodeValue());
				    
					
				    cellList.render(listOptions);
				    cellList.setRound(true);
				}
				
				@Override
				public void onError(Request request, Throwable exception) {
					Window.alert("Error : "+exception.getMessage());
				}
			});
		}catch(RequestException e){
			Window.alert("Unable to build the request.");
		}
		
		scrollPanel.add(cellList);
		initWidget(scrollPanel);
	}

	public List<String> getOptionsInList2() {
		return listOptions;
	}

	

	
	

}
