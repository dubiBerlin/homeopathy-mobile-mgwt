package de.mgwt.dubravko.client.seite3;

import java.util.List;

import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;

public interface SeiteView3 extends IsWidget {

	public void render(List<String> options);
	
	public HasCellSelectedHandler getList();
	
	public HeaderButton getHeaderBackButton();
}
