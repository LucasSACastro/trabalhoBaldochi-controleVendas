package produto_estoque;

class Produto {
	int codigo, qtd;
	String descricao;
	double preco_compra, preco_venda;

	Produto(int cod, int qt, String desc, double buy, double sell) {
		codigo = cod;
		qtd = qt;
		descricao = desc;
		preco_compra = buy;
		preco_venda = sell;
	}
}
