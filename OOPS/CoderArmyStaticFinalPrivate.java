public class CoderArmyStaticFinalPrivate {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
    }
}


// Static Keyword --> they belong to class not to objects
// Private methods can't be overriden
// Final methods can't be overriden
// Fields / Variables they can't be polymorphic
class A{
    static void fun(){
        System.out.println("Hello");
    }
    private void fun2(){
        System.out.println("Hello");
    }
    final void fun3(){
        System.out.println("Hello");
    }
}

class B extends A{
    static void fun(){
        System.out.println("Bye");
    }
}
