package NonReturnTypeMethod;

public class NonReturnTypeWithoutParameter {

    public void getDisplay() {
        System.out.println("1a. Method is an important topic to understand");
        System.out.println("1b. This is a non-return without any parameter type method");
    }

    public void getInformation() {
        String workerName = "David Tubbs";
        int yearOfExperience = 35;
        String jobTitle = "Programmer Analyst";
        int annualSalary = 1200000;
        System.out.println("2. Employee name is: " + workerName + " - " + "experience: " + yearOfExperience + "years" + " - " + "job title: " + jobTitle + " - " + "annual salary: $" + annualSalary);
    }

    public void doAddition() {
        String item = "Chicken over rice";
        int foodPrice = 10;
        double tax = 0.07;
        double tip = 0.15;
        double totalFoodCost = foodPrice + (foodPrice * tax) + ((foodPrice * tax) * tip);
        double roundOffCost = Math.round(totalFoodCost * 100.0) / 100.0;
        System.out.println("3. The total food cost is: $" + roundOffCost);
    }

    public void getTicketStatus() {
        String ticketType = "Incident";
        String ticketCreationDate = "4/11/2022";
        int ticketId = 72049;
        String ticketStatus = "In Progress";
        String assigneeName = "Kazi Hassan";
        System.out.println("4. Ticket type: "+ticketType+" - "+"creation date: "+ticketCreationDate+" - "+"ID: "+ticketId+" - "+"status: "+ticketStatus+" - "+"assigned to: "+assigneeName);
    }

    public void heIsCriminal() {
        boolean heIsCriminal = false;
        System.out.println("5. People are saying he did the crime: "+heIsCriminal);
    }


    public static void main(String[] args) {
        NonReturnTypeWithoutParameter object = new NonReturnTypeWithoutParameter();
        object.getDisplay();
        object.getInformation();
        object.doAddition();
        object.getTicketStatus();
        object.heIsCriminal();
    }
}
