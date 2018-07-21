package pregunta4;

public class Chicken extends SandwichDecorator {

	public Chicken(Sandwich sandwich) {
		super(sandwich);
		this.ingrediente = "Chicken";
	}
	
	@Override
    public String getIngrediente() {
        return String.format("%s, %s", sandwich.getIngrediente(), this.ingrediente);
    }
}
