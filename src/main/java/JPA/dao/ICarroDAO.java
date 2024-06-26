package JPA.dao;

import JPA.domain.Carro;

public interface ICarroDAO {
	
	public Carro cadastrar(Carro carro);

	public Carro excluir(Carro carro);

}
