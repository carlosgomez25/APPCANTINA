package elpuig;

import java.util.Scanner;

public class Main {
    private static ControlProducto controlProducto = new ControlProducto();
    public static void main(String[] args) {
        MenuProductos menuProductos = new MenuProductos();
        MenuPedidos menuPedidos = new MenuPedidos();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("##########################");
            System.out.println("# CANTINA PUIG CASTELLAR #");
            System.out.println("##########################");
            System.out.println("1. Productos");
            System.out.println("2. Pedidos");
            System.out.println("3. Salir");
            System.out.println("¿Que quieres hacer?");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    menuProductos.main(controlProducto);
                    break;
                case 2:
                    menuPedidos.main(controlProducto);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
