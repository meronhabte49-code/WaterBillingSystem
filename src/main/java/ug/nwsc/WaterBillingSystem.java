package ug.nwsc;

public class WaterBillingSystem {

public static void main(String[] args) {
    String customerName = "Sample Customer";
    double waterUnits = 25.0;
    double ratePerUnit = 1500.0;

    double totalBill = waterUnits * ratePerUnit;

    System.out.println("NATIONAL WATER BILLING SYSTEM");
    System.out.println("-----------------------------");
    System.out.println("Customer Name: " + customerName);
    System.out.println("Water Units Used: " + waterUnits);
    System.out.println("Rate Per Unit: UGX " + ratePerUnit);
    System.out.println("Total Water Bill: UGX " + totalBill);
}

}