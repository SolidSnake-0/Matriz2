import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();

        if (validarDimensiones(m, n)) {
            // Crear matriz si las dimensiones son válidas
            int[][] matriz = crearMatriz(m, n);
            System.out.println("Matriz creada con dimensiones " + m + "x" + n);
        } else {
            System.out.println("Dimensiones no válidas. m y n deben ser mayores a 0.");
        }
    }

    // Método para validar dimensiones

    public static boolean validarDimensiones(int m, int n) {
        return m > 0 && n > 0;
    }

    // Método para crear la matriz

    public static int[][] crearMatriz(int m, int n) {
        return new int[m][n];
    }
}
