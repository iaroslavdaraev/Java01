package ru.geekbrains.java_one.lesson_04.online;

public class Emplayee {
    //  1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
    private String name;
    private String position;
    private String phone;
    private String salary;
    private int age;

    //  2. Конструктор класса должен заполнять эти поля при создании объекта;
    public Emplayee(String name, String position, String phone, String salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //  3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public String getPhone() {
        return phone;
    }
    public String getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }

    //  4. Вывести при помощи методов из пункта 3 ФИО и должность.
    public void main(String arg) {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + salary);
    }

    //  5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    public static void main(String[] args) {
        Emplayee[] emplayees = new Emplayee[5];
        Emplayee e0 = new Emplayee("Petrov Ivan Sergeevich", "frontdask", "+00-01",
                "35000", 35);
        Emplayee e1 = new Emplayee("Sydorov Igor Nikolaevich", "frontdask", "+00-02",
                "40000", 38);
        Emplayee e2 = new Emplayee("Kosatkina Svetlana Olegovna", "backend", "+00-03",
                "46000", 41);
        Emplayee e3 = new Emplayee("Bykova Nadezda Nikolaevna", "backend", "+00-04",
                "45000", 41);
        Emplayee e4 = new Emplayee("Strijov Andrey Efremovich", "director", "+00-05",
                "50000", 45);
        for (int i = 0; i < emplayees.length; i++) {
            if (emplayees[i].getAge() > 40)
                System.out.println(emplayees[i]);
        }
    }
}
