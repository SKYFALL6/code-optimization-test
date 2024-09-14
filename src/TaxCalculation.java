public class TaxCalculation {
    public static void main(String[] args) {
        // matriz de precios de productos
        double[] productPrices = {100, 200}; 
        // matriz de tasas de impuestos
        double[] taxRates = {0.15, 0.10}; 

        double totalTax = 0;

        // Bucle para calcular el impuesto total
        for (int i = 0; i < productPrices.length; i++) {
            double tax = productPrices[i] * taxRates[i];
            totalTax += tax;
        }

        // para determinar si el impuesto total es alto o bajo
        if (totalTax > 50) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}

