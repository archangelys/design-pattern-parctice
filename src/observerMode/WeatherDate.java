/**
 * 
 */
package observerMode;

import java.util.ArrayList;

/**
 * @author archangelys
 *
 */
public class WeatherDate implements ISubject {
	
	private ArrayList<IObserver> observers;
	private double temperature;
	private double humidity;
	private double pressure;
	
	public WeatherDate() {
		observers = new ArrayList<IObserver>();
	}
	
	/* (non-Javadoc)
	 * @see observerMode.ISubject#registerObserver(observerMode.IObserver)
	 */
	@Override
	public void registerObserver(IObserver observer) {
		observers.add(observer);
	}

	/* (non-Javadoc)
	 * @see observerMode.ISubject#removeObserver(observerMode.IObserver)
	 */
	@Override
	public void removeObserver(IObserver observer) {
		int position = observers.indexOf(observer);
		if (position >= 0) {
			observers.remove(position);
		}
	}

	/* (non-Javadoc)
	 * @see observerMode.ISubject#notifyObserver()
	 */
	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			IObserver observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	/**
	 * notify all observers when measurements changed
	 */
	public void measurementsChanged() {
		notifyObserver();
	}
	
	/**
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
