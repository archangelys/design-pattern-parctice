package observerMode;

/**
 * @author archangelys
 *
 */
public interface ISubject {

	/**
	 * @param observer
	 */
	public void registerObserver(IObserver observer);
	
	/**
	 * @param observer
	 */
	public void removeObserver(IObserver observer);
	
	/**
	 * notify all observers
	 */
	public void notifyObserver();
	
	
	
}
