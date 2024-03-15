package repository.impl;

import Inter.ClienteInterface;
import model.Cliente;
import model.ClienteFisico;
import model.ClienteJuridico;
import model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class ClienteIMPL <T extends Cliente> implements ClienteInterface<T> {

    List<Cliente> listaclientes = new ArrayList<>();

    @Override
    public T cadastrar(T cliente) {

        if (buscaCpf(String.valueOf(cliente instanceof ClienteFisico)) == null){
            listaclientes.add(cliente);
            return cliente;
        } else if (buscaCnpj(String.valueOf(cliente instanceof ClienteJuridico)) == null){
            listaclientes.add(cliente);
            return cliente;
        } else {
            System.out.println("CPF ou CNPJ cadastrado.");
        }

        return null;
    }

    @Override
    public Boolean deletar(T cliente) {
        return listaclientes.remove(cliente);
    }

    @Override
    public ClienteFisico buscaCpf(String cpf) {
        for (Cliente cliente: listaclientes){
            if(cliente instanceof ClienteFisico && ((ClienteFisico) cliente).getCpf().equalsIgnoreCase(cpf)){
                return (ClienteFisico) cliente;
            }
        }
        return null;
    }

    @Override
    public ClienteJuridico buscaCnpj(String cnpj) {
        for (Cliente cliente: listaclientes){
            if(cliente instanceof ClienteJuridico && ((ClienteJuridico) cliente).getCnpj().equalsIgnoreCase(cnpj)){
                return (ClienteJuridico) cliente;
            }
        }
        return null;
    }

    @Override
    public T alterar(T cliente) {
        Cliente novoFisico = buscaCpf(cliente.getNome());
        Cliente novoJuridico = buscaCnpj(cliente.getNome());
        if (novoFisico == null){
            System.out.println("Nome fora do cadastro!");
        }
        if (novoJuridico == null){
            System.out.println("Nome Jurídico fora do cadastro!");
        }

        deletar(cliente);
        cadastrar(cliente);

        return cliente;
    }

    @Override
    public List<Cliente> tudo() {
        return new ArrayList<>(listaclientes);
    }
}
