public class Fullname2 {
    String firstname;
    String lastname;
}

class Customer2 {
    int id;
    Fullname2 name;   // ✅ แก้ตรงนี้
    String tel;

    public void display2() {
        System.out.println(id + " " + name.firstname + " " + name.lastname + " " + tel);
    }
}

class Employee2 {
    int id;
    Fullname2 name;   // ✅ แก้ตรงนี้
    double salary;

    public void display2() {
        System.out.println(id + " " + name.firstname + " " + name.lastname + " " + salary);
    }
}

class Test2 {
    public static void main(String[] args) {

        Employee2 e1 = new Employee2();
        Customer2 c1 = new Customer2();
        Fullname2 f1 = new Fullname2();
        Fullname2 f2 = new Fullname2();

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

        c1.display2();
        e1.display2();
    }
}
