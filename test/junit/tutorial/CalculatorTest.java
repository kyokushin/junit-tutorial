package junit.tutorial;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void multiply_successResult3x4() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
	}

	@Test
	public void multiply_successResult5x7() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multiply(5, 7);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void divide_successResult3_2(){
		Calculator calc = new Calculator();
		float extected = 1.5f;
		float actual = calc.divide(3, 2);
		assertThat(actual, is(extected));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void devide_exceptionThrowIllegalArgumentException(){
		Calculator calc = new Calculator();
		calc.divide(5, 0);
	}

}
