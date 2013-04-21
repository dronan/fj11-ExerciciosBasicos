
public class While {
	public static void main (String[] args){
		
		int idade = 15;
		while (idade < 18){
			System.out.println("idade: "+idade);
			idade++;
			// ou idade = idade + 1;
		}
		
		int i = 0;
		while (i < 10){
			System.out.println(i);
			i++;
		}
		
		
		int f = 0;
		do { 
			System.out.println("valor de f: "+f);
			f++;
		} while (f < 10);
		
		
	}
}
