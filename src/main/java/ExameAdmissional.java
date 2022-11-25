public class ExameAdmissional extends Setor {

    private static ExameAdmissional exameAdmissional = new ExameAdmissional();

    private ExameAdmissional() {};

    public static ExameAdmissional getInstancia() {
        return exameAdmissional;
    }
}
