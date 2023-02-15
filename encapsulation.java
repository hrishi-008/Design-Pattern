public class encapsulation {
    // java program for encapsulation
    public static void main(String[] args){
        student obj = new student();
        obj.setName("John");
        obj.setRoll(2);
        System.out.println(obj.getName());
        System.out.println(obj.getRoll());
    }
}

class student{
    String name;
    int roll;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getRoll(){
        return roll;
    }
    public void setRoll(int roll){
        this.roll = roll;
    }
}