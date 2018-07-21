package pregunta2;

public class DuplicateValuesCuadraticStrategy implements DuplicateValuesStrategy {

	@Override
	public boolean hasDuplicated(int[] numbers) {
		System.out.println(ComplexityType.Cuadratic.toString() + " - hasDuplicates: TRUE");
		return true;
	}

}
