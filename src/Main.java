public class Main {

    public static void main(String[] args) {
        Employee worker = new Employee();
        Employee[] employees = {
                new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "89231231212", 30000, 30),
                new Employee("Petrov Ivan", "Developer", "petrov@mailbox.com", "89231231213", 300000, 54),
                new Employee("Ivanov Petr", "Engineer", "pvan@mailbox.com", "89231231214", 35000, 33),
                new Employee("Ivanova Olga", "Engineer", "iviva@mailbox.com", "89235231212", 38000, 45),
                new Employee("Pavlova Inna", "Engineer", "pavlova@mailbox.com", "89231231123", 36000, 47)
            };

        getOver40old(employees, 40);
    }

    static void getOver40old(Employee[] employees, int age) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > age) {
                employees[i].info();
            }
        }
    }
}

