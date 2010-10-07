/**
 * 
 */
package org.ow2.proactive_grid_cloud_portal.client.presenter;

/**
 * @author naumanbadar
 * 
 */
public interface MonitorPresenter extends Presenter {

	void monitorRM();

	public interface Display extends Presenter.Display<MonitorPresenter> {
		void setMessage (String message);

	}
}
