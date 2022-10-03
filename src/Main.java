import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello SkyPRO!");
        razdelitel();

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7,46,55,24,4,8,2,64,34));
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)%2 != 0 ) {
                result.add(nums.get(i));
            }
        }
        System.out.println(result.toString());

        razdelitel();

        Set<Integer> noSort = new HashSet<>();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)%2 == 0 ) {
                noSort.add(nums.get(i));
            }
        }
        List<Integer> sortArray = new ArrayList<>(noSort);
        Collections.sort(sortArray);
        System.out.println(sortArray.toString());

        razdelitel();

        List<String> array = new ArrayList<>(List.of("код", "с", "помощью", "которого", "можно", "код", "должен","работать", "с", "любой", "код", "должен", "можно"));
        Set<String> words = new HashSet<>();

        for (int j = 0; j < array.size(); j++) {
            for (int i = j + 1; i < array.size(); i++) {
                if (array.get(i) == array.get(j)) {
                    words.add(array.get(j));
                }
            }

        }
        System.out.println(words.toString());

        razdelitel();

        List<String> arrayWords = new ArrayList<>(List.of("код", "с", "помощью", "которого", "можно", "код", "должен",
                "работать", "с", "любой", "код", "должен"));
        List<Integer> countWords = new ArrayList<>();
        for (int i = 0; i < arrayWords.size(); i++) {
            int count = 1;
            for (int j = i +1; j < arrayWords.size(); j++) {
                if (arrayWords.get(i) == arrayWords.get(j)) {
                    count = count + 1;
                    arrayWords.remove(j);
                }
            }
            if (count > 1) {
                countWords.add(count);
            }
        }
        System.out.println("countWords = " + countWords);
    }

    public static void razdelitel() {
        System.out.println("=======================================");
    }
}