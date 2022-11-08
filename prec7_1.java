// Name :-aswani darsh
// Roll-no :-21ce006
import java.util.Arrays;

public class prec7_1 {
    public static void main(String[] args) {
        P7_1[] s = new P7_1[4];
        s[0] = new P7_1("Darsh", 25, 53);
        s[1] = new P7_1("Deep", 91, 49);
        s[2] = new P7_1("Yashu", 21, 35);
        s[3] = new P7_1("Prince", 20, 85);
        System.out.println("------------------------------------ --------------");
        System.out.println("Before sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("------------------------------------ --------------");
        Arrays.sort(s);
        System.out.println("After sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("------------------------------------ --------------");
        System.out.println("this program is created by aswani adsrh 21ce006");
    }
}