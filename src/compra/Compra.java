package compra;

import java.util.ArrayList;
import java.util.Date;
import produto_estoque.Produto;

public class Compra {

    int codigo, valor_total;
    Date data_emissao;
    ArrayList<Produto> produtos;

    Compra(int cod, int val, Date dat, ArrayList<Produto> prod) {
        codigo = cod;
        valor_total = val;
        data_emissao = dat;
        produtos = prod;
    }
}
