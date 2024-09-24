import java.util.ArrayList;
import java.util.List;

public class HalloJavaMitForEach {

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        
        stringList.add("Thorsten");
        stringList.add("Kollnberger");

        for (String string : stringList) {
            System.out.println(string);
        }

        stringList.forEach(System.out::println);
    }
}