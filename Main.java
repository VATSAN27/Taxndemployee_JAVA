
interface Taxable {
    double SALES_TAX = 0.07;
    double INCOME_TAX = 0.105;

    double calcTax();
}

class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public double calcTax() {
        return salary * INCOME_TAX;
    }
}

class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcTax() {
        return price * SALES_TAX * quantity;
    }
}

