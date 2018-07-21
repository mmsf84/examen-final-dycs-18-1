package pregunta4;

public class Bacon extends SandwichDecorator {

	public Bacon(Sandwich sandwich) {
		super(sandwich);
		this.ingrediente = "Bacon";
	}
	
	@Override
    public String getIngrediente() {
        return String.format("%s, %s", sandwich.getIngrediente(), this.ingrediente);
    }
}
