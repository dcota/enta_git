
public class Desafio2 {

	public static void main(String[] args) {
		double[] torres = { 3.0, 2.0, 3.5, 5.0, 4.0, 6.0, 6.5, 5.5, 7.5, 8.5, 8.0, 10.0, 9.5, 10.5, 11.0, 12.5, 11.5,
				13.0, 17.0, 13.5 };
		int especiais = 0;
		for (int i = 0; i < torres.length; i++) {
			int flag = 0;
			// verifica todas à esquerda
			for (int j = 0; j < i; j++) {
				if (torres[j] >= torres[i]) {
					flag = 1;
				}
			}
			// verifica todas à direita
			for (int j = i + 1; j < torres.length; j++) {
				if (torres[j] <= torres[i]) {
					flag = 1;
				}
			}
			if (flag == 0) {
				System.out.println("A torre " + (i + 1) + " é especial");
				especiais++;
			}
		}
		System.out.println("Torres especiais: " + especiais);
	}
}
