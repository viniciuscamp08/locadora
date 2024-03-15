package model;

public class ClienteFisico extends Cliente{
    private String cpf;

    public ClienteFisico(String nome, String cpf){
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "ClienteFisico{" + "nome " + getNome() +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
