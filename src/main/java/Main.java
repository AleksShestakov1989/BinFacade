public class Main {
    public static void main(String[] args) {

//        String a = String.valueOf(101010);
//        String b = String.valueOf(111111);
        String a = "101010";
        String b = "111111";

        BinOps bins = new BinOps();

        System.out.println(bins.sum(a, b));
        System.out.println(bins.mult(a, b));
    }
}
