package de.mgwt.dubravko.client.phoneGapTest;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.googlecode.mgwt.mvp.client.MGWTAbstractActivity;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedEvent;
import com.googlecode.mgwt.ui.client.widget.celllist.CellSelectedHandler;
import de.mgwt.dubravko.client.ClientFactory;
import de.mgwt.dubravko.client.side2.SidePlace2;


public class FileDisplayActivity extends MGWTAbstractActivity{

	private final ClientFactory clientFactory;
	
	public FileDisplayActivity(ClientFactory client){
		this.clientFactory = client;
	}
	
	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		final FileDisplayView view = clientFactory.getFileDisplayMGWT();
		panel.setWidget(view);
		addHandlerRegistration(view.getList().addCellSelectedHandler(new CellSelectedHandler() {
			public void onCellSelected(CellSelectedEvent event) {
				clientFactory.getPlaceController().goTo(new SidePlace2(view.getOptionsInList().get(event.getIndex())));
			}
		}));
	}

}
