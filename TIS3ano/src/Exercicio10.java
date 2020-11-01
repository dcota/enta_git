import java.text.Normalizer;

public class Exercicio10 {

	public static void main(String[] args) {
		String s = "Amo Omã. Se Roma me tem amores, amo Omã!"; 
		String str = s;
		str = Normalizer.normalize(s,  Normalizer.Form.NFD);
		System.out.println(str);
		str = str.replaceAll("[\\p{InCombiningDiacriticalMarks}]", ""); //retirar acentuação
		str = str.replaceAll("\\p{Punct}", ""); //retirar pontuação
		str = str.replaceAll("\\s+", ""); //retirar espaços em branco
		str = str.toLowerCase(); //passa todos os caracteres para lowercase
		
		if(checkPalindromo1(str)) {
			System.out.println("A string \"" + s + "\" é palindromo");
		} else {
			System.out.println("A string \"" + s + "\" não é palindromo");
		}
	}
	
	//método para determinar palindromos
	static boolean checkPalindromo1(String s) {
		boolean res = true;
		for(int i=0, j=s.length()-1; i<s.length()/2; i++, j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				res = false;
				break;
			}
		}
		return res;
	}
	
	//método alternativo para determinar palindromos
	static boolean checkPalindromo2(String s) {
		boolean res = false;
		StringBuilder sb = new StringBuilder(s); 
		StringBuilder sReverse = sb.reverse(); 
		System.out.println(sReverse);
		if( s.toString().equals(sReverse.toString()) ) {
			res = true;
		} 
		return res;
	}
}
