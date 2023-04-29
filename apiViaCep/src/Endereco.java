import exception.MinhaException;

public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public Endereco(MeuCep meuCep) {
        this.cep = meuCep.cep();
        this.logradouro = meuCep.logradouro();
        this.bairro = meuCep.bairro();
        this.localidade = meuCep.localidade();
        this.uf = meuCep.uf();
    }


    @Override
    public String toString() {
        return "Endereco: " +
                "\n- Cep: " + cep +
                ",\n- Longadouro: " + logradouro +
                ",\n- Bairro: " + bairro +
                ",\n- Cidade: " + localidade + "-" + uf;
    }


}
