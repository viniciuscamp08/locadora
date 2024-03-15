package repository.impl;

import Inter.VeiculoInterface;
import model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoIMPL <T extends Veiculo> implements VeiculoInterface<T> {

    private final List<Veiculo> listaVeiculo = new ArrayList<>();

    @Override
    public T cadastrar(T veiculo) {

        for (Veiculo v : listaVeiculo){
            if (v.getPlaca().equals(veiculo.getPlaca())) {
                throw new IllegalArgumentException("Veículo com placa " + veiculo.getPlaca() + " já cadastrado.");
            }
        }
        listaVeiculo.add(veiculo);
        return veiculo;
    }

    @Override
    public Boolean deletar(T veiculo) {
        return listaVeiculo.remove(veiculo);
    }

    @Override
    public Veiculo buscaPlaca(String placa) {
        for (Veiculo veiculo: listaVeiculo){
            if (veiculo.getPlaca().equals(placa)){
                return veiculo;
            } else{
                System.out.println("Esse veículo não existe!");
            }
        }
        return null;
    }

    @Override
    public T alterar(T veiculo) {
        Veiculo novo = buscaPlaca(veiculo.getPlaca());
        if (novo == null){
            System.out.println("VEICULO FORA DO CADASTRO!");
        }
        deletar(veiculo);
        cadastrar(veiculo);

        return veiculo;
    }

    @Override
    public List<Veiculo> tudoCARRO() {
        return new ArrayList<>(listaVeiculo);
    }


}
