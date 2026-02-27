public class Person3 {
    String firstname;
    String lastname;
    int age;

    public Person3(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public void show() {
        System.out.println("Name : " + firstname + " " + lastname + " Age : " + age);
    }
}
class ShowInfo3 {

    public static void main(String[] args) {
        Person3 p1;
        Person3 p2;
        Person3 p3;

        p1 = new Person3("nid", "kubola", 25);
        p2 = new Person3("john", "peterson", 37);
        p3 = new Person3("bob", "smith", 18);

        p1.show();
        p2.show();
        p3.show();
    }
}