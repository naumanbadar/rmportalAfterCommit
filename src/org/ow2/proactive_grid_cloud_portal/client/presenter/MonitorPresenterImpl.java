/**
 * 
 */
package org.ow2.proactive_grid_cloud_portal.client.presenter;

import org.ow2.proactive_grid_cloud_portal.client.ResourceManagerServiceAsync;
import org.ow2.proactive_grid_cloud_portal.client.presenter.ResourceManagerPresenter.Display;
import org.ow2.proactive_grid_cloud_portal.shared.state.ResourceManagerState;

import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;

/**
 * @author naumanbadar
 *
 */
public class MonitorPresenterImpl implements MonitorPresenter {

	
	private final ResourceManagerServiceAsync rpcService;
	private final HandlerManager eventBus;
	private final Display display;
	private final String sessionId;
	
	private ResourceManagerState state;
	
	
	/**
	 * @param rpcService
	 * @param eventBus
	 * @param display
	 * @param sessionId
	 */
	public MonitorPresenterImpl(final ResourceManagerServiceAsync rpcService, final HandlerManager eventBus, final Display display, final String sessionId) {
		super();
		this.rpcService = rpcService;
		this.eventBus = eventBus;
		this.display = display;
		this.sessionId = sessionId;
		this.display.setPresenter(this);
		
	}


	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(display.asWidget());
		
	}


	@Override
	public void monitorRM() {
		// TODO Auto-generated method stub
		
	}


}
