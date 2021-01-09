import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nMes=0;
		System.out.print("Introduza o numero do mes: ");
		nMes = in.nextInt();
		if(nMes < 1 || nMes > 12) {
			System.out.println("Numero de mes invalido!");
		} else {
			System.out.println("O mes e " + diaMes(nMes));
			System.out.println("\n");
		}
		in.close();
	}
	
	public static String diaMes(int n) {
		String[] meses = 
			{"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", 
					"Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		return meses[n-1];
	}

	/*public static String diaMes(int nMes) {
		String nomeMes = null;
		switch(nMes) {
			case 1 :
				nomeMes="Janeiro";
				break;
			case 2 :
				nomeMes="Fevereiro";
				break;
			case 3 :
				nomeMes="Marco";
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
	}*/
}
