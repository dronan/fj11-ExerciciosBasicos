
public class BalancoTrimestral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		System.out.println(gastosTrimestre);
		int mediaMensal = (gastosJaneiro + gastosFevereiro + gastosMarco)/3;
		System.out.println("valor da media mensal = "+mediaMensal);
			
	}

}
