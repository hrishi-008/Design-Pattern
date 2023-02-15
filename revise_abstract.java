public class revise_abstract {
    public static void main(String[] args){
        child obj = new child();
        obj.display();

        child2 obj2 = new child2();
        obj2.display();
    }
}
abstract class parent{
    void display(){
        System.out.println("Calls PARENT");
    };
}
class child extends parent{
    void display(){
        System.out.println("Calls CHILD1");
    }
}

class child2 extends parent{
    void display(){
        System.out.println("Calls CHILD2");
    }
}