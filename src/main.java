public class main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov Ivan", "Engineer", "ivanov@example.com", "+7 (123) 456-78-90", 50432, 20);
        employee.printInfo();
        System.out.println();
            Employee1[] employees = new Employee1[5];

            employees[0] = new Employee1("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
            employees[1] = new Employee1("Veronika Kukharskaya", "Team leader", "veronika@mailbox.com", "891234567", 50000, 25);
            employees[2] = new Employee1("Lidiya Makarova", "QA Suoer man", "lidiya@mailbox.com", "890987654", 40000, 28);
            employees[3] = new Employee1("Evgeniy Rumyancev", "Java Professional", "geniy@mailbox.com", "890123456", 35000, 32);
            employees[4] = new Employee1("Aleksandra A.", "Shark girl", "supergirlsexy@mailbox.com", "897654321", 45000, 27);

            for (Employee1 employee1 : employees) {
            employee1.printInfo();
            System.out.println();
            }
        Park park = new Park("Парк аттракционов", 3);

        park.setAttraction(0, "Веселые горки", "10:00 - 18:00", 25.0);
        park.setAttraction(1, "Качели", "12:00 - 20:00", 15.0);
        park.setAttraction(2, "Самокат", "11:00 - 19:00", 10.0);

        park.printAttractionsInfo();
    }
}
