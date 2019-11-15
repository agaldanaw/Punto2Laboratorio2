package headfirst.designpatterns.factory.pizzafm;

public class PaisaPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
    	if (item.equals("criolla")) {
        		return new PaisaPizzaEstiloCriollaPizza();
    	} else if (item.equals("casa")) {
    	    	return new PaisaPizzaEstiloCasaPizza();
    	} else return null;
}

}
