import java.util.Scanner;

public class NumerosMultiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe dois n�meros: ");

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o m�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}

		sc.close();

	}

}
