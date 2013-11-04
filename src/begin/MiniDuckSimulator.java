/**
 * 
 */
package begin;

/**
 * @author archangelys
 *
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.performFly();
		mallard.performQuake();
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.performFly();
	}

}
