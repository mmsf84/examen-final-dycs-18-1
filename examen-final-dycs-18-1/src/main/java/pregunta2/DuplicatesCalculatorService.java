package pregunta2;

public class DuplicatesCalculatorService {

	DuplicateValuesStrategy duplicatesStrategy;

    public DuplicatesCalculatorService(DuplicateValuesStrategy duplicatesStrategy) {
        this.duplicatesStrategy = duplicatesStrategy;
    }

    public boolean calculaDuplicados(int[] numbers) {
        return duplicatesStrategy.hasDuplicated(numbers);
    }
}
