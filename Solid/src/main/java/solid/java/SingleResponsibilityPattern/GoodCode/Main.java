package solid.java.SingleResponsibilityPattern;







class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Costel", "manager");
        double salary = Salary.calculate(employee, 160, 25);
        System.out.println("Salary: " +  salary);
        Report.generate(employee,"First quarter report");
    }
}
