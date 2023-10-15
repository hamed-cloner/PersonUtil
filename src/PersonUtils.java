import java.util.Random;

public class PersonUtils {

    public static String UniqueIdGenerator(String regex, long length) {
        Random rand = new Random();
        String UniqueID = "";
        int n = 0;
        while (length > 0) {
            n = rand.nextInt(94) + 33;
            char c = (char) n;
            if (Character.toString(c).matches(regex) && Character.isDigit(c)) {
                UniqueID += c;
            } else {
                continue;
            }
            length--;
        }
        return UniqueID;
    }
}
