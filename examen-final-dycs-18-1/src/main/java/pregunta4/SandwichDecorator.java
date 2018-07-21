package pregunta4;

public class SandwichDecorator extends Sandwich {

	protected Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return sandwich.make();
    }

	@Override
	public String getIngrediente() {
		// TODO Auto-generated method stub
		return sandwich.getIngrediente();
	}
}
