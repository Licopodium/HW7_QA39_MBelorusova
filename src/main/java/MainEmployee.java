public class MainEmployee {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new SalaryEmployee(145, "Sasha", 35, 50000);
        employees[1] = new SalaryEmployee(151, "Alla", 28, 60000);
        employees[2] = new WageEmployee(163, "Igor", 34, 10, 160);
        employees[3] = new WageEmployee(174, "Sara", 60, 12, 180);
        employees[4] = new Manager(188, "Anatoly", 40, 75000, 0.1);
        employees[5] = new Manager(192, "Lana", 38, 78000, 0.15);


        print(employees);
        System.out.println("---------------");
        printAdv(employees);
        System.out.println("---------------");
        printSuperAdv(employees);
    }

    public static void print(Employee[] employees) {
       for (Employee emp : employees) {
          if (emp != null) {
              System.out.println(emp);
          }
        }
    }

    public static void printAdv(Employee[] employees) {
        print(employees);
        int totalSalary = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                totalSalary += emp.calcSalary();
            }
        }
        System.out.println("-----------------");
        System.out.println("total salary: " + totalSalary);
    }

    public static void printSuperAdv(Employee[] employees) {
        print(employees);
        int totalSalary = 0;
        int count = 0;
        for (Employee emp : employees) {
            if (emp != null) {
                totalSalary += emp.calcSalary();
                count++;
            }
        }
        System.out.println("-----------------");
        System.out.println("total salary: " + totalSalary);
        System.out.println("average salary: " + (totalSalary / count));
    }
}
