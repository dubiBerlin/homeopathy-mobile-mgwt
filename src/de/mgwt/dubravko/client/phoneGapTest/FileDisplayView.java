package de.mgwt.dubravko.client.phoneGapTest;

import java.util.List;
import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;

public interface FileDisplayView  extends IsWidget {

	public void render(List<String> options);
	public HasCellSelectedHandler getList();
	public List<String> getOptionsInList();
	
}
