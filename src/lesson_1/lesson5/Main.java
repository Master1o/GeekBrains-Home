package lesson_1.lesson5;


import lesson_1.lesson5.staff.Employee;

public class Main {

    public static void main(String[] args) {

        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        empCorp[1] = new Employee("Kozlov Kirill", "Director", "kozkirill@mailbox.com", "895112348", 90000, 42);
        empCorp[2] = new Employee("Bezruchenkova Victoria", "Seller", "bezvictoria@mailbox.com", "892811679", 25000, 24);
        empCorp[3] = new Employee("Anisimov Valeriy", "Cashier", "anisvaleriy@mailbox.com", "898947239", 25000, 21);
        empCorp[4] = new Employee("Dmitrov Dmitriy", "Creator", "dmitrovd@mailbox.com", "895124825", 75000, 48);

        for (int i = 0; i <empCorp.length; i++) {
            if (empCorp[i].age > 40) empCorp[i].print();

        }
    }

}

public class Employee {

    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    public int age;
    int i = 0;


    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone, salary, age);}
}





