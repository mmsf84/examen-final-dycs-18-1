package pregunta4;

public class SmallBreadSandwich extends Sandwich {
    
	public SmallBreadSandwich() {
		this.ingrediente = "Small Bread";
	}
	
	@Override
    public String make() {
        return "Small Bread";
    }

	@Override
	public String getIngrediente() {
		// TODO Auto-generated method stub
		return this.ingrediente;
	}
}
