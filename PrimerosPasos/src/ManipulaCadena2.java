public class ManipulaCadena2 {
    public static void main(String[]args) {
        String frase = "Hoy es un dia estupendo para aprender Java";
        String fraseResumen = frase.substring(frase.length()-18, frase.length()) + " y aprender mejor...";
        System.out.println(fraseResumen);

        String alu1 = "David", alu2= "david", alu3= "David";
        System.out.println(alu1.equals(alu2));
        System.out.println(alu1.equals(alu3));
        System.out.println(alu1.equalsIgnoreCase(alu2));
    }
}
