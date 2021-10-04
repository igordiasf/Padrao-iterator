package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarFuncionariosAtivosEmpresa() {
        Empresa Empresa = new Empresa(
                new Funcionario("Mario", true),
                new Funcionario("Edit", true),
                new Funcionario("João", false),
                new Funcionario("Julia", true)
        );
        assertEquals(3, Censo.contarFuncionariosAtivosEmpresa(Empresa));
    }

    @Test
    void deveContarTotalFuncionariosEmpresa() {
        Empresa Empresa = new Empresa(
                new Funcionario("Mario", true),
                new Funcionario("Edit", true),
                new Funcionario("João", false),
                new Funcionario("Julia", true)
        );
        assertEquals(4, Censo.contarTotalFuncionariosEmpresa(Empresa));
    }

}