package pregunta4;

public class Beef extends SandwichDecorator {

	public Beef(Sandwich sandwich) {
		super(sandwich);
		this.ingrediente = "Beef";
	}
	
	@Override
    public String getIngrediente() {
        return String.format("%s, %s", sandwich.getIngrediente(), this.ingrediente);
    }
}
