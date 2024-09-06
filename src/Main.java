import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {
    public static MenuBar mbarra;
    public static int[][] matriz = null;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        InicializaMenus();
    }

    public static boolean validarDatos(int m, int n) {
        return m > 0 && n > 0;
    }

    public static int[][] crearMatriz(int m, int n) {
        return new int[m][n];
    }

    public static void mostrarFila(int fila) {
        if (matriz == null) {
            System.out.println("La matriz no se a creado correctamente.");
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

    public static void InicializaMenus() {
        Frame frame = new Frame("Menu de Operaciones de Matriz");
        mbarra = new MenuBar();
        Menu m = new Menu("Archivo");

        // Menu items
        MenuItem crearMatrizItem = new MenuItem("Crear matriz");
        MenuItem validarMatrizItem = new MenuItem("Validar matriz");
        MenuItem mostrarFilaItem = new MenuItem("Mostrar fila solicitada por el usuario");
        MenuItem salirItem = new MenuItem("Salir");

        m.add(crearMatrizItem);
        m.add(validarMatrizItem);
        m.add(mostrarFilaItem);
        m.addSeparator();
        m.add(salirItem);
        mbarra.add(m);
        frame.setMenuBar(mbarra);

        crearMatrizItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearMatrizAccion();
            }
        }