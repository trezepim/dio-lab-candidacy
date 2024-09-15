package candidacy;

import java.util.Scanner;

public class SelectionProcess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quant = 0;
		double baseSal = 1500;
		
		System.out.println("Enter the number of candidates: ");
		quant = sc.nextInt();

		String[] candidates = new String[quant];
		int[] salaries = new int[quant];
		
		for (int i = 0; i < candidates.length; i++) {
			System.out.println("Enter the name of the candidate " + (i+1) + ": ");
			candidates[i] = sc.next();
			
			System.out.println("Enter the desired salary of the candidate: " + (i+1) + ": ");
			salaries[i] = sc.nextInt();
			}
		
		for (int i = 0; i < candidates.length; i++) {
			if (baseSal > salaries[i]) {
				System.out.println("Call the candidate " + candidates[i]);
			}else if (baseSal == salaries[i]) {
				System.out.println("Call the candidate " + candidates[i] + " with a counter offer");
			}else {
				System.out.println(candidates[i] + " has to wait for results from other participants.");
			}
		}
		
		sc.close();
		}
	}