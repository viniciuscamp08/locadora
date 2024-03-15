package model;


import Enumareta.TipodeVeiculo;

public class Veiculo {
    private String placa;
    private String modelo;
    private TipodeVeiculo tipoDeCarro;
    private boolean disponivel = true;

    public boolean getDisponivel(){
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    public Veiculo(String placa, String modelo,TipodeVeiculo tipoDeCarro){
        this.placa = placa;
        this.modelo = modelo;
        this.tipoDeCarro = tipoDeCarro;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo(String novoVeiculo) {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipodeVeiculo getTipoDeCarro() {
        return tipoDeCarro;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipoDeCarro=" + tipoDeCarro +
                ", disponivel=" + (getDisponivel() ? "Disponivel": "Indisponivel") +
                '}';
    }


}
