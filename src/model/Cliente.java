package model;

public abstract class Cliente implements Comparable<Cliente>{
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Cliente outroCliente) {
        return this.getNome().compareTo(outroCliente.getNome());
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
