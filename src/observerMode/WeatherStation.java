/**
 * 
 */
package observerMode;

/**
 * @author archangelys
 *
 */
public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherDate weatherDate = new WeatherDate();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherDate);
		weatherDate.setMeasurements(80, 65, 30.4);
		weatherDate.setMeasurements(85, 78, 29.2);
		weatherDate.setMeasurements(82, 68, 23.6);
	}

}
