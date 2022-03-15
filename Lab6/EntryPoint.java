import java.util.*;
public class EntryPoint {

	public static void main(String[] args) {
		String str2;
		String str;
		boolean str3;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Which service would you like to use? \n" +
			           "[1]: Basic week visualizer \n"+
			           "[2]: Advanced week visualizer \n"+
			           "[3]: Basic Calculator \n" +
			           "[4]: Employee repertoire ");
			System.out.print("Imput here: ");
	        str = scan.nextLine() ;
	        
			
		switch (str) {
		
		case "1" : 
			BasicWeek b = new BasicWeek();
		    b.printDays();
			break;
			
		case "2" : 
			AdvancedWeek a = new AdvancedWeek();
		    a.printDays();
			break;
			
		case "3" : 
			Calculator c = new Calculator();
			
			break;
			
		case "4" : 
			Employee e = new Employee();
			e.printInfo();
			break;
		
		default : System.out.println("Please make sure you pick a number between 1 and 4");	
		}
		
		System.out.print("\nWould you like to perform another operation? (y/n): ");
		
		str2 = scan.nextLine();
		str3 = str2.equalsIgnoreCase("y");
		System.out.println("\n");
		
		
		} while (str3 == true); 
    scan.close();
	}

}