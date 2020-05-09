package condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean existfalse = false;
        if ((ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac) {
            existfalse = true;
        }
        return existfalse;
    }
}
