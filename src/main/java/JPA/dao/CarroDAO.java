package JPA.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import JPA.domain.Carro;

public class CarroDAO implements ICarroDAO {

	@Override
	public Carro cadastrar(Carro carro) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ProjetoCarros");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();		
		entityManager.persist(carro);	
		entityManager.getTransaction().commit();
		
		entityManager.clear();
		entityManagerFactory.close();
		
		return carro;
	}

	@Override
	public Carro excluir(Carro carro) {
		EntityManagerFactory entityManagerFactory = 
                Persistence.createEntityManagerFactory("ProjetoCarros");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
       
        entityManager.createNativeQuery("DROP TABLE IF EXISTS Carro CASCADE").executeUpdate();
      
        entityManager.getTransaction().commit();

        entityManager.clear();
        entityManagerFactory.close();
        
		return carro;
	}



}
