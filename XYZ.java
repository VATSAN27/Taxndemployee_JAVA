public class XYZ {
    public static void main(String[] args) {

        int empId = 123;
        String empName = "vatsan";
        double empSalary = 50000.0;


        Employee employee = new Employee(empId, empName, empSalary);


        double incomeTax = employee.calcTax();


        int pid = 456;
        double price = 10.0;
        int quantity = 5;


        Product product = new Product(pid, price, quantity);


        double salesTax = product.calcTax();

        // Print income tax and sales tax
        System.out.println("Income Tax: " + incomeTax);


        System.out.println("Sales Tax: " + salesTax);
    }

}
