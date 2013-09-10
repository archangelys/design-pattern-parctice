package DecoratorMode;

public class BeverageHourse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage baverage = new Coffe();
		baverage = new Latin(baverage);
		baverage = new Moca(baverage);
		System.out.println(baverage.getDescription());
		System.out.println(baverage.getCost());
	}

}
