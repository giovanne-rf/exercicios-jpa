package modelo.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 3L);
		
		System.out.println(usuario.getNome());
	
		emf.close();
		em.close();
		
		System.out.println("o ID do usuário é "+ usuario.getId());

		
		
	}

}
