package pregunta2;

public class DuplicateValuesExponentialStrategy implements DuplicateValuesStrategy {

	@Override
	public boolean hasDuplicated(int[] numbers) {
		System.out.println(ComplexityType.Exponential.toString() + " - hasDuplicates: TRUE");
		return true;
	}

}
