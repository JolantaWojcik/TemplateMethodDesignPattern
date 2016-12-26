
public abstract class Coffee {
	// A Template Method Pattern contains a method that provides
	// the steps of the algorithm. It allows subclasses to override
	// some of the methods

	// This is the Template Method
	// Declare this method final to keep subclasses from
	// changing the algorithm
	public final void makeCoffee(){
		//obligatory
		addCoffee();
		addWater();
		
		//optional
		if(customerWantsMilk()){
			addMilk();
		}
		if(customerWantsSuggar()){
			addSuggar();
		}
	}

	 // These methods must be overridden by the extending subclasses
	abstract void addSuggar();
	abstract void addMilk();

	public void addWater() {
		 System.out.println("Water ");
	}

	public void addCoffee() {
		System.out.println("Coffee ");
	}
	// These are called hooks
	// If the user wants to override these they can
	// Use abstract methods when you want to force the user
	// to override and use a hook when you want it to be optional
	boolean customerWantsMilk() { return true; }
	boolean customerWantsSuggar() { return true; }

}
