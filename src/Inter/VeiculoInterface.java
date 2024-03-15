package Inter;


import model.Veiculo;

import java.util.List;

public interface VeiculoInterface<T extends Veiculo> {

    T cadastrar(T veiculo);

    Boolean deletar(T veiculo);
    Veiculo buscaPlaca(String placa);
    T alterar (T veiculo);
    List<Veiculo> tudoCARRO();



}
