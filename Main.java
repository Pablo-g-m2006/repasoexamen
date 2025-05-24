public class Main {
    public static void main(String[] args) {
        double[] precios = {10.5, 25.3};
        System.out.printf("El precio total es: %.2f%n", calcularPrecioTotal(precios));
    }

    private static double calcularPrecioTotal(double[] precios) {
        double suma = 0;
        for (double precio : precios) {
            suma += precio;
        }
        return suma;
    }
}
