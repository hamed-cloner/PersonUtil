import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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
        String ExampleString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
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


    public static List<String> searchString(List<String> list, String regex) {
        List<String> matched = new ArrayList<String>();
        Pattern p = Pattern.compile(regex);

        for(int n = 0; n < list.size(); n++){
            String item = list.get(n);
            Matcher m = p.matcher(item);
            if (m.find()) {
                matched.add(item);}
            else {
                continue;
            }
        }
        return matched;
    }
    public static <K, V> void printMap(Map<K,V> map){
        for (Map.Entry<K, V> entry : map.entrySet()){
            System.out.println("Age : " + entry.getKey() + " Persons : " + entry.getValue() );
        }
    }
}
