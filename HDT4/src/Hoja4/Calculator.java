package Hoja4;

public class Calculator implements ICalculator{
	private static Calculator instance = null;
	
	public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
		return instance;
	}

	public static void setInstance(Calculator instance) {
		Calculator.instance = instance;
	}
	
	@Override
	public float sum(float number1, float number2) {
		return number1+number2;
	}

	@Override
	public float substract(float number1, float number2) {
		return number1-number2;
	}

	@Override
	public float multiply(float number1, float number2) {
		return number1*number2;
	}

	@Override
	public float divition(float number1, float number2) {
		return number1/number2;
	}
}
