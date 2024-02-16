package array2d;

import java.util.Random;
import java.util.Scanner;

public class ships2 {

	public static void main(String[] args) {
		char[][] grid1 = new char[11][11];
		char[][] grid2 = new char[11][11];
		int[][] bot = new int[11][11];
		fillGrids(grid1, grid2,bot);
		
		printGrid(grid1, grid2);
		shipsp(grid1, grid2);
		shipb(grid1, grid2, bot);
		shoot(grid1, grid2);
		shootb(grid1, grid2);
		
	}

	private static void shootb(char[][] grid1, char[][] grid2) {
		int[] arrayf1 = new int[121];
		int[] arrayf2 = new int[121];
		Random random = new Random();
		int f2 = random.nextInt(11); 
		
		
		int f1 = random.nextInt(11);
		for (int i = 0; i < arrayf1.length; i++) {
			arrayf1[i] = f1; 
        }
		for (int i = 0; i < arrayf1.length; i++) {
			arrayf1[i] = f2;
		}
		if (grid1[f1][f2] == '+') {
        	grid1[f1][f2] = 'x';
        	if (grid1[f1][f2] == '-') {
            	grid1[f1][f2] = '"';
		
		for (int i = 0; i < arrayf1.length; i++) {
			if(arrayf1[i] == f1) {
				f1 = random.nextInt(11);
			}
				
			}
			for (int i = 0; i < arrayf1.length; i++) {
				if(arrayf1[i] == f1) {
					f2 = random.nextInt(11);
				}
					
				}
        }
		
	            if (grid1[f1][f2] == '+') {
	            	grid1[f1][f2] = 'x';
	            }
		}
		// TODO Auto-generated method stub
		
	}

	private static void shipb(char[][] grid1, char[][] grid2, int[][] bot) {
		Random random = new Random();
	    int f3 = random.nextInt(4) + 2;
	    
		
		
	}

	private static void shipsp(char[][] grid1, char[][] grid2) {
		int[] numbers = new int[4];
		int[] f11 = new int[4];
		int[] f22 = new int[4];
		boolean fail = false;
		int index = 0;
		int f = 0;
		int i = 0;
		while (f != 5) {
			System.out.println(" deploy your ships ");
			System.out.println(
					" you have 1 of each ship aircraftcarrier 5 slots battleship 4 slots sub 3 slots suply ship 2 slots ");
			System.out.println(" what lenth of ships do you want ");
			Scanner sc = new Scanner(System.in);
			int f3 = sc.nextInt();
			if (f3 < 6 && f3 > 1) {
				
			
				for (int i1 = 0; i1 < i1; i1++) {
					
					numbers[i1] = f3;
					if (numbers[i1] == f3) {
						fail = true;
						break;
					}
					if (!fail && index < 5) {
						numbers[index] = f3;
						index++; 
					} else if (fail) {
						System.out.println("you have alredy placed this boat");
					} else {
						System.out.println("you have place all your ships");
					}	
				}
				while (f3 != 0) {
					System.out.println("place your ships ships");
					int f1 = sc.nextInt();
					int f2 = sc.nextInt();
					if ((f1 == f1+2) || (f2 == f2+2) || (f1 == f1-2) || (f2 == f2-2)) {
						System.out.println(" sip placment not valid ");

					} else {

						grid1[f1][f2] = '+';
						if (i >= 0 && i < f11.length) {
							f1 = f11[i];

						}
						if (i >= 0 && i < f22.length) {
							f2 = f22[i];
						}

					}
					f3--;
					i++;
				}

				printGrid(grid1, grid2);

			}	
			f++;
		}
	}

	private static void printGrid(char[][] grid1, char[][] grid2) {

		System.out.print("  ");
		for (int col = 0; col < grid1[0].length; col++) {
			System.out.printf("%2d ", col);
		}

		System.out.print("\t\t");

		System.out.print("  ");
		for (int col = 0; col < grid2[0].length; col++) {
			System.out.printf("%2d ", col);
		}
		System.out.println();

		for (int i = 0; i < grid1.length; i++) {

			System.out.printf("%2d", i);

			for (int j = 0; j < grid1[i].length; j++) {
				System.out.printf("%3s", grid1[i][j]);
			}

			System.out.print("\t\t");

			System.out.printf("%2d", i);
			for (int j = 0; j < grid2[i].length; j++) {
				System.out.printf("%3s", grid2[i][j]);
			}

			System.out.println(); //
		}
	}
	// TODO Auto-generated method stub

	private static void shoot(char[][] grid1, char[][] grid2) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" fire apon the enemy: ");
		int f1 = sc.nextInt();
		int f2 = sc.nextInt();
		int ship = 1;
		grid2[f1][f2] = '"';
		if (ship == 1) {
			grid2[f1][f2] = 'x';

		}
		printGrid(grid1, grid2);

	}

	public static void fillGrids(char[][] grid1, char[][] grid2, int[][] bot) {

		for (int i = 0; i < grid1.length; i++) {
			for (int j = 0; j < grid1[i].length; j++) {
				grid1[i][j] = '-';
				grid2[i][j] = '-';
				bot[i][j] = 0;

			}
		}

	}
}
