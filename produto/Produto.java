package produto;

class Produto {
	int codigo, estoque;
	String descricao;
	double preco_compra, preco_venda;

	Produto(int cod, String desc, double buy, double sell) {
		codigo = cod;
		descricao = desc;
		preco_compra = buy;
		preco_venda = sell;
	}
}
