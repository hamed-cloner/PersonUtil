import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonUtils {

    static Random rand = new Random();

    //Creates Unique Id using given regex and length
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

    //Create Random name for persons using alphabet characters and given length
    public static String nameGenerator(long NameLength){
        String ExampleString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(Math.toIntExact(NameLength));
        for(int i = 0 ; i < NameLength ; i++){
            int index = (int)(ExampleString.length() * Math.random());
            sb.append(ExampleString.charAt(index));
        }
        return sb.toString();
    }

    // Create random Age for persons between 1-99
    public static int ageGenerator(){
        int agegen = rand.nextInt(98) + 1;
        return agegen;

    }

    // Search through the given list of people for items matching given regex
    public static List<String> searchString(List<String> list, String regex) {
        List<String> matched = new ArrayList<String>();
        Pattern p = Pattern.compile(regex);
        // iterate through the list checking each item to match the given regex
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

    // Iterate through the given Map of items and print out each value sorted by key
    public static <K, V> void printMap(Map<K,V> map){
        for (Map.Entry<K, V> entry : map.entrySet()){
            System.out.println("Age : " + entry.getKey() + " Persons : " + entry.getValue() );
        }
    }
}
