package pregunta4;

public class Turkey extends SandwichDecorator {

	public Turkey(Sandwich sandwich) {
		super(sandwich);
		this.ingrediente = "Turkey";
	}
	
	@Override
    public String getIngrediente() {
        return String.format("%s, %s", sandwich.getIngrediente(), this.ingrediente);
    }
}
