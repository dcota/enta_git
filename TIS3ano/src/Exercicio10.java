
public class Exercicio10 {

	public static void main(String[] args) {
		String str = "Roma me tem amor";
		str = str.replaceAll("\\s+", "");
		str = str.toLowerCase();
		if(checkPalindrome(str)) {
			System.out.println("A string \"" + str + "\" é palindromo");
		} else {
			System.out.println("A string \"" + str + "\" não é palindromo");
		}
	}
	
	static boolean checkPalindrome(String s) {
		boolean res = true;
		for(int i=0, j=s.length()-1; i<s.length()/2; i++, j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				res = false;
				break;
			}
		}
		return res;
	}
}
