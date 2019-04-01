package MOMENTOPATTERN;

/**Class description of PreviousCalculationImp*/
public class PreviousCalculationImp implements PreviousCalculationToCareTaker,
											PreviousCalculationToOriginator {
	private int firstNumber;
	private int secondNumber;
	
	/**Overloaded constructor description
	 * @param firstNumber Int datatype
	 * @param secondNumber Int datatype*/
	public PreviousCalculationImp(int firstNumber, int secondNumber) {
		this.firstNumber =  firstNumber;
		this.secondNumber = secondNumber;
	}

	/**Getter method for first number
	 * @return firstNumber Int datatype*/
	public int getFirstNumber() {
		return firstNumber;
	}

	/**Getter method for second number
	 * @return secondNumber Int datatype*/
	public int getSecondNumber() {
		return secondNumber;
	}
}