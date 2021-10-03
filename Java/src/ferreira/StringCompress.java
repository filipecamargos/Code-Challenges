package ferreira;
import java.util.*;

public class StringCompress {

    public static String compressedString(String a) {
        String compressedStr = "";   

        int len = a.length();
        for (int i = 0; i < len; i++) {
            int count = 1;
            while (i < len - 1 && a.charAt(i) == a.charAt(i + 1)){
                count++;
                i++;
            }
            if (count == 1) {
               compressedStr += (Character.toString(a.charAt(i)));
            } else {
                compressedStr += (Character.toString(a.charAt(i)) + count);
            }
        }

        return compressedStr;
    }

    static public void main(String[] args) {
        System.out.println("Passing aaabcddc -> expected: a3bcd2c returned: " + compressedString("aaabcddc"));
        System.out.println("Passing aaabcddccc -> expected: a3bcd2c3 returned: " + compressedString("aaabcddccc"));
        System.out.println("Passing aaabbbcczddccc -> expected: a3b3c2zd2c3 returned: " + compressedString("aaabbbcczddccc"));
    }
}