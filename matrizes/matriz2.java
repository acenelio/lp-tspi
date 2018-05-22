import java.util.Locale;
import java.util.Scanner;

public class matriz2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// 1 - LEITURA DOS DADOS
		int n = sc.nextInt();
		double[][] mat = new double[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}

		int linha = sc.nextInt();
		int coluna = sc.nextInt();
		
		// 2 - SOMA DOS POSITIVOS
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] > 0.0) {
					soma += mat[i][j];
				}
			}
		}	
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);

		// 3 - IMPRIMINDO A LINHA ESCOLHIDA
		System.out.print("LINHA ESCOLHIDA: ");
		for (int j=0; j<n; j++) {
			System.out.printf("%.1f ", mat[linha][j]);
		}
		System.out.println();
		
		// 4 - IMPRIMINDO A COLUNA ESCOLHIDA
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", mat[i][coluna]);
		}
		System.out.println();

		// 5 - IMPRIMINDO A DIAGONAL PRINCIPAL
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i=0; i<n; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}
		System.out.println();

		// 6 - ELEVANDO AO QUADRADO OS NUMEROS NEGATIVOS
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (mat[i][j] < 0.0) {
					mat[i][j] = Math.pow(mat[i][j], 2.0);
				}
			}
		}	
		System.out.println("MATRIZ ALTERADA:");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
