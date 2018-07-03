package produto_estoque;

class Estoque {
  int codigo;
  Data data_cadastro, data_atualizacao;
  ArrayList<Produto> productos;
  
  Estoque(int cod, Date cad, Date upd, ArrayList<Produto> prod) {
  	codigo = cod;
		data_cadastro = cad;
		data_atualizacao = upd;
		productos = prod;
  }
}
