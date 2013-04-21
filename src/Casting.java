
public class Casting {
	public static void main(String[] args) {
		
		
		// Assim apresenta erro
		// * 
		//int d = 3.55;
		//double i = d;
		//System.out.println(i);
		//
		//Para corrigir deve ser feito o casting, declarar o tipo a ser convertido entre parenteses e depois o nome da variavel
				
		double d3 = 3.14;
		int i3 = (int) d3; // casting / arredondamento
		System.out.println(i3);
		
		long x = 10000;
		int z = (int) x;
		System.out.println(z);
		
		
		//float x = 0.0; assim não compila
		float x2 = 0.0f; // assim compila, ja que o f assume que o dado um float
		System.out.println(x2);
		
		double d = 5;
		float f = 3;
		float z2 = f + (float) d;
		System.out.println(z2);


		
	}
}
