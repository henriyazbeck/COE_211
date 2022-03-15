import java.util.Scanner;

public class Calculator {
	
	private int num1;
    private int num2;
    private String operator, s;
    Scanner scanCalc = new Scanner(System.in);
    
    public Calculator() {
    	System.out.println("Input the first number: ");
    	num1 = scanCalc.nextInt();
    	
    	System.out.println("Enter the operator: ");
    	operator = scanCalc.next();
    	
    	System.out.println("Input the second number: ");
    	num2 = scanCalc.nextInt();
    	
    	
    	
    	switch (operator) {
    	case "+" : 
    		add(num1, num2);
    		System.out.println(s);
    	    break;
    	    
    	case "-" : 
    		subtract(num1, num2);
    		System.out.println(s);
    	    break;
    	    
    	case "*" : 
    		multiply(num1, num2);
    		System.out.println(s);
    	    break;
    	    
    	case "/" : 
    		divide(num1, num2);
    		System.out.println(s);
    		break;
    		
    	default : System.out.println("operator not valid");	
    		
    	}
    	     
    	       
    }
    public String add(int a, int b) {
        
        operator = "+";
    	num1 = a;
    	num2 = b;
    	int result = num1+num2;
    	
        s = num1 + operator + num2 + "=" + result;
    	return s;
    }

    public String subtract(int a, int b) {
        
    	
    	operator = "-";
    	num1 = a;
    	num2 = b;
    	int result = num1-num2;
    	
    	s = num1 + operator + num2 + "=" + result;
    	return s;
    }

    public String multiply(int a, int b) {
       
    	
    	operator = "*";
    	num1 = a;
    	num2 = b;
    	int result = num1*num2;
    	
    	s= num1 + operator + num2 + "=" + result;
    	return s;
    }

    public String divide(int a, int b) {
       
    	operator = "/";
    	num1 = a;
    	num2 = b;
    	double result = num1/(double)num2;
    	
    	s= num1 + operator + num2 + "=" + result;
    	return s;
    }
 
    	
    
}

