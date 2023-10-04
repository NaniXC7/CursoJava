public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {

            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 3ms, 10000 => 122ms, 100000 => 4534ms

            //c += a + b + "\n"; // 500 => 9ms, 1000 => 11ms, 10000 => 72ms, 100000 => 1683ms

            sb.append(a).append(b).append("\n");// 500 => 0MS, 1000 => 0ms, 10000 => 1ms, 100000 => 7ms

        }

        System.gc();

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());

        System.exit(0);

    }
}
