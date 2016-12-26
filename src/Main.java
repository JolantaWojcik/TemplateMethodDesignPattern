
public class Main {

	public static void main(String[] args) {
		//http://www.newthinktank.com/2012/10/template-method-design-pattern-tutorial/
		
		Espresso es = new Espresso();
		es.makeCoffee();
		System.out.println("####");
		WhiteCoffee wc = new WhiteCoffee();
		wc.makeCoffee();

	}

}
