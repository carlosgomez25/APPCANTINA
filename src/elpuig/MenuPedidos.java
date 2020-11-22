package elpuig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPedidos {
    ControlProducto controlProducto;
    List<Producto> productoList;
    ControlPedido controlPedido = new ControlPedido();
    private Scanner scanner = new Scanner(System.in);
    void main(ControlProducto controlProducto){
        this.controlProducto = controlProducto;
        productoList = controlProducto.getProductoList();

        while (true) {
            System.out.println("1. Crear pedido");
            System.out.println("2. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                crearPedido();
            } else if (opcion == 2) {
                break;
            }
        }
    }

    void crearPedido() {
        List<Producto> productos = new ArrayList<>();
        System.out.println("Dime el nombre del producto: ");
        boolean existe = false;
        // Dime el nombre del producto
        String nombre = scanner.nextLine();
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getNombre().equals(nombre)) {
                productos.add(productoList.get(i));
                existe = true;
                System.out.println("Precio del producto: " + productoList.get(i).getPrecio());
            }
        }
        if (existe) {
            controlPedido.añadirPedido(0, productos);
            System.out.println("El producto ha sido agregado");
        } else {
            System.out.println("El producto no existe.");
        }
    }
}
