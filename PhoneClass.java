import java.util.Scanner;

public class PhoneClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of phone: ");
        String ph= sc.nextLine();
        Phone obj = Factory.getPhone(ph);
        obj.OS();
    }
}

class Factory{
    public static Phone getPhone(String type){
        if(type.equals("Nokia")){
            return new Nokia();
        }
        else if(type.equals("Samsung")){
            return new Samsung();
        }
        else if(type.equals("Apple")){
            return new Apple();
        }
        else{
            return null;
        }
    }
}


abstract class Phone {
    void OS(){};
}

class Apple extends Phone{
    void OS(){
        System.out.println("This is IOS");
    }
}

class Samsung extends Phone{
    void OS(){
        System.out.println("This is Android ONE UI4.0");
    }
}

class Nokia extends Phone{
    void OS(){
        System.out.println("This is Windows");
    }
}