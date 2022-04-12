import java.util.Scanner;

	public class Grade {

		public static void main(String[] args) {
		int[] grades = new int[5];
		Scanner scan = new Scanner(System.in);
		int sum1 = 0;
				
		for(int i=0; i<5; i++) {
					
				System.out.println("Imput the grade of assignment "+(i+1));
						grades[i] = scan.nextInt();
					    sum1+=grades[i];
		}
		System.out.println("Imput the number of attended labs: ");
		int num2 = scan.nextInt();
			
		System.out.println("Imput the Midterm grade: ");
		int num3 = scan.nextInt();
			
		scan.close();
		double sum = ((double)sum1/5)*0.3;
		double sum2 = (double)num2/7*100*0.05;
		double sum3 = num3*0.3;
		int x = (int)((80-(sum+sum2+sum3))/0.35);
				
				
		System.out.println("Assignments (30%): "+(int)sum+"\nAttendance (5%): "+(int)sum2+"\n"+ "Midterm (30%): "+(int)sum3);
		System.out.println("You will need a grade of "+x+" over 100 on the final exam to get a B");
	}
}


