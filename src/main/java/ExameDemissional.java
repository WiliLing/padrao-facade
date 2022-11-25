public class ExameDemissional extends Setor {

    private static ExameDemissional exameDemissional = new ExameDemissional();

    private ExameDemissional() {};

    public static ExameDemissional getInstancia() {
        return exameDemissional;
    }
}
