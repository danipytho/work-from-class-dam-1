package array2d;

public class ej1 {
	public static void main(String[] args) {
		int [][] array1=new int[3][3];
		fillarray1(array1);
	}

		public static void fillarray1(int [][] matriz) {
			int counter = 1;
			for(int i=0; i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++) {
					
					matriz[i][j] = counter;
					counter++;
					System.out.print(matriz[i][j]+ " ");
				}
				System.out.println();
			}
		}
		
	}


