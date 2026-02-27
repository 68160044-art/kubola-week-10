public class Person2 {
    String firstname;
    String lastname;
    int age;

    public Person2(String firstname, String lastname, int age) {
        firstname = firstname;
        lastname = lastname;
        age = age;
    }

    public void show() {
        System.out.println("Name : " + firstname + " " + lastname + " Age : " + age);
    }
}
class ShowInfo2 {

    public static void main(String[] args) {
        Person2 p1;
        Person2 p2;
        Person2 p3;

        p1 = new Person2("nid", "kubola", 25);
        p2 = new Person2("john", "peterson", 37);
        p3 = new Person2("bob", "smith", 18);

        p1.show();
        p2.show();
        p3.show();
    }
}



