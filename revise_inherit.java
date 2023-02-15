public class revise_inherit {
    //write a java program showing inheritance
    public static void main(String[] args){
        rectangle obj1 = new rectangle();
        circle obj2 = new circle();
        shape obj3 = new shape();
        obj1.area();
        obj2.area();
        obj3.area();
}
}

class shape{

    public void area(){
        System.out.println("Area of shape");
    }
}
class rectangle extends shape{
    public void area(){
        System.out.println("Area of rectangle");
    }
}
class circle extends shape{
    public void area(){
        System.out.println("Area of circle");
    }
}