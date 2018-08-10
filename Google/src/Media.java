import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		
		long inicio =System.currentTimeMillis();

		Scanner sc = new Scanner(System.in);
		int i, b = 0, num = 5;
		double suma = 0.0;
		System.out.println("Para terminar y obtener la media escribe 0");
		while (num != 0) {
			System.out.println("Ingresa un numero");
			num = sc.nextInt();
			suma = suma + num;
			b++;
		}
		System.out.println(suma / (b - 1));
		System.out.println("Tiempo transcurrido = " + (System.currentTimeMillis() - inicio) + " miliseconds");
		System.exit(0);
	}
}