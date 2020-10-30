package modelo.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ObterUsuarios {
	
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("exercicios-jpa");
	EntityManager em = emf.createEntityManager();
	
	String jpql =  "SELECT u FROM Usuario u"; // select u.* from u
	TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class); // usuario.class faz o refletion
	query.setMaxResults(10);
	
	List<Usuario> usuarios = query.getResultList();
	
	for (Usuario usuario: usuarios) {
		
		System.out.println("ID: " +  usuario.getId() + "- Nome: " + usuario.getNome()
		+ " - E-mail: " + usuario.getEmail());
		
	}
	em.close();
	emf.close();
	}

}
