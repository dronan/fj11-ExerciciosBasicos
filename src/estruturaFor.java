
public class estruturaFor {
	public static void main (String [] args){
		/*
		for (int i = 0; i < 10; i++){
			System.out.println(i + " - ola!!");
		}		
		
		
		int i3 = 5;
		int x3 = i3++; // retorna o valor antigo e incrementa
		System.out.println(x3);
		
		int i2 = 5;
		int x2 = ++i2; // retorna o valor incrementado
		System.out.println(x2);
		
		int y = 100;
		int x = 20;
		for (int i = x; i < y; i++){
			if (i % 19 == 0){
				System.out.println("Achei um numero divisivel por 19 entre x e y: "+i);
				break;
			}
		}
		*/
		for (int i = 0; i < 100; i++){
			if (i > 50 && i < 60){
				continue;
			}
			System.out.println(i);
		}
		
		int a;
		for (a = 0; a < 10; a++){
			continue;
		}
		System.out.println(a);
				
	}
}
