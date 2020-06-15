public class Task3 {
    public static void main(String[] args){
        System.out.println(fractional(0.01));
        System.out.println(fractional(0.5));
        System.out.println(fractional(123.321));
        System.out.println(fractional(555.53));
        System.out.println(fractional(999.999999));

        }
    static double fractional(double num) {
       return num%1;
    }
}
