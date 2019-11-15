package headfirst.designpatterns.factory.pizzafm;

public class PaisaPizzaEstiloCriollaPizza extends Pizza  {

	public PaisaPizzaEstiloCriollaPizza()
	{
		name = "Pizza Criolla";
		dough = "Masa delgada";
		sauce = "Salsa pomodoro";
 
		toppings.add("Maiz tierno");
		toppings.add("Carne desmechada");
		toppings.add("Queso mozzarela");
	}
}
