
public class Person1 {
    String firstname;
    String lastname;
    int age;

    public Person1(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public void show() {
        System.out.println("Name : " + firstname + " " + lastname + " Age : " + age);
    }
}
class ShowInfo1 {

    public static void main(String[] args) {
        Person1 p1;
        Person1 p2;
        Person1 p3;

        p1 = new Person1("nid", "kubola", 25);
        p2 = new Person1("john", "peterson", 37);
        p3 = new Person1("bob", "smith", 18);

        p1.show();
        p2.show();
        p3.show();
    }
}



