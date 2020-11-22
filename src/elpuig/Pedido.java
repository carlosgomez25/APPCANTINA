package elpuig;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private List<Producto> productoList = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
    }
}
