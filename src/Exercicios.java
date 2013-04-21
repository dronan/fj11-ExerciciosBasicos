
public class Exercicios {
	public static void main (String [] args){
		/*
		int zero = 14 / 0.0;
		System.out.println(zero);
		
		double var = 1;
		int x = (int) var;
		System.out.println(x);
		
		int xis = 1;
		int i += xis;
		i--;
		System.out.println(i);
		*/
		
		/*
		
		//EX01)
		
		for (int i = 150; i <= 30; i++){
			System.out.println(i);
		}
		
		*/
		
		/*
		 *EX02
		 *		
		int somaTotal = 0;
		for (int i = 1; i <= 1000; i++){
			somaTotal += i; // colocar o += é = mesmo que repetir o nome da variavel anterior e adicionar (ou subtrair com -=) da variavel na repetição
		}
		System.out.println("Somatotal: "+ somaTotal);
		*/
	
		/*
		 * Ex03
		 *
		for (int i = 1; i <= 100; i++){
			if (i % 3 == 0 ){
				System.out.println(i +" é multiplo de "+ 3);
			}
		}
		*/
		

		/*
		 *Ex04 
		//fatorial de 1 a 10
		 		 
		for (int n = 1, fatorial = 1; n <= 10; n++){
			fatorial *= n;
			System.out.println(n+"! = "+fatorial);
		}
		*/
		
		
		//Ex05 
		//fatorial de 1 a 10
		/* 		 
		for (long n = 1, fatorial = 1; n <= 40; n++){
			fatorial *= n;
			System.out.println(n+"! = "+fatorial);
		}
		*/
		
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946…

		/*
		 * EX06
		
		long n1 = 1;
		long n2 = 1;
		long total = 0;
		
		for (long x = 0; x < 100; x++){
				System.out.print(total +",");	
				n2 = total;
				total = total + n1;
				n1 = n2;
				
				if (total > 100) 
					break;
		}
		
		 */
		
		/*
		 * EX07
		 
		int x = 13;
		int resultado = 0; 
		
		System.out.print(x +" - ");
		
		do {
			
			if (x % 2 == 0){
				resultado = x / 2; 
			}else{
				resultado = 3 * x + 1;
			}			
						
			x = resultado;
			System.out.print(resultado+" - ");
		}
		while (x > 1);
		*/
		
		/*
		 * EX08
		 */
		int resultado = 0;
		for (int x = 1; x < 10; x++){
			System.out.println("");
			for (int y = 1; y < x + 1; y++){
				resultado = x * y;
				System.out.print(resultado+" - ");
			}
		}
		
		
		
	}
}
