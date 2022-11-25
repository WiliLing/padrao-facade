import java.util.ArrayList;
import java.util.List;

public abstract class Setor {
    private List<Colaborador> colaboradoresComPendencia = new ArrayList<Colaborador>();

    public void addColaboradorComPendencia(Colaborador colaborador) {
        this.colaboradoresComPendencia.add(colaborador);
    }

    public boolean verificarColaboradorComPendencia(Colaborador colaborador) {
        return this.colaboradoresComPendencia.contains(colaborador);
    }
}
