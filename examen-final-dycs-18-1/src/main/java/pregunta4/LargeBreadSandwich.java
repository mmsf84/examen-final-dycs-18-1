package pregunta4;

public class LargeBreadSandwich extends Sandwich {
    
	public LargeBreadSandwich() {
		this.ingrediente = "Large Bread";
	}
	
	@Override
    public String make() {
        return "Large Bread";
    }
    @Override
	public String getIngrediente() {
		// TODO Auto-generated method stub
		return this.ingrediente;
	}
}
