
import java.util.Scanner;

	public class Employee {
	    // Initializing variables
	    private String firstName;
	    private String lastName;
	    private int age;
	    private double salary;

	    public Employee() {
	        // Get user input
	    	
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Please input the employee's first name:");
	        firstName = scanner.nextLine();
	        
	        System.out.print("Please input the employee's last name:");
	        lastName = scanner.nextLine();
	        
	        System.out.print("Please input the employee's age:");
	        age = scanner.nextInt();

	        System.out.print("Please input the employee's monthly salary:");
	        salary = scanner.nextDouble();
	        
	        }

	    public void printInfo() {
	        // insert logic for toString method
	    	
			System.out.println("Employee information: " + firstName + " " +
	    	lastName + ", " + age + ", " + salary);
	    }
	}

