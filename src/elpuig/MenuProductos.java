package elpuig;

import java.util.List;
import java.util.Scanner;

public class MenuProductos {
    private ControlProducto controlProducto;
    private Scanner scanner = new Scanner(System.in);
    // Funcion del menu de menu productos
    void main(ControlProducto controlProducto) {
        this.controlProducto = controlProducto;
        while (true) {
            // Imprimo el menu de productos
            System.out.println("1. Añadir producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Volver hacia atras");
            System.out.println("¿Que quieres hacer?");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                añadirProducto();
            } else if (opcion == 2) {
                eliminarProducto();
            } else if (opcion == 3) {
                break;
            }
        }
    }


    void añadirProducto(){
        int id = 0;
        System.out.println("Nombre del producto que quieres añadir");
        String nombre = scanner.nextLine();
        System.out.println("Precio del producto que quieres añadir");
        int precio = scanner.nextInt();
        scanner.nextLine();
        controlProducto.almacenarProducto(nombre, precio);
    }



    void eliminarProducto(){
        System.out.println("Pon el nombre del producto que quieres eliminar: ");
        String nombre = scanner.nextLine();
        boolean existeProducto = controlProducto.existeNombre(nombre);
        if (existeProducto == true) {
            controlProducto.eliminarProducto(nombre);
            System.out.println("Eliminado producto.");
        } else {
            System.out.println("El producto no existe.");
        }
    }


    void buscarProducto(){
        System.out.println("Pon el nombre del producto que quieres buscar: ");
        String nombre = scanner.nextLine();
        List<Producto> listProds = controlProducto.buscarProducto(nombre);
        for (int i = 0; i < listProds.size(); i++) {
            System.out.println(listProds.get(i).getNombre());
            System.out.println(listProds.get(i).getPrecio());
            System.out.println(listProds.get(i).getId());
        }
    }
}

