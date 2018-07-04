/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import produto_estoque.ControleEstoque;

/**
 *
 * @author Tião
 * @author Rauhann
 *
 */
public class Main {
    static ControleEstoque contEst;
    
    public static void main(String[]args) {
        new Window();
        contEst = new ControleEstoque();
    }
    
    public void inicializar() {
        contEst.cadastraProduto(1, 10, "Ceroula", 10, 20);
        contEst.cadastraProduto(2, 10, "Camisa", 10, 20);
        contEst.cadastraProduto(3, 10, "Gravata", 2.5, 5);
        contEst.cadastraProduto(4, 10, "Meias (par)", 1.25, 2.5);
        contEst.cadastraProduto(5, 10, "Calças", 50, 100);
        contEst.cadastraProduto(6, 10, "Colete", 50, 100);
        contEst.cadastraProduto(7, 10, "Sapatos (par)", 50, 100);
        contEst.cadastraProduto(8, 10, "Suspensório", 50, 100);
        contEst.cadastraProduto(9, 10, "Casaca", 50, 100);
        contEst.cadastraProduto(10, 10, "Cartola", 50, 100);
    }
}
