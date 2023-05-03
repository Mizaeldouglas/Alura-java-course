package com.mizaeldouglas.loja.dao;

import javax.persistence.EntityManager;

import com.mizaeldouglas.loja.modelo.Categoria;

public class CategoriaDAO {

	private EntityManager em;

	public CategoriaDAO(EntityManager em) {
		
		this.em = em;
	}
	
	public void cadastrar(Categoria categoria) {
		this.em.persist(categoria);
	}
	public void atualizar(Categoria categoria) {
		this.em.merge(categoria);
	}

	
	
	
	
	
	
	
}
