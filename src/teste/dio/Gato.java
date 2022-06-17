package teste.dio;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    public Gato() {/*construtor atalho- alt + insert*/
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    /*get set - alt + insert é um atalho*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    /*equals - hashCode() alt + insert*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    /*toString() alt + insert*/

    @Override
    public String toString() {
        return "gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}


