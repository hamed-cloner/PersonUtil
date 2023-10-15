import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonUtils {

    static Random rand = new Random();
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

    public static String nameGenerator(long NameLength){
        String ExampleString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(Math.toIntExact(NameLength));
        for(int i = 0 ; i < NameLength ; i++){
            int index = (int)(ExampleString.length() * Math.random());
            sb.append(ExampleString.charAt(index));
        }
        return sb.toString();
    }
    public static int ageGenerator(){
        int agegen = rand.nextInt(98) + 1;
        return agegen;

    }

    public static void searchString(List list, String name){
        Pattern pattern = Pattern.compile(name);
        Matcher matcher = pattern.matcher(list.toString());

        if (matcher.find()) {
            System.out.println("match found!");
        }
        else
            System.out.println("match not found!");

    }
}
