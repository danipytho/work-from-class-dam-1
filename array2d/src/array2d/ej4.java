package array2d;



public class ej4 {
	public static void main(String[] args) {
		int nmas = 0;
		int nposi = 0;
		int [] numeros = new int [20]; 
		relllenararry(numeros);
		for (int i = 0; i < numeros.length; i++) {
			if (nmas < numeros[i]) {
			nposi =i;
			nmas =numeros[i];
			}
		}	
		numeros[0]=numeros[nposi];
		numeros[0]= nmas;
		for (int i = 0; i < numeros.length; i++) {
		System.out.print( numeros[i]+ " ");
		}
	}
		public static void relllenararry(int []num ){
			
				
				
		 for (int i = 0; i < num.length; i++) {
		     int randomNumber = (int) Math.floor(Math.random() * (100 - 0) + 0);
		     num[i] = randomNumber;
		     
		     
			}
		
	}

}
