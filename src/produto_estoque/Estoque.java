package produto_estoque;

import java.util.ArrayList;

class Estoque {
    ArrayList<Produto> productos, prodVendidos;

    Estoque() {
        productos = new ArrayList<>();
        prodVendidos =  new ArrayList<>();
    }
    
    Estoque(ArrayList<Produto> prod, ArrayList<Produto> vend) {
        productos = prod;
        prodVendidos = vend;
    }
}
