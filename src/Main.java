public class Main {
    public static void main(String[] args)
    {
        double priceOfPurchase = 20.00;
        double taxRate = 0.05;
        double salesTax = priceOfPurchase * taxRate;
        double totalPrice = priceOfPurchase + salesTax;
        System.out.println("sales tax is: " + salesTax);
        System.out.println("total price is: " +totalPrice);
    }
}