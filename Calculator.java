package MOMENTOPATTERN;

/**Interface description*/
public interface Calculator {
	public PreviousCalculationToCareTaker backupLastCalculation();
	public void restorePreviousCalculation(PreviousCalculationToCareTaker memento);
		
	public int getCalculationResult();
	public void setFirstNumber(int firstNumber);
	public void setSecondNumber(int secondNumber);
}
