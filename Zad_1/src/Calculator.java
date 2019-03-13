
public class Calculator {

	
int add(int a,int b) {
		
		int wynik;
		wynik=a+b;
		if(wynik<0&&a>0&&b>0) {
			throw new ArithmeticException(" Wystapil overflow");
		}
		if(wynik>0&&a<0&&b<0) {
			throw new ArithmeticException("Wystapil underflow");
		}
		return wynik;
		
	}
	
double add(double a, double b) {
		
	double wynik;
	wynik=a+b;
	if (Double.isInfinite(wynik))
    {
        throw new ArithmeticException("Wystapil overflow");
    }
	return wynik;
	}
	
	int diff(int a, int b) {
		
		int wynik = a-b;
	    if (a<0&&b>0&&wynik>0)
	    {
	        throw new ArithmeticException("Wystapil underflow");
	    }
	    else if (a>0&&b<0&&wynik<0)
	    {
	        throw new ArithmeticException("Wystapil overflow");
	    }
	    return wynik;
	}
	
	double diff(double a, double b) {
		double wynik = a-b;
	    if (Double.isInfinite(wynik))
	    {
	        throw new ArithmeticException("Wystapil overflow");
	    }
	    
	    if (a<0&&b>0&&wynik==0)
	    {
	        throw new ArithmeticException("Wystapil underflow");
	    }

	    return a-b;
	}
	
	int mul(int a, int b) {
		int wynik = a*b;

	    if (a>0&&b>0&&wynik<0)
	    {
	        throw new ArithmeticException("Wystapil overflow");
	    }
	    if (a>0&&b<0&&wynik==0)
	    {
	        throw new ArithmeticException("Wystapil underflow");
	    }
	    return wynik;
	}
	
	double mul(double a, double b) {
		double wynik = a * b;
	    if (Double.isInfinite(wynik))
	    {
	        throw new ArithmeticException("Wystapil overflow");
	    }
	    
	    else if (a>0&&b>0&&wynik==0)
	    {
	        throw new ArithmeticException("Underflow");
	    }

	    return wynik;
	}
	
	
	int div(int a, int b) {
		int wynik = a/b;
	    if (b==0)
	    {
	        throw new ArithmeticException("Dividing by 0");
	    }
	    return a/b;
	}
	
	double div(double a, double b) {
		double wynik = a/b;
	    if (b==0)
	    {
	        throw new ArithmeticException("Dividing by 0");
	    }
	    else if(Double.isInfinite(wynik))
	    {
	        throw new ArithmeticException("Overflow");
	    }
	    else if (a>0&&b>0&&wynik==0)
	    {
	        throw new ArithmeticException("Underflow");
	    }
	       return a/b;
	}
}
