package Inter;

import model.Cliente;
import model.ClienteFisico;
import model.ClienteJuridico;

import java.util.List;

public interface ClienteInterface<T extends Cliente> {

    T cadastrar(T cliente);
    Boolean deletar(T cliente);
    ClienteFisico buscaCpf(String cpf);
    ClienteJuridico buscaCnpj(String cnpj);
    T alterar (T cliente);

    List<Cliente> tudo();

}
