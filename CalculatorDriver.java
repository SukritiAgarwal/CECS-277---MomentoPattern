package MOMENTOPATTERN;

/**Main class description*/
public class CalculatorDriver {
	/**This is main class
	 * @param args Empty array of String data type
	 * */
	public static void main(String[] args) {
		Calculator calculator = new CalculatorImp();
		calculator.setFirstNumber(10);
		calculator.setSecondNumber(100);
		System.out.println(calculator.getCalculationResult());
		
		PreviousCalculationToCareTaker memento = calculator.backupLastCalculation();
		calculator.setFirstNumber(17);
		calculator.setSecondNumber(-290);
		System.out.println(calculator.getCalculationResult());
		
		calculator.restorePreviousCalculation(memento);
		System.out.println(calculator.getCalculationResult());	
	}
}
