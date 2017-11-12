package de.mgwt.dubravko.client.side2;

import java.util.List;
import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.HeaderPanel;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;

public interface SideView2 extends IsWidget{

	public HeaderButton getHeaderButton();
	public void render(List<String> options);
	public HasCellSelectedHandler getList();
	public HeaderPanel getHeaderPanel();
	public List<String> getOptionsInList2();
	
}
