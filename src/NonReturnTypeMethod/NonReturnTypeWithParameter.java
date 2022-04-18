package NonReturnTypeMethod;

public class NonReturnTypeWithParameter {

    public void getName(String name) {

        System.out.println("1. Is your name: " + name + "?");
    }

    public void getTicketPrice(String route, int price) {

        System.out.println("2. The ticket price from, " + "Washington to Dhaka " + "is " + "$" + price);
    }

    public void getQuotations(int laptopPrice, int monitorPrice, int dockingPrice) {

        System.out.println("3. CDWG quotations for these items are as follows: " + "\n" + "\t 3.A Laptop price: $" + laptopPrice + "\n" + "\t 3.B Monitor price: $" + monitorPrice + "\n" + "\t 3.C Docking price: $" + dockingPrice + "\n" + "----------------------------------" + "\n" + "\t Total cost is: $" + (laptopPrice + monitorPrice + dockingPrice));
    }

    public void doSalaryCalculation(int hourly, int daily, int monthly, int yearly) {
        System.out.println("Hourly pay is $" + hourly + " - " + "Daily pay is: $" + (daily = (hourly * 8)) + " - " + "Monthly salary is: $" + (monthly = (daily * 22)) + " - " + "Yearly salary is: $" + (yearly = (monthly * 12)));
    }

    public void doSubstraction(int taxReturn, int cityTax, int statetax, int childDependecies) {
        System.out.println("Total tax return is: $" + (taxReturn - cityTax - statetax - childDependecies));
    }


    public static void main(String[] args) {

        NonReturnTypeWithParameter object = new NonReturnTypeWithParameter();
        object.getName("Will Smith");
        object.getTicketPrice("Washingotn to Dhaka", 900);
        object.getQuotations(1400, 350, 250);
        object.doSalaryCalculation(41, 328, 7216, 86592);
        object.doSubstraction(7000,588,456,1491);

    }
}
