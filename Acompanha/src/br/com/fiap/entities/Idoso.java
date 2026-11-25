package br.com.fiap.entities;

public class Idoso extends Pessoa{
    private String dataNascimento;
    private Familiar responsavel;

    //metodo construtor vazio
    public Idoso() {
    }

    //metodo construtor cheio
    public Idoso(int id, String nome, String telefone, String dataNascimento, Familiar reponsavel) {
        super(id, nome, telefone);
        this.dataNascimento = dataNascimento;
        this.responsavel = reponsavel;
    }

    //getters e setters
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Familiar getReponsavel() {
        return responsavel;
    }

    public void setReponsavel(Familiar reponsavel) {
        this.responsavel = reponsavel;
    }



    //toString
    @Override
    public String toString() {
        return "Idoso" +
                " dataNascimento='" + dataNascimento + '\'' +
                ", reponsavel= " + responsavel +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone;
    }
}
