/**
 * 
 */
package begin;

/**
 * @author archangelys
 *
 */
public class MuteQuake implements IQuakeBehavior {

	/* (non-Javadoc)
	 * @see begin.IQuakeBehavior#quake()
	 */
	@Override
	public void quake() {
		System.out.println("<< Silence >>");
	}

}
