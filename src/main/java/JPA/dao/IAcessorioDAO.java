package JPA.dao;

import JPA.domain.Acessorio;

public interface IAcessorioDAO {

	Acessorio cadastrar(Acessorio acessorio);

	Acessorio excluir(Acessorio acessorio);

}
