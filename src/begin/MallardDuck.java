package begin;

public class MallardDuck extends Duck {
	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuakeBehavior(new Quake());
	}
	
	public void display() {
		System.out.println("I'm a Mallard Duck!");
	}
}
