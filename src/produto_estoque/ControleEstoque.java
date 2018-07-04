/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto_estoque;

/**
 *
 * @author RAUHANN
 */
public class ControleEstoque {

    Estoque estoque;

    public ControleEstoque() {
        estoque = new Estoque();
    }

    public ControleEstoque(Estoque est) {
        if(est== null) est = new Estoque();
        estoque = est;
    }

    /**
     * Os parámetros vêm do Limite.
     *
     */
    public void cadastraProduto(int cod, int qt, String desc, double buy, double sell) {
        Produto prod = new Produto(cod, qt, desc, buy, sell);
        
        estoque.productos.add(prod);
    }
}
