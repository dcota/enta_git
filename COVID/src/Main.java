import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//questão 4
		Pessoa p1 = new Pessoa(123456789, 914762331, "João Borges", 34, false);
		Pessoa p2 = new Pessoa(659874537, 923659874, "Ana Santos", 40, false);
		Pessoa p3 = new Pessoa(965874568, 919987456, "Carlos Marques", 51, false);
		Pessoa p4 = new Pessoa(369871254, 923258796, "Manuel Borges", 65, false);
		Pessoa p5 = new Pessoa(111245897, 912254778, "Vítor Magalhães", 23, false);
		Pessoa p6 = new Pessoa(458796555, 923165894, "João Marques", 68, false);
		//questão 5
		ArrayList<Pessoa> pessoasTestadas = new ArrayList<Pessoa>();
		pessoasTestadas.add(p1);
		pessoasTestadas.add(p2);
		pessoasTestadas.add(p3);
		pessoasTestadas.add(p4);
		pessoasTestadas.add(p5);
		pessoasTestadas.add(p6);
		
		System.out.println("Número de pessoas no grupo de risco: " + verificaIdades(pessoasTestadas));
		
		printPessoas(pessoasTestadas);
		
		alteraResultado(pessoasTestadas, 965874568);
		
		printPessoas(pessoasTestadas);

	}
	
	//questão 6
	public static int verificaIdades(ArrayList<Pessoa> pessoas) {
		int contador=0;
		for(int i=0; i<pessoas.size(); i++) {
			if(pessoas.get(i).getIdade()>=65) {
				contador++;
			}
		}
		return contador;
	}
	
	//questão 7
	public static void alteraResultado(ArrayList<Pessoa> pessoas, int cc) {
		for(int i=0; i<pessoas.size(); i++) {
			if(pessoas.get(i).getCc() == cc) {
				pessoas.get(i).setResultado(true);
			}
		}
	}
	
	public static void printPessoas(ArrayList<Pessoa> pessoas) {
		for(int i=0; i<pessoas.size(); i++) {
			System.out.println("Nome: " + pessoas.get(i).getNome() + " | Resultado: " + pessoas.get(i).getResultado());
		}
	}

}
