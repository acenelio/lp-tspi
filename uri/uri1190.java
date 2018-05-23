import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = 12;
		double[][] mat = new double[n][n];
		
		char op = sc.next().charAt(0);
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		double soma = 0.0;
		int cont = 0;
		for (int j=0; j<n; j++) {
			for (int i=n-j; i<j; i++) {
				soma += mat[i][j];
				cont++;
			}
		}
		
		if (op == 'M') {
			soma = soma / cont;
		}
		
		System.out.printf("%.1f%n", soma);
		
		sc.close();
	}

}
