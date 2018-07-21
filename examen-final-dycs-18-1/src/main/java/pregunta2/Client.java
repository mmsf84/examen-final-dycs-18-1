package pregunta2;

public class Client {

    public static void main(String[] args) {
        
    	DuplicateValuesStrategy strategy;
    	DuplicatesCalculatorService calculatorService;
    	int[] numbers = { 1, 5, 7, 78, 9, 2, 24, 38, 78, 91, 96, 4, 6, 17, 101, 24, 38, 47, 37, 148, 2, 589};        
        boolean hasDuplicates;
        
        for (ComplexityType complexityType : ComplexityType.values()) {
            switch(complexityType) {
                case Lineal: 
                	strategy = new DuplicateValuesLinealStrategy();
                	calculatorService = new DuplicatesCalculatorService(strategy);
                    hasDuplicates = calculatorService.calculaDuplicados(numbers);
                    break;
                case Cuadratic: 
                	strategy = new DuplicateValuesCuadraticStrategy();
                	calculatorService = new DuplicatesCalculatorService(strategy);
                    hasDuplicates = calculatorService.calculaDuplicados(numbers);
                    break;
                case Exponential: 
                	strategy = new DuplicateValuesExponentialStrategy();
                	calculatorService = new DuplicatesCalculatorService(strategy);
                    hasDuplicates = calculatorService.calculaDuplicados(numbers);
                    break;
            }
        }
    }
}
