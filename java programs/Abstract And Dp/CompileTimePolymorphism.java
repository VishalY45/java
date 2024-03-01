class Add {
	int a, b;

	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int getResult() {
		return a + b;
	}
}
class Mul {
	int a, b;
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int getResult() {
		return a * b;
	}
}
class Sub {
	int a, b;

	void setValue(int x, int y) {
		a = x;
		b = y;
	}

	int getResult() {
		return a - b;
	}
}

class Calculator {

	void performOperation(Add ad) {
		int result = ad.getResult();
		System.out.printf("Addition is %d\n", result);
	}

	void performOperation(Mul m) {
		int result = m.getResult();
		System.out.println("Multiplication is " + result);
	}

	void performOperation(Sub s) {
		int result = s.getResult();
		System.out.println("Substraction is " + result);
	}
}

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		Add ad = new Add();
		ad.setValue(10, 20);
		c.performOperation(ad);// call Add class method
		Mul m = new Mul();
		m.setValue(5, 4);
		c.performOperation(m);// call Mul Parameter version

		Sub s = new Sub();
		s.setValue(10, 5);
		c.performOperation(s);
	}
}
