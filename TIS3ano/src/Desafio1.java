
public class Desafio1 {
	
	public static void main(String[] args) {
		int[] mensagem = {0,1,1,1,0};
		if(comparaTempestade(mensagem) == 0) {
			System.out.println("Mensagem recebida: Tempestade");
		} else {
			if (comparaTempestade(mensagem) == 1) {
				System.out.println("Possível mensagem recebida: Tempestade");
			}
		}
		if(comparaChuva(mensagem) == 0) {
			System.out.println("Mensagem recebida: Chuva");
		} else {
			if (comparaChuva(mensagem) == 1) {
				System.out.println("Possível mensagem recebida: Chuva");
			}
		}
		if(comparaNublado(mensagem) == 0) {
			System.out.println("Mensagem recebida: Nublado");
		} else {
			if (comparaNublado(mensagem) == 1) {
				System.out.println("Possível mensagem recebida: Nublado");
			}
		}
		if(comparaSol(mensagem) == 0) {
			System.out.println("Mensagem recebida: Sol");
		} else {
			if (comparaSol(mensagem) == 1) {
				System.out.println("Possível mensagem recebida: Sol");
			}
		}
	}
	
	public static int comparaTempestade(int[] array) {
		int[] tempestade = {1,1,1,1,1};
		int conta = 0;
		for(int i=0; i < array.length; i++) {
			if ( tempestade[i] != array[i] ) {
				conta++;
			}
		}
		return conta;
	}
	
	public static int comparaChuva(int[] array) {
		int[] chuva = {1,0,1,0,0};
		int conta = 0;
		for(int i=0; i < array.length; i++) {
			if ( chuva[i] != array[i] ) {
				conta++;
			}
		}
		return conta;
	}
	
	public static int comparaNublado(int[] array) {
		int[] nublado = {0,1,0,1,0};
		int conta = 0;
		for(int i=0; i < array.length; i++) {
			if ( nublado[i] != array[i] ) {
				conta++;
			}
		}
		return conta;
	}
	
	public static int comparaSol(int[] array) {
		int[] sol = {0,0,0,0,1,};
		int conta = 0;
		for(int i=0; i < array.length; i++) {
			if ( sol[i] != array[i] ) {
				conta++;
			}
		}
		return conta;
	}

}
