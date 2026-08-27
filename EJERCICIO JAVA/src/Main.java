public class Main {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== Ejercicio Git con Java ===");
        System.out.println("5 + 3 = " + calc.sumar(5, 3));
        System.out.println("5 - 3 = " + calc.restar(5, 3));
    }
}