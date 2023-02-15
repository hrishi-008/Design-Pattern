public class revise_poly{
    public static void main(String[] args){
        revise_poly obj = new revise_poly();
        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
    // method with 2 parameters
    public void add(int a, int b){
        System.out.println(a + b);
    }
    // method with 3 parameters
    public void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
}
