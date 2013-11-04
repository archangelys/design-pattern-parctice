/**
 * 
 */
package begin;

/**
 * @author archangelys
 *
 */
public class FlyNoWay implements IFlyBehavior {

	/* 
	 * @see begin.IFlyBehavior#fly()
	 */
	@Override
	public void fly() {
		System.out.println("I can't fly!");
	}

}
