import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero");

		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}

		sc.close();
	}

}
