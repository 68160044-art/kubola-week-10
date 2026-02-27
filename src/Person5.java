
public class Person5 {
    String firstname;
    String lastname;
    int age;

    public Person5(String fn, String ln) {
        firstname = fn;
        lastname = ln;
    }

    public Person5(String fn, String ln, int a) {
        //this();
        age = a;
    }

    public void show() {
        System.out.println("Name : " + firstname + " " + lastname + " Age : " + age);
    }
}



 class ShowInfo5 {

    public static void main(String[] args) {
        Person5 p1;
        Person5 p2;
        Person5 p3;

        p1 = new Person5("nid", "kubola", 25);
        p2 = new Person5("john", "peterson");
        p3 = new Person5("bob", "smith", 18);

        p1.show();
        p2.show();
        p3.show();
    }
}



