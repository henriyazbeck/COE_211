import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;  
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      // Create FileWriter & Scanner objects & y/n string
	  Scanner scan = new Scanner(System.in);
	  FileWriter f = new FileWriter(new File("Expenses.txt"));
	  Scanner scanf = new Scanner(new File("Expenses.txt"));
	  BufferedWriter b = new BufferedWriter(f);
	  PrintWriter p = new PrintWriter(b);
	  String name,purchase,answer, answer2;
	  double usd;
	  
	  
      // Start gathering information inside the loop you will start
	  do {
		  System.out.println("Imput your name: ");
		  name = scan.nextLine();
		  
		  System.out.println("What is your purchase: ");
		  purchase = scan.nextLine();
		  
		  
		  System.out.println("How much did you pay (in USD): ");
		  usd = scan.nextDouble();
		  scan.nextLine();
		  
		  p.println(name+" purchased "+purchase+" for "+usd+" US Dollars.");
		  
		  System.out.println("Would you like to log another purchase? (y/n): ");
		  answer = scan.nextLine();
		  
		 
		  
		  
	  }while(answer.equalsIgnoreCase("y"));
	  
		  System.out.println("Get off of ZoodMall!");
	  	  System.out.println("Would you like to read a summary of your purchases?(y/n): ");
	  	  answer2 = scan.nextLine();
	      scan.close();
          p.close();
	 
	  if(answer2.equalsIgnoreCase("y")){
		  String list;
		        while(scanf.hasNext()) {
		            list = scanf.nextLine();
		            System.out.println("" + list);
		            
		        }
		    }
	  }    
  }

