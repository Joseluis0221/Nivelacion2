import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        String invertida = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }

        System.out.println("Cadena invertida: " + invertida);
    }
}

