public class Main
{
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("IvanovIvan","Engineer",
                                    "ivan@mail.ru", "89879876543",
                                    30000, 30);
        employees[1] = new Employee("SergeySergey", "Proect",
                                    "serg@mail.ru", "6547789765",
                                    10000, 35);
        employees[2] = new Employee("MarkMarkovich", "Program",
                                    "mark@mail.ru", "8765454323",
                                    40000, 45);

        int minAge = 40;
        for (Employee employee : employees) {
            if (employee.age > minAge) {
                employee.printInfo();
                System.out.println();
            }
        }

    }
}


