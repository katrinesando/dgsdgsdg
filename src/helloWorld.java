public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello there");
        System.out.println("Hello there");
        System.out.println("Hello there");
        calc(3);
    }
    public static int calc(int num){
        if (num%2==0){
            return 0;
        }
        return 1;
    }
}
