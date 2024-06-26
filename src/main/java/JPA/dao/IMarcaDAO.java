package JPA.dao;

import JPA.domain.Marca;

public interface IMarcaDAO {

	Marca cadastrar(Marca marca);

	Marca excluir(Marca marca);

}
