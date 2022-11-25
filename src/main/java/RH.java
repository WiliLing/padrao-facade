import java.util.ArrayList;

public class RH extends Setor {

    private static RH rh = new RH();

    private RH() {};

    public static RH getInstancia() {
        return rh;
    }
}
