
public class Q6 {
	public static void main(String[] args) {
		String[] algarismos = 
			{ "zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove" };
		System.out.println(pos(algarismos,"um"));
	}
	
	public static int pos(String[] array, String algarismo ) {
		int pos=-1;//se o algarismo não for encontrado retorna -1
		for(int i=0; i<array.length; i++) {
			if(array[i].equals(algarismo)) {
				pos=i;
			}
		}
		return pos;
	}
}

