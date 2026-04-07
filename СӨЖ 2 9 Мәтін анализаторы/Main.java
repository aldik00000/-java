import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Мәтін енгізіңіз:");
        String text = scanner.nextLine();

        // Егер бос болса
        if (text.trim().isEmpty()) {
            System.out.println("❌ Қате: Мәтін бос!");
            return;
        }

        text = text.toLowerCase();

        String[] words = text.split("\\W+");

        HashMap<String, Integer> wordCount = new HashMap<>();

        int totalWords = 0;

        for (String word : words) {
            if (word.isEmpty()) continue;

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            totalWords++;
        }

        int uniqueWords = wordCount.size();

        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        List<Map.Entry<String, Integer>> sortedList =
                new ArrayList<>(wordCount.entrySet());

        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\n📊 Статистика:");
        System.out.println("Жалпы сөз саны: " + totalWords);
        System.out.println("Бірегей сөздер: " + uniqueWords);

        if (maxCount > 0) {
            System.out.println("Ең жиі сөз: " + mostFrequentWord + " (" + maxCount + " рет)");
        }

        System.out.println("\n📌 Сөздердің жиілігі:");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}