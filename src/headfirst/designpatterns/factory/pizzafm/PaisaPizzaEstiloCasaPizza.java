package headfirst.designpatterns.factory.pizzafm;

public class PaisaPizzaEstiloCasaPizza extends Pizza 
{
	public PaisaPizzaEstiloCasaPizza()
	{
		name = "Pizza de la casa";
		dough = "Masa gruesa";
		sauce = "Salsa de la casa";
 
		toppings.add("Frijoles");
		toppings.add("Rodajas de aguacate");
		toppings.add("Carne molida");
		toppings.add("Chorizo");
		toppings.add("Cubos de queso Campesino");
		toppings.add("Queso mozzarela");
	}
}
