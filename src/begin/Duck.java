package begin;

/**
 * @author archangelys
 * An annimal
 */
public abstract class Duck {
	
	/**
	 * fly 
	 */
	private IFlyBehavior flyBehavior;
	
	/**
	 * quake
	 */
	private IQuakeBehavior quakeBehavior;
	
	/**
	 * @category Default Constructor
	 */
	public Duck() {
		
	}
	/**
	 * @param flyBehavior
	 */
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	/**
	 * @param quakeBehavior
	 */
	public void setQuakeBehavior(IQuakeBehavior quakeBehavior) {
		this.quakeBehavior = quakeBehavior;
	}

	/**
	 * perform fly method
	 */
	public void performFly() {
		flyBehavior.fly();
	}
	
	/**
	 * perform quake method
	 */
	public void performQuake() {
		quakeBehavior.quake();
	}
	
	/**
	 * swim, all duck know
	 */
	public void swim() {
		System.out.println("All ducks float, even decoys! ");
	}
	
	
	/**
	 * for inherit
	 */
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
