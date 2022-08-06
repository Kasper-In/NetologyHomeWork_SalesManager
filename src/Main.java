public class Main {
    public static void main(String[] args) {
        long[] sales = {150_000, 125_000, 256_500, 95_900, 187_300, 130_000};
        SalesManager salesManager = new SalesManager(sales);

        System.out.println("Объемы продаж за полгода:");
        for (int i = 0; i < sales.length; i++) {
            System.out.println(i+1 + "-й месяц: " + sales[i] + " руб.");
        }

        System.out.println();
        long maxSales = salesManager.max();
        System.out.println("Максимальный объем продаж за эти полгода: " + maxSales + " руб.");
    }
}
