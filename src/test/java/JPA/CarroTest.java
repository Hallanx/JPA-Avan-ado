package JPA;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import JPA.dao.CarroDAO;
import JPA.dao.ICarroDAO;
import JPA.dao.IMarcaDAO;
import JPA.dao.MarcaDAO;
import JPA.domain.Carro;
import JPA.domain.Marca;

public class CarroTest {
	
	private ICarroDAO carroDAO;
	
	private IMarcaDAO marcaDAO;
	
	public CarroTest() {
		carroDAO = new CarroDAO();
		marcaDAO = new MarcaDAO();
	}
	
	@Test
	public void cadastrar() {
		Marca marca = criarMarca("COD1");
		
		Carro carro = new Carro();
		carro.setCodigo("COD1");
		carro.setModelo("MOBI");
		carro.setMarca(marca);
		carro = carroDAO.cadastrar(carro);
		
		assertNotNull(carro);
		assertNotNull(carro.getId());
		
		marca = marcaDAO.excluir(marca);
		carro = carroDAO.excluir(carro);
	}

	private Marca criarMarca(String codigo) {
		Marca marca = new Marca();
		marca.setCodigo(codigo);
		marca.setNome("FIAT");
		return marcaDAO.cadastrar(marca);
	}
}
