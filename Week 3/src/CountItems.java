import java.util.ArrayList;

public class CountItems {

    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println(word);

        }
    }

    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);

    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("Selles listis on täpselt nii palju sõnu :");
        System.out.println(countItems(list));

        System.out.println();

        ArrayList<String> programmingLanguages = new ArrayList<String>();
        programmingLanguages.add("Pascal");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("C++");
        programmingLanguages.add("JavaScript");

        print(programmingLanguages);

        removeFirst(programmingLanguages);

        System.out.println(countItems(programmingLanguages));

        print(programmingLanguages);
    }
}
