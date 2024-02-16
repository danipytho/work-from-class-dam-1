package array2d;

public class ej3 {
//50 1 first lane 
	public static void main(String[] args) {
		int [][] array1=new int[5][15];
		
		for(int i=0; i<array1.length;i++) {
			for(int j=0;j<array1[i].length;j++) {
				if((i==0)||(i==array1.length-1)||(j==0)||(j==array1[i].length-1)){
					array1[i][j] = 1;
				}else {
					array1[i][j] = 0;
				}
				
			}
			
			
		}
		
	}	
}
