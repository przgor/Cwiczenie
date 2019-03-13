import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test1_add() {
		Calculator calculator = new Calculator();
		assertEquals(calculator.add(2,1),3);
		assertTrue(calculator.add(12.5, 0.6)==13.1);
	}
	
	@Test(expected=ArithmeticException.class)
	public void test2_add() {
		
		Calculator calculator1 = new Calculator();
		calculator1.add(Double.MAX_VALUE, Double.MAX_VALUE);
	}
	
	@Test(expected=ArithmeticException.class)
		public void test3_add() {
			Calculator calculator2 = new Calculator();
			calculator2.add(-2147483648, -1);
		}
	
	
	@Test(expected=ArithmeticException.class)
	public void test1_diff() {
		Calculator calculator = new Calculator();
		calculator.diff(2147483647, -1);
	}
	
	
	@Test(expected=ArithmeticException.class)
	public void test2_diff() {
		Calculator calculator = new Calculator();
		calculator.diff(-2147483648, 1);
	}
	
	@Test(expected=ArithmeticException.class)
	public void test3_diff() {
		Calculator calculator = new Calculator();
		calculator.diff(Double.MAX_VALUE, -Double.MAX_VALUE); 
	}
	
	//@Test(expected=ArithmeticException.class)
	//public void test4_diff() {
	//	Calculator calculator = new Calculator();
	//	calculator.diff(Double.MIN_VALUE, 1.0);
	//}
	
	@Test(expected=ArithmeticException.class)
	public void test1_mul() {
		Calculator calculator = new Calculator();
		calculator.mul(2147483647, 2); 
	}
	
	@Test(expected=ArithmeticException.class)
	public void test2_mul() {
		Calculator calculator = new Calculator();
		calculator.mul(2,-2147483648 ); 
	}
	
	@Test(expected=ArithmeticException.class)
	public void test3_mul() {
		Calculator calculator = new Calculator();
		calculator.mul(2,Double.MAX_VALUE ); 
	}
	
	@Test(expected=ArithmeticException.class)
	public void test4_mul() {
		Calculator calculator = new Calculator();
		calculator.mul(Double.MIN_VALUE,Double.MIN_VALUE ); 
	}
	
	
	@Test(expected=ArithmeticException.class)
	public void test1_div() {
		Calculator calculator = new Calculator();
		calculator.div(3,0 ); 
	}
	
	
	
	@Test(expected=ArithmeticException.class)
	public void test2_div() {
		Calculator calculator = new Calculator();
		calculator.div(Double.MAX_VALUE,Double.MIN_VALUE ); 
	}
	
	@Test(expected=ArithmeticException.class)
	public void test3_div() {
		Calculator calculator = new Calculator();
		calculator.div(Double.MAX_VALUE,Double.MIN_VALUE ); 
	}
	
	
	
	
	
	
	
	
	
	}


