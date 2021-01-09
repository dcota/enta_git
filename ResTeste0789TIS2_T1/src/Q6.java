
public class Q6 {
	public static void main(String[] args) {
		String[] algarismos = 
			{ "zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove" };

		System.out.println(algarismos[0]); //6.1
		System.out.println(algarismos[algarismos.length-1]); //6.2
		System.out.println(algarismos.length); //6.3
		System.out.println(pos(algarismos,"quatro")); //6.4
	}
	
	public static int pos(String[] array, String algarismo) {
		int pos = -1; //se o algarismo nao for encontrado retorna -1
		for(int i=0; i<array.length; i++) {
			if(array[i].equals(algarismo)) {
				pos=i;
				break;
			}	
		}
		return pos;
	}

}

