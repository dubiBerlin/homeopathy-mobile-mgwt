package de.mgwt.dubravko.client.seite6;

import java.util.List;

import com.google.gwt.user.client.ui.IsWidget;
import com.googlecode.mgwt.ui.client.widget.HeaderButton;
import com.googlecode.mgwt.ui.client.widget.celllist.HasCellSelectedHandler;

import de.mgwt.dubravko.client.model.Heilmittel;

public interface SeiteView6 extends IsWidget{

	public HasCellSelectedHandler getList();
	
	public HeaderButton getHeaderBackButton();
	
	public void alertSomeStuff(String title, String text);

	void render(List<Heilmittel> options);
	
}
