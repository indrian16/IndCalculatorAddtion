package indrian16.outlook.co.id.calculator;

public class ModelCalculator {
	
	private int numberValue;
	
	public int setAddition(int number1, int number2) {
		
		numberValue = number1 + number2;
		
		return numberValue;
		
	}
	
	public int getValueNumber() {
		
		return numberValue;
	}
	
}
