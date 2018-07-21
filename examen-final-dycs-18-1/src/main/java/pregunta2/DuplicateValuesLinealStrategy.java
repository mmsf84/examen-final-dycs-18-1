package pregunta2;

public class DuplicateValuesLinealStrategy implements DuplicateValuesStrategy {

	@Override
	public boolean hasDuplicated(int[] numbers) {
		System.out.println(ComplexityType.Lineal.toString() + " - hasDuplicates: TRUE");
		return true;
	}

}
