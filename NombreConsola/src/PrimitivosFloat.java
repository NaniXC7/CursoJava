public class PrimitivosFloat {
    public static void main(String[] args) {
        
        float realFloat = 1.5e-10f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a " + Float.BYTES);
        System.out.println("float corresponde en bits a " + Float.SIZE);
        System.out.println("float corresponde en valor máximo a " + Float.MAX_VALUE);
        System.out.println("float corresponde en valor mínimo a " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a " + Double.BYTES);
        System.out.println("double corresponde en bits a " + Double.SIZE);
        System.out.println("double corresponde en valor máximo a " + Double.MAX_VALUE);
        System.out.println("double corresponde en valor mínimo a " + Double.MIN_VALUE);

        float varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
