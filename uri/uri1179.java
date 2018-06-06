import java.util.Scanner;

public class uri1179 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 15;
		int[] P = new int[5];
		int[] I = new int[5];
		int posp = 0;
		int posi = 0;

		for (int i = 0; i < n; i++) {
			int valor = sc.nextInt();

			if (valor % 2 == 0) {
				P[posp] = valor;
				posp++;
			} else {
				I[posi] = valor;
				posi++;
			}

			if (posp == 5) {
				for (int j = 0; j < 5; j++) {
					System.out.println("par[" + j + "] = " + P[j]);
				}
				posp = 0;
			}

			if (posi == 5) {
				for (int j = 0; j < 5; j++) {
					System.out.println("impar[" + j + "] = " + I[j]);
				}
				posi = 0;
			}
		}

		for (int j = 0; j < posi; j++) {
			System.out.println("impar[" + j + "] = " + I[j]);
		}

		for (int j = 0; j < posp; j++) {
			System.out.println("par[" + j + "] = " + P[j]);
		}

		sc.close();
	}
}