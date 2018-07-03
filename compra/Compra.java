package compra;

import produto.Produto;

class Compra {
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
