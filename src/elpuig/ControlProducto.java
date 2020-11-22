package elpuig;

import java.util.ArrayList;
import java.util.List;

public class ControlProducto {

    private List<Producto> productoList = new ArrayList<>();

    public List<Producto> getProductoList() {
        return productoList;
    }

    void almacenarProducto(String nombre, int precio) {
        Producto producto = new Producto();
        producto.setId(0);
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        // Meto el producto en la lista
        productoList.add(producto);
    }

    boolean existeNombre(String nombre) {
        boolean existe = false;
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getNombre().equals(nombre)) {
                existe = true;
            }
        }
        return existe;
    }

    void eliminarProducto(String nombre) {
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getNombre().equals(nombre)) {
                productoList.remove(productoList.get(i));
            }
        }
    }

    List<Producto> buscarProducto(String nombre){
        List<Producto>buscarProds = new ArrayList<>();
        for (int i = 0; i < productoList.size(); i++) {
            if (productoList.get(i).getNombre().equals(nombre)) {
                buscarProds.add(productoList.get(i));
            }
        }
        return buscarProds;
    }
}