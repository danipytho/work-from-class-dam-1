package array;

public class array1 {
	public static void main(String[] args) {
		int [] numero = new int[5];
		// puede se cualquer cosa como una classe o un string
		//libro [] bibloteca = new libro [100];
		String [] string1 = new String [1050];
		
		numero[0]=38;
		numero[1]=384;
		numero[2]=8;
		numero[4]=45;
		System.out.println("elindic" + numero[2]);
		for(int i=0; i< numero.length;i++) {
			System.out.println("para inice "+i+" tiene "+ numero[i]);
			
		}
		
		
		for(int numeros :numero) {
			System.out.println("valor:"+numeros);
		}
	}

}


