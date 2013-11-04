package decoratorMode;

public class Moca extends Beverage {
	
	private Beverage beverage;
	
	public Moca (Beverage ab) {
		this.beverage = ab;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " with Moca";
	}

	@Override
	public String getCost() {
		// TODO Auto-generated method stub
		int cost = Integer.parseInt( beverage.getCost() );
		cost += 5;
		return Integer.toString(cost);
	}

}
