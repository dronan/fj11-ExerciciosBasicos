
public class switchCase {
	public static void main (String [] args){
		int diaDaSemana = 5;
		switch(diaDaSemana){
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Ter�a");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sabado");
				break;
			default: // se n�o for nenhum desses:
				System.out.println("dia invalido");
				break;
		}
		
	}
}
