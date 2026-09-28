import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[]cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[]franchises = {"PS5", "XBOX","Switch"};

        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };
        int[]CityTotals = new int[cities.length];
        int maxSales = -1;
        String topCity = "";
        ProductSales ps = new ProductSales();
        int total = ps.TotalSalesCity(sales);

        System.out.println("---------------------------------------------");
        System.out.println("Gaming Console Report");
        System.out.printf("%-20s%-12s%-12s%-12s\n","", franchises[0],franchises[1], franchises[2]);
        System.out.println("Cape Town         "+ sales[0][0]);
        System.out.println("Port Elizabeth    "+ sales[1][0]);
        System.out.println("Pretoria          "+ sales[2][0]);
        System.out.println("---------------------------------------------");
        System.out.println("Console Sales For Each City");
        System.out.println("---------------------------------------------");
        System.out.println("Cape Town         " + total);
        System.out.println("Port Elizabeth");
        System.out.println("Pretoria");
        System.out.println("");
        System.out.println("City with the most sales: Port Elizabeth ");
    }
}
