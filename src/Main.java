import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[][] matriz = null;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            ejecutarOpcion(opcion);
        } while (opcion != 4);
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menu de Operaciones de Matriz ---");
        System.out.println("1. Crear matriz");
        System.out.println("2. Validar matriz");
        System.out.println("3. Mostrar fila solicitada por el usuario");
        System.out.println("4. Salir");
        System.out.print("Elija una opción: ");
    }

    public static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearMatrizAccion();
                break;
            case 2:
                validarMatrizAccion();
                break;
            case 3:
                mostrarFilaAccion();
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    public static boolean validarDatos(int m, int n) {
        return m > 0 && n > 0;
    }

    public static int[][] crearMatriz(int m, int n) {
        return new int[m][n];
    }

    public static void llenarMatrizConRandom() {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10); // Números entre 0 y 9
            }
        }
        System.out.println("Matriz llenada con números aleatorios entre 0 y 9.");
    }

    public static void mostrarFila(int fila) {
        if (matriz == null) {
            System.out.println("La matriz no se ha creado correctamente.");
        } else if (fila < 0 || fila >= matriz.length) {
            System.out.println("Fila no válida.");
        } else {
            System.out.print("Fila " + fila + ": ");
            for (int i = 0; i < matriz[fila].length; i++) {
                System.out.print(matriz[fila][i] + " ");
            }
            System.out.println();
        }
    }

    public static void crearMatrizAccion() {
        System.out.print("Ingrese el número de filas (m): ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int n = scanner.nextInt();

        if (validarDatos(m, n)) {
            matriz = crearMatriz(m, n);
            llenarMatrizConRandom();
        } else {
            System.out.println("Dimensiones no válidas. m y n deben ser mayores a 0.");
        }
    }

    public static void validarMatrizAccion() {
        if (matriz != null) {
            System.out.println("La matriz existe con dimensiones " + matriz.length + "x" + matriz[0].length);
        } else {
            System.out.println("La matriz no ha sido creada.");
        }
    }

    public static void mostrarFilaAccion() {
        if (matriz != null) {
            System.out.print("Ingrese el número de la fila que desea mostrar: ");
            int fila = scanner.nextInt();
            mostrarFila(fila);
        } else {
            System.out.println("La matriz no ha sido creada.");
        }
    }
}
