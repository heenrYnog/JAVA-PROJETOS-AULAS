package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import dominio.Paciente;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Paciente pc1 = new Paciente (552935613,"Henry", "Jardim Tremebé", "11963864623", "08/04/2002", "Mecanico de aviões", "henry@gmail.com");
		Paciente pc2 = new Paciente (152234792,"João", "Avenida Cruzeiro", "11924566623", "08/02/1955", "Mecanico de Mobilete", "estudante25@fiap.com.br");
		Paciente pc3 = new Paciente (235553623,"Thug", "Avenida George Washington", "11923365666", "10/10/2002", "Carpinteiro", "carpinteirodazn@gmail.com");
		Paciente pc4 = new Paciente (452225777,"Josefino", "Avenida Parada Pinto", "11972864357", "10/10/2002", "Cantor", "josegrossodasilva@hotmail.com");
		Paciente pc5 = new Paciente (992995619,"Stronda", "Casa Maromba", "11976433322", "02/09/2003", "Bodybuilder", "blindao@outlook.com.br");
		
		
		em.getTransaction().begin();	
		em.persist(pc1);
		em.persist(pc2);
		em.persist(pc3);
		em.persist(pc4);
		em.persist(pc5);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		System.out.println(pc1);
		System.out.println(pc2);
		System.out.println(pc3);
		System.out.println(pc4);
		System.out.println(pc5);
		System.out.println("DEU CERTO!");
				
	}

}
