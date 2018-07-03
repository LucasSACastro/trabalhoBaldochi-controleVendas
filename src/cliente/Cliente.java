package cliente;

import compra.Compra;
import java.util.ArrayList;

class Cliente {
	String cpf, nome, endereco, email;
	ArrayList<Compra> compras;

	Cliente(String cpf, String nome, String endereco, String email, ArrayList<Compra> compras) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.compras = compras;
	}
}
