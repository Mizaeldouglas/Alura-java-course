package com.mizaeldouglas.domain.cadastrosAlunos;

import com.mizaeldouglas.domain.alunos.Alunos;
import com.mizaeldouglas.domain.alunos.DadosCadastroAlunos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class AlunosDAO {
    private Connection conn;

    AlunosDAO(Connection connection){
        this.conn = connection;
    }

    public void salvar (DadosAdicionarAlunos adicionarAlunos){
        var alunos = new Alunos(adicionarAlunos.dadosCadastroAlunos());
        String sql = "INSERT INTO aluno(id, name, email, telefone, endereco)" +
                "VALUES (?, ?, ?, ?, ?)";

    try {
        PreparedStatement preparedStatement = conn.prepareStatement(sql);

        preparedStatement.setInt(1,adicionarAlunos.dadosCadastroAlunos().id());
        preparedStatement.setString(2,adicionarAlunos.dadosCadastroAlunos().name());
        preparedStatement.setString(3,adicionarAlunos.dadosCadastroAlunos().email());
        preparedStatement.setString(4,adicionarAlunos.dadosCadastroAlunos().telefone());
        preparedStatement.setString(5,adicionarAlunos.dadosCadastroAlunos().endereco());

        preparedStatement.execute();
        preparedStatement.close();
        conn.close();
    }catch (SQLException e){
        throw new RuntimeException(e);
    }

    }

    public Set<Alunos> listar(){
        Set<Alunos> alunos = new HashSet<>();
        PreparedStatement ps;
        ResultSet resultSet;

        String sql = "SELECT * FROM aluno;";

        try {
            ps = conn.prepareStatement(sql);
            resultSet = ps.executeQuery();


            while (resultSet.next()){
                Integer id = resultSet.getInt(1);
                String nome = resultSet.getString(2);
                String email = resultSet.getString(3);
                String telefone = resultSet.getString(4);
                String endereco = resultSet.getString(5);

                DadosCadastroAlunos dadosCadastroAlunos = new DadosCadastroAlunos(id,nome,email,telefone,endereco);


                alunos.add(new Alunos(dadosCadastroAlunos));
            }
            resultSet.close();
            ps.close();
            conn.close();


        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return alunos;

    }

}
