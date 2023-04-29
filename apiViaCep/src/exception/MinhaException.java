package exception;

public class MinhaException extends  RuntimeException{
    private String mensagem;

    public MinhaException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
