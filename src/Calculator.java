
public class Calculator {
	public static int add(int a, int b) {
        return a + b;
    }
	
	public static int subtract(int a, int b) {
	    return a - b;
	}
	
	public static int multiplication(int a,int b) {
		return a*b;
	}

	public static int division(int a,int b) {
		if(a>b) {
			return a/b;
		}
		else
			return b/a;
	}

    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication is :"+ multiplication(10,20));
        System.out.println("Quotent is :"+division(20,10));
		Sysout.Out.println("This made by bharath n");

    }
}
