package MOMENTOPATTERN;

/**Class description of CalculatorImp*/
public class CalculatorImp implements Calculator {
	private int firstNumber;
	private int secondNumber;

	/**Default constructor description*/
	public PreviousCalculationToCareTaker backupLastCalculation() {
		return new PreviousCalculationImp(firstNumber,secondNumber);
	}
	
	/**Getter method for calculation result
	 * @return result Int datatype*/
	public int getCalculationResult() {
		return firstNumber + secondNumber;
	}

	/**Method restores the last calculation
	 * @param memento Object of PreviousCalculationToCareTaker class*/
	public void restorePreviousCalculation(PreviousCalculationToCareTaker memento) {
		this.firstNumber = ((PreviousCalculationToOriginator)memento).getFirstNumber();
		this.secondNumber = ((PreviousCalculationToOriginator)memento).getSecondNumber();
	}

	/**Setter method for first number
	 * @param firstNumber Int dadatype*/
	public void setFirstNumber(int firstNumber) {
		this.firstNumber =  firstNumber;
	}

	/**Setter method for second number
	 * @param secondNumber Int datatype*/
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
}