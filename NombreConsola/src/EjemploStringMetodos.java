public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Daniel";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Daniel\") = " + nombre.equals("Daniel"));
        System.out.println("nombre.equals(\"daniel\") = " + nombre.equals("daniel"));
        System.out.println("nombre.equalsIgnoreCase(\"daniel\") = " + nombre.equalsIgnoreCase("daniel"));
        System.out.println("nombre.compareTo(\"Daniel\") = " + nombre.compareTo("Daniel"));
        System.out.println("nombre.compareTo(\"Ignacio\") = " + nombre.compareTo("Ignacio"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length() - 2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\",\".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalengua.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());
        

    }
}
 