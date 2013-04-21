
public class labeledLoops {
	public static void main (String [] args){
		labeledExample:
			for (int i = 0; i < 100; i++){
				labeled2ndExample:
					for (int g = 0; g < 100; g++){
						if (g == 20){
							break labeledExample;
						}
						System.out.println(g+" - teste da variavel g, segundo for");
					}
			}
	}
}
