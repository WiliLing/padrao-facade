import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColaboradorTest {
    @Test
    void deveRetornarPendenciaRHAdmissao() {
        Colaborador colaborador = new Colaborador();
        RH.getInstancia().addColaboradorComPendencia(colaborador);

        assertEquals(false, colaborador.admissao());
    }

    @Test
    void deveRetornarPendenciaJuridicoAdmissao() {
        Colaborador colaborador = new Colaborador();
        Juridico.getInstancia().addColaboradorComPendencia(colaborador);

        assertEquals(false, colaborador.admissao());
    }

    @Test
    void deveRetornarPendenciaFinanceiroAdmissao() {
        Colaborador colaborador = new Colaborador();
        Financeiro.getInstancia().addColaboradorComPendencia(colaborador);

        assertEquals(false, colaborador.admissao());
    }

    @Test
    void deveRetornarPendenciaExameAdmissionalAdmissao() {
        Colaborador colaborador = new Colaborador();
        ExameAdmissional.getInstancia().addColaboradorComPendencia(colaborador);

        assertEquals(false, colaborador.admissao());
    }


    @Test
    void deveRetornarColaboradorSemPendenciaAdmissao() {
        Colaborador colaborador = new Colaborador();

        assertEquals(true, colaborador.admissao());
    }

    @Test
    void deveRetornarPendenciaRHDemissao() {
        Colaborador colaborador = new Colaborador();
        RH.getInstancia().addColaboradorComPendencia(colaborador);

        assertEquals(false, colaborador.demissao());
    }

    @Test
    void deveRetornarPendenciaJuridicoDemissao() {
        Colaborador colaborador = new Colaborador();
        Juridico.getInstancia().addColaboradorComPendencia(colaborador);

        assertEquals(false, colaborador.demissao());
    }

    @Test
    void deveRetornarPendenciaFinanceiroDemissao() {
        Colaborador colaborador = new Colaborador();
        Financeiro.getInstancia().addColaboradorComPendencia(colaborador);

        assertEquals(false, colaborador.demissao());
    }

    @Test
    void deveRetornarPendenciaExameDemissionalDemissao() {
        Colaborador colaborador = new Colaborador();
        ExameDemissional.getInstancia().addColaboradorComPendencia(colaborador);

        assertEquals(false, colaborador.demissao());
    }

    @Test
    void deveRetornarColaboradorSemPendenciaDemissao() {
        Colaborador colaborador = new Colaborador();

        assertEquals(true, colaborador.demissao());
    }
}


