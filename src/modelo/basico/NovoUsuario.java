package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
	
	public static void main(String[] args) {
		 
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Antônio Cesar", "tonho.cesar@gmail.com");
		//novoUsuario.setId(2L);
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		System.out.println("Nome do Usuário: " + novoUsuario.getNome());
		
		em.close();
		emf.close();
	}
	
	

}
