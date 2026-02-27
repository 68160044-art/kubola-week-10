
public class Person4 {
    String firstname;
    String lastname;
    int age;

    public Person4(String fn, String ln) {
        firstname = fn;
        lastname = ln;
    }

    public Person4(String fn, String ln, int a) {
        this(fn,ln);
        age = a;
    }

    public void show() {
        System.out.println("Name : " + firstname + " " + lastname + " Age : " + age);
    }
}



 class ShowInfo4 {

    public static void main(String[] args) {
        Person4 p1;
        Person4 p2;
        Person4 p3;

        p1 = new Person4("nid", "kubola", 25);
        p2 = new Person4("john", "peterson");
        p3 = new Person4("bob", "smith", 18);

        p1.show();
        p2.show();
        p3.show();
    }
}



