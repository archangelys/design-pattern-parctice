package DecoratorMode;

public class Latin extends Beverage {

	private Beverage beverage;
	
	public Latin (Beverage ab) {
		this.beverage = ab;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " with Latin";
	}

	@Override
	public String getCost() {
		// TODO Auto-generated method stub
		int cost = Integer.parseInt( beverage.getCost() );
		cost += 8;
		return Integer.toString(cost);
	}

}
