package datatypes;

public class prg9a {
    public static void main(String[] args) {
        int num = 10, i = 1, sum = 0;
        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println(+sum);
    }
}