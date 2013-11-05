/**
 * 
 */
package observerMode;

/**
 * @author archangelys
 *
 */
public interface IObserver {
	/**
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void update(double temp, double humidity, double pressure);

}
