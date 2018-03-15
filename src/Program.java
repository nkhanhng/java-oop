public class Program {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Hello CI");

        int a=5;
        int b = 6;

//        String output = String.format("a = %d, b = %d,", a,b);
//        System.out.println(output);

        System.out.println(String.format("a = %s, b = %s", a,b));

        System.out.println(a);
        System.out.println(b);
        System.out.println(b/a);
    }
}
