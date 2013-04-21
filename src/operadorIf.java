
public class operadorIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 15;
				
		if (idade < 18){
			System.out.println("Não pode entrar");			
		}else{
			System.out.println("Pode entrar");			
		}
		
		
		boolean amigoDoDono = true;
		if (idade < 18 && amigoDoDono == false){
			System.out.println("Não pode entrar");			
		}else{
			System.out.println("Pode entrar");			
		}
		
		if (idade < 18 && !amigoDoDono){ // o ! tras o "Not" para um boolean
			System.out.println("Não pode entrar");			
		}else{
			System.out.println("Pode entrar");			
		}	
		
		int mes = 1;
		if (mes == 1){
			System.out.println("Você deveria estar de ferias!!");
		}
		
		

	}

}
