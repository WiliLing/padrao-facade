public class ColaboradorFacade {
    public static boolean verificarPendenciasAdmissao(Colaborador colaborador) {
        if (Juridico.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        if (RH.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        if (ExameAdmissional.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        return true;
    }

    public static boolean verificarPendenciasDemissao(Colaborador colaborador) {
        if (Juridico.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        if (RH.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        if (ExameDemissional.getInstancia().verificarColaboradorComPendencia(colaborador)) {
            return false;
        }
        return true;
    }
}
