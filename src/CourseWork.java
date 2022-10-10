public class CourseWork {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Petr Ivanov", 1, 47000.0);
        employees[1] = new Employee("Stepan Petrov", 1, 46454.0);
        employees[2] = new Employee("Sergei Burunov", 2, 49244.0);
        employees[3] = new Employee("Olga Ostachkova", 2, 41332.0);
        employees[4] = new Employee("Egor Volkov", 3, 44444.0);
        employees[5] = new Employee("Vera Babes ", 3, 48721.0);
        employees[6] = new Employee("Konstantin Kicherov", 3, 41000.0);

        getAndCalculateSalarySum();
        System.out.println(getEmployeeMinSalary());
        System.out.println(getEmployeeMaxSalary());
        System.out.println(getAndCalculateAverageSalary());
        printFullNameAllEmployees();
    }
    public static void printAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    public static double getAndCalculateSalarySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum = sum + employees[i].getSalary();
            }
        }
        return sum;
    }
    public static Employee getEmployeeMinSalary() {
        double minSalary = -1;
        Employee minSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmpl = employees[i];
                index = i;
                break;
            }
        }
        if(minSalaryEmpl == null) return null;
        for (int i = index; i < employees.length; i++) {
            if(employees[i] != null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmpl = employees[i];
                }
            }
        }
        return minSalaryEmpl;
    }
    public static Employee getEmployeeMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmpl = employees[i];
                index = i;
                break;
            }
        }
        if(maxSalaryEmpl == null) return null;
        for (int i = index; i < employees.length; i++) {
            if(employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmpl = employees[i];
                }
            }
        }
        return maxSalaryEmpl;
    }

    public static double getAndCalculateAverageSalary() {
        if (employees.length != 0) {
            return getAndCalculateSalarySum() / employees.length;
        }else{
            return 0;
        }
    }

    public static void printFullNameAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
            
        }
    }
}
