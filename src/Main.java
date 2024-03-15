import Enumareta.TipodeVeiculo;
import Inter.VeiculoInterface;
import model.ClienteFisico;
import model.ClienteJuridico;
import model.Veiculo;
import repository.impl.ClienteIMPL;
import repository.impl.VeiculoIMPL;
import service.Locadora;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VeiculoIMPL listaVeiculos = new VeiculoIMPL();
        ClienteIMPL listaClientes = new ClienteIMPL();

        System.out.println(listaVeiculos.cadastrar(new Veiculo("NPA2345","Ford", TipodeVeiculo.SUV)));
//        //System.out.println(listaVeiculos.deletar(new Veiculo("NPA2345","Ford", TipodeVeiculo.SUV)));
//        listaVeiculos.buscaPlaca("NPA2341");
//
//        listaVeiculos.alterar(new Veiculo("NPA2342","Nissan", TipodeVeiculo.HATCH));
//
//
//        listaClientes.cadastrar(new ClienteFisico("Luiza Carmen", "12345678-901"));
//        System.out.println(listaClientes.cadastrar(new ClienteFisico("Luiza Carmen", "12345678-901")));
//        listaClientes.cadastrar(new ClienteFisico("Luiza Carmen", "12345678-901"));
//        System.out.println(listaClientes.cadastrar(new ClienteFisico("Luiza Carmen", "12345678-901")));
//
//        listaClientes.alterar(new ClienteFisico("Luiz Carmem", "12345678-901"));
//        System.out.println(listaClientes.alterar(new ClienteFisico("Luiz Carmem", "12345678-901")));
//
//        System.out.println(listaClientes.cadastrar(new ClienteFisico("Luiza Carmen", "12345678-901")));
        listaVeiculos.cadastrar(new Veiculo("12345", "Chevrolet", TipodeVeiculo.SUV));

        System.out.println(listaVeiculos.cadastrar(new Veiculo("12345", "Chevrolet", TipodeVeiculo.SUV)));


    }
}