package com.mizaeldouglas.loja.teste;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import com.mizaeldouglas.loja.dao.CategoriaDAO;
import com.mizaeldouglas.loja.dao.ProdutoDAO;
import com.mizaeldouglas.loja.modelo.Categoria;
import com.mizaeldouglas.loja.modelo.Produto;
import com.mizaeldouglas.loja.util.JPAUtil;

public class CadastroDeProduto {
	
	public static void main(String[] args) {
		cadastroDeProduto();
		Long id = 1l;
		
		EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDao = new ProdutoDAO(em);
        
        Produto p = produtoDao.buscarPorId(1l);
        System.out.println(p.getPreco());
        
        List<Produto> todos = produtoDao.buscarPorNomeDaCategoria("CELULARES");
        
        todos.forEach(p2 -> System.out.println(p2.getNome()));
		
        BigDecimal precoDoProduto = produtoDao.buscarPrecoDoProdutoComNome("Xiaomi Redmi");
        System.out.println("Preço do produto: " + precoDoProduto);
		
		
	}

	public static void cadastroDeProduto() {
        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares );

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDao = new ProdutoDAO(em);
        CategoriaDAO categoriaDao = new CategoriaDAO(em);

        em.getTransaction().begin();

        categoriaDao.cadastrar(celulares);
        produtoDao.cadastrar(celular);

        em.getTransaction().commit();
        em.close();
    }

	

}































