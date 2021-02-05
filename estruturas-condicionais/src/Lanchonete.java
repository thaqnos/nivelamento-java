import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o código");

		int codigo = sc.nextInt();

		System.out.println("Informe a quantidade");
		
		int quantidade = sc.nextInt();
		
		double valor;

		if (codigo == 1) {
			valor = quantidade * 4;
			System.out.printf("Total: R$ %.2f", valor);
		} else if (codigo == 2) {
			valor = quantidade * 4.5;
			System.out.printf("Total: R$ %.2f", valor);
		} else if (codigo == 3) {
			valor = quantidade * 5;
			System.out.printf("Total: R$ %.2f", valor);
		} else if (codigo == 4) {
			valor = quantidade * 2;
			System.out.printf("Total: R$ %.2f", valor);
		} else if (codigo == 5) {
			valor = quantidade * 1.5;
			System.out.printf("Total: R$ %.2f", valor);
		}

		sc.close();

	}

}
