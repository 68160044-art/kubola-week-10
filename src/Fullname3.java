public class Fullname3 {
    String firstname;
    String lastname;

    public void display() {
        System.out.print(firstname + " " + lastname);
    }
}
class Customer3 {
    int id;
    Fullname3 name;
    String tel;

    public void display() {
        System.out.print(id + " ");
        name.display();
        System.out.println(" " + tel);
    }
}
class Employee3 {
    int id;
    Fullname3 name;
    double salary;

    public void display() {
        System.out.print(id + " ");
        name.display();
        System.out.println(" " + salary);
    }
}
class Test3 {
    public static void main(String[] args) {
        Employee3 e1 = new Employee3();
        Customer3 c1 = new Customer3();
        Fullname3 f1 = new Fullname3();
        Fullname3 f2 = new Fullname3();

        f1.firstname = "Jane";
        f1.lastname = "Smith";

        f2.firstname = "Robert";
        f2.lastname = "Peterson";

        e1.id = 111;
        e1.name = f2;
        e1.salary = 20000;

        c1.id = 101;
        c1.name = f1;
        c1.tel = "0879208767";

        c1.display();
        e1.display();
    }
}



