package com.mizaeldouglas.domain.cadastrosAlunos;

import com.mizaeldouglas.ConnectionFactory;
import com.mizaeldouglas.domain.alunos.Alunos;

import java.sql.Connection;
import java.util.Set;

public class AlunosService {

    private ConnectionFactory connection;

    public AlunosService(){
        this.connection = new ConnectionFactory();
    }

    public Set<Alunos> listarCadastroAlunos(){
        Connection conn = connection.recuperarConexao();
        return new AlunosDAO(conn).listar();
    }
    public void abrir(DadosAdicionarAlunos dadosAdicionarAlunos) {
        Connection conn = connection.recuperarConexao();
        new AlunosDAO(conn).salvar(dadosAdicionarAlunos);
    }


}
