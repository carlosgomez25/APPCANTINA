package elpuig;

import java.util.ArrayList;
import java.util.List;

public class ControlPedido {

    List<Pedido> pedidos = new ArrayList<>();

    void añadirPedido(int id, List<Producto> productos) {
        Pedido pedido = new Pedido();
        pedido.setId(id);
        pedido.setProductoList(productos);

    }
}



