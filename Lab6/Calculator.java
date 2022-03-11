import java.util.Scanner;

public class Calculator {
	private int num1;
    private int num2;
    private String operator;
    
    
    public Calculator() {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Input the first number: ");
    	num1 = scan.nextInt();
    	System.out.print("Enter the operator");
    	operator = scan.next();
    	System.out.print("Input the second number: ");
    	num2 = scan.nextInt();
    	scan.close();
    	switch (operator) {
    	case "+" : add(num1, num2);
    	 break;
    	case "-" : subtract(num1, num2);
    	 break;
    	case "*" : multiply(num1, num2);
    	 break;
    	case "/" : divide(num1, num2);
    	}
    	     
    	       
    }
    public String add(int a, int b) {
        /**
         * Enter logic
         */
    	return a+"+"+operator+b = (a+"+"+b)
    	
    	int result = num1+num2;
    	System.out.println(num1 + "+" + num2 + "=" + result);
    	
    }

    public String subtract(int a, int b) {
        /**
         * Enter logic
         */
    	
    	int result = num1-num2;
    	System.out.println(num1 + "-" + num2 + "=" + result);
    }

    public String multiply(int a, int b) {
        /**
         * Enter logic
         */
    	
    	int result = num1*num2;
    	System.out.println(num1 + "*" + num2 + "=" + result);
    }

    public String divide(int a, int b) {
        /**
         * Enter logic
         */
    	
    	
    }

    }
}

