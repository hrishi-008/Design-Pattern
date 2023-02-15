public class revision{
    public static void main(String[] args) {
        Gold pendant = new Gold();
        System.out.println("This is Gold() and its methods: ");
        System.out.println(pendant.purity);
        System.out.println(pendant.rate);
        
        Student Kalash = new Student(317,"Kalash Jain",99);
        System.out.println("This is Kalash's info: ");
        System.out.println(Kalash.name + '\n'+ Kalash.marks +'\n'+ Kalash.rno);
        
        Student jod = new Student();
        System.out.println("This is to test default constructor of Student() class: " );
        System.out.println(jod.name + '\n'+ jod.marks +'\n'+ jod.rno);
        jod.marks = 45;
        Student jod2 = jod;
        // above statement assigns the address of jod to jod2 , there is no copying of Student() class to any memory location.
        System.out.println("This is location of jod2: " + jod2);
        System.out.println(jod);
        System.out.println("This is updated marks of jod " );
        System.out.println(jod.marks);
        System.out.println("This is updated marks of jod2 as marks of jod was changed: " );
        System.out.println(jod2.marks);
    }
}

abstract class metal{
    int rate;
    float purity;

    void calci(){}
}

class Gold extends metal{
    int rate;
    float purity;

    Gold(){
        this.rate=52200;
        this.purity = 22f;
    }

    void calci(){
        System.out.println("This is rate");
    }
}

class Joker{
    int rno;
    String name;
    // int rno = 25;
    // String name = "Gandu";
    
    Joker(){
        this(25, "joxer");
    }

    Joker(int roll, String name){
        rno=roll;
        this.name = name;
    }
}

class Student{
    int rno;
    String name;
    float marks;


    Student(){
        this(15,"Hrishikesh Kalola", 90);
    }
    
    Student(int rno, String name, float marks ){
        this.rno = rno;
        this.marks= marks;
        this.name = name;
    }

}
