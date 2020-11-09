
public class Q3 {

	public static void main(String[] args) {
		checkDiv5(30);
	}
	
	public static void checkDiv5(int n) {
		System.out.print("[ ");
		for(int i=0; i<=n; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " ");	
			}
		}
		System.out.println("]\n");
	}
}
