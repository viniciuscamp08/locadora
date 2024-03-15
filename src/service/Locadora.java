package service;

import model.Cliente;
import model.ClienteFisico;
import model.ClienteJuridico;
import model.Veiculo;
import repository.impl.ClienteIMPL;
import repository.impl.VeiculoIMPL;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Locadora {

    private ClienteIMPL<Cliente> clienteIMPL;
    private VeiculoIMPL<Veiculo> veiculoIMPL;

    public Locadora() {
        clienteIMPL = new ClienteIMPL<>();
        veiculoIMPL = new VeiculoIMPL<>();
    }

    public Cliente cadastrarCliente(Cliente cliente) {
        return clienteIMPL.cadastrar(cliente);
    }

    public boolean deletarCliente(Cliente cliente) {
        return clienteIMPL.deletar(cliente);
    }

    public Cliente buscarCliente(String cpfCnpj) {
        ClienteFisico clienteFisico = clienteIMPL.buscaCpf(cpfCnpj);
        if (clienteFisico != null) {
            return clienteFisico;
        }
        ClienteJuridico clienteJuridico = clienteIMPL.buscaCnpj(cpfCnpj);
        return clienteJuridico;
    }

    public Cliente alterarCliente(Cliente cliente) {
        return clienteIMPL.alterar(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteIMPL.tudo();
    }

    public Veiculo cadastrarVeiculo(Veiculo veiculo) {
        return veiculoIMPL.cadastrar(veiculo);
    }

    public boolean deletarVeiculo(Veiculo veiculo) {
        return veiculoIMPL.deletar(veiculo);
    }

    public Veiculo buscarVeiculo(String placa) {
        return veiculoIMPL.buscaPlaca(placa);
    }

    public Veiculo alterarVeiculo(Veiculo veiculo) {
        return veiculoIMPL.alterar(veiculo);
    }

    public List<Veiculo> listarVeiculos() {
        return veiculoIMPL.tudoCARRO();
    }

}
