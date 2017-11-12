package de.mgwt.dubravko.client.side4;

import java.util.List;
import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;

public interface SideView4 extends IsWidget{

	public HeaderButton getHeaderBackButton();
	public void render(List<String> options);
	public HasCellSelectedHandler getList();
	public List<String> getOptionsInList4();
	public List<String> getKeys4();
	
}
