package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");   // Interface que cria o entity manager específica para uma entidade.
		EntityManager em = emf.createEntityManager();  // dentro dele ele encapsula e conexao e a partir dai ele opera.
		Usuario novoUsuario = new Usuario ("Josinalda Alves", "josinalda.alves@gmail.com");		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();		
	}

}
