// public class MyClass {
// public String firstName;	// declared instance variable
// public MyClass() {		// default constructor
//    this.firstName = “Scott”;	// use the word this to call for instance var
// }
// public static void main(String[] args) {
//    MyClass scott = new MyClass();  //this is the creation of the object
//    System.out.println(“Hello “ + scott.firstName);
// }
// }

public class Demo{
    public int a;
    public Demo(){
        this.a = 5;
    }
    public static void main(String[] args){
        Demo b = new Demo();
        int c = 2;
        System.out.println(b.a+c);
    }
}
