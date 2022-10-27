package model;

public abstract class Funcionario {
    private int idFunc;
    private String nome;
    private String email;
    private String documeto;

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumeto() {
        return documeto;
    }

    public void setDocumeto(String documeto) {
        this.documeto = documeto;
    }
}
