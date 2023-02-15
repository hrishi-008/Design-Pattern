import java.util.Scanner;

public class AbstractFactory{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of phone: ");
        String ph= sc.nextLine();
        FactoryGetter obj = OSFactory.getOS(ph);
        obj.getPhone(ph).OS();
    }
}

abstract class FactoryGetter{
    public Phone getPhone(String type){
        return null;
        
    }
}


class OSFactory{
    public static FactoryGetter getOS(String type){
        if(type.equalsIgnoreCase("Nokia")){
            return new AndroidFactory();
        }
        else if(type.equalsIgnoreCase("Samsung")){
            return new AndroidFactory();
        }
        else if(type.equalsIgnoreCase("Iphone")){
            return new IOSFactory();
        }
        else if(type.equalsIgnoreCase("Ipod")){
            return new IOSFactory();
        }
        else{
            return null;
        }
    }
}

class AndroidFactory extends FactoryGetter{
    public Phone getPhone(String type){
        if(type.equalsIgnoreCase("Nokia")){
            return new Nokia();
        }
        else if(type.equalsIgnoreCase("Samsung")){
            return new Samsung();
        }
        else{
            return null;
        }
    }
}

class IOSFactory extends FactoryGetter{
    public Phone getPhone(String type){
        if(type.equalsIgnoreCase("Iphone")){
            return new Iphone();
        }
        else if(type.equalsIgnoreCase("Ipod")){
            return new Ipod();
        }
        else{
            return null;
        }
    }
}



abstract class Phone {
    void OS(){};
}

class Iphone extends Phone{
    void OS(){
        System.out.println("This is IOS");
    }
}

class Samsung extends Phone{
    void OS(){
        System.out.println("This is Android 12 ONE UI4.0");
    }
}

class Nokia extends Phone{
    void OS(){
        System.out.println("This is Android 12");
    }
}

class Ipod extends Phone{
    void OS(){
        System.out.println("This is IOS");
    }
}