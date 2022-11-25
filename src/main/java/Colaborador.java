import java.text.Normalizer;

public class Colaborador {
    public boolean admissao() {
        return ColaboradorFacade.verificarPendenciasAdmissao(this);
    }
    public boolean demissao() {
        return ColaboradorFacade.verificarPendenciasDemissao(this);
    }

}
