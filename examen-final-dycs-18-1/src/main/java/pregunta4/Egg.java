package pregunta4;

public class Egg extends SandwichDecorator {

	public Egg(Sandwich sandwich) {
		super(sandwich);
		this.ingrediente = "Egg";
	}
	
	@Override
    public String getIngrediente() {
        return String.format("%s, %s", sandwich.getIngrediente(), this.ingrediente);
    }
}
