package com.mizaeldouglas.domain.alunos;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Alunos {
    private  Integer id;
    private  String name;
    private String email;
    private String telefone;
    private  String endereco;

    public Alunos(DadosCadastroAlunos dadosCadastroAlunos) {
        this.id = dadosCadastroAlunos.id();
        this.name = dadosCadastroAlunos.name();
        this.email = dadosCadastroAlunos.email();
        this.telefone = dadosCadastroAlunos.telefone();
        this.endereco = dadosCadastroAlunos.endereco();
    }

//    public Alunos(Integer id, String nome, String email, String telefone, String endereco) {
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alunos alunos)) return false;
        return Objects.equals(id, alunos.id) && Objects.equals(name, alunos.name) && Objects.equals(email, alunos.email) && Objects.equals(telefone, alunos.telefone) && Objects.equals(endereco, alunos.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, telefone, endereco);
    }

    @Override
    public String toString() {
        return "\nAluno: " + name +
                ", \n-Numero de matricula do aluno: " + id +
                ", \n-Email do aluno: " + email +
                ", \n-Telefone do aluno: " + telefone +
                ", \n-Endereco do aluno: " + endereco +
                "\n--------------------------------------\n";
    }
}
