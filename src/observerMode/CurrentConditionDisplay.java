/**
 * 
 */
package observerMode;

/**
 * @author archangelys
 *
 */
public class CurrentConditionDisplay implements IObserver, IDisplayElement {
	
	private double temperature;
	private double humidity;
	private double pressure;
	
	private ISubject weatherDate;
	
	/**
	 * @param weatherDate
	 */
	public CurrentConditionDisplay(ISubject weatherDate) {
		this.weatherDate = weatherDate;
		// Very Important! Here registered the observer 
		weatherDate.registerObserver(this);
	}
	
	/* (non-Javadoc)
	 * @see observerMode.IDisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("Current conditions: " + 
							temperature + "F degrees and " + 
							humidity + "% humidity and " + 
							pressure + " presuress");
	}

	/* (non-Javadoc)
	 * @see observerMode.IObserver#update(double, double, double)
	 */
	@Override
	public void update(double temp, double humidity, double pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
