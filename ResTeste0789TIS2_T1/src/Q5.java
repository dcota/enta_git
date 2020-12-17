import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nMes=0;
		System.out.print("Introduza o número do mês: ");
		nMes = in.nextInt();
		System.out.println("O mês é " + diaMes(nMes));
		System.out.println("\n");
		in.close();
	}
	
	public static String diaMes(int n) {
		String nomeMes="";
		switch(n) {
			case 1 :
				nomeMes="Janeiro";
				break;
			case 2 :
				nomeMes="Fevereiro";
				break;
			case 3 :
				nomeMes="Março";
				break;
			case 4 :
				nomeMes="Abril";
				break;
			case 5 :
				nomeMes="Maio";
				break;
			case 6 :
				nomeMes="Junho";
				break;
			case 7 :
				nomeMes="Julho";
				break;
			case 8 :
				nomeMes="Agosto";
				break;
			case 9 :
				nomeMes="Setembro";
				break;
			case 10 :
				nomeMes="Outubro";
				break;
			case 11 :
				nomeMes="Novembro";
				break;
			case 12 :
				nomeMes="Dezembro";
				break;
		}
		return nomeMes;
	}

}
