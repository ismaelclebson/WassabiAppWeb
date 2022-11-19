package com.wassabi.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ClienteApp {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAwassabi"); 
		EntityManager em = emf.createEntityManager(); 
		EntityTransaction tx = em.getTransaction(); 
		tx.begin();
		
		
		Cliente cliente = new Cliente("Maria Faria", "4877854", "Passagem Lucena, 99", "452785246", "91988745784");
		//em.persist(cliente);
		//Cliente clienteLocalizado = em.find(Cliente.class,2);
		//clienteLocalizado.setClienteCpf("00000000");
		//em.merge(clienteLocalizado);
		//cliente.setClienteTelefone("91988990005");
		//cliente.setClienteCpf(0204);
		//TypedQuery<Cliente> clienteQuery = em.createQuery("from Cliente", Cliente.class);
        //List<Cliente> clientes = clienteQuery.getResultList();
        //clientes.forEach(cliente -> System.out.println(cliente.getNome()));
        //em.remove(clienteLocalizado);
    	em.persist(cliente);
		//em.persist(carlos);;
		//em.merge(cliente);
    	
    	tx.commit();
    	
		
	}

}
