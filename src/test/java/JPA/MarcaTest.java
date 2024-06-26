package JPA;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import JPA.dao.IMarcaDAO;
import JPA.dao.MarcaDAO;
import JPA.domain.Marca;

public class MarcaTest {
	
	private IMarcaDAO marcaDAO;
	
	public MarcaTest() {
		marcaDAO = new MarcaDAO();
	}
	
	@Test
	public void cadastrar() {
		Marca marca = new Marca();
		marca.setCodigo("COD1");
		marca.setNome("FIAT");
		marca = marcaDAO.cadastrar(marca);
		
		assertNotNull(marca);
		assertNotNull(marca.getId());
		
		marca = marcaDAO.excluir(marca);
		
	}
}

