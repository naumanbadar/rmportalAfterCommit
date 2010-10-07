package org.ow2.proactive_grid_cloud_portal.client.view;

import org.ow2.proactive_grid_cloud_portal.client.presenter.MonitorPresenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;

public class MonitorView extends AbstractView<MonitorPresenter> implements MonitorPresenter.Display{

	private static final Binder binder = GWT.create(Binder.class);

	interface Binder extends UiBinder<Widget, MonitorView> {
	}

	@UiField
	Button monitorButton;
	
	public MonitorView() {
		initWidget(binder.createAndBindUi(this));
	}

	@Override
	public void setMessage(String message) {
		// TODO Auto-generated method stub
		
	}


}
