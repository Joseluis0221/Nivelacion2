import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;

        if (operacion == '+') {
            resultado = num1 + num2;
        } else if (operacion == '-') {
            resultado = num1 - num2;
        } else if (operacion == '*') {
            resultado = num1 * num2;
        } else if (operacion == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: División por cero.");
                return;
            }
        } else {
            System.out.println("Operación no válida.");
            return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
