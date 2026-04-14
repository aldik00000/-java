import java.util.*; // Scanner, HashMap, ArrayList сияқты дайын құралдарды қолдану

public class Main {
    public static void main(String[] args) {

        // Пайдаланушыдан мәтін алу үшін Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Мәтін енгізіңіз:");
        String text = scanner.nextLine(); // толық жолды оқу

        // Егер мәтін бос болса – бағдарлама тоқтайды
        if (text.trim().isEmpty()) {
            System.out.println("❌ Қате: Мәтін бос!");
            return;
        }

        // Барлық әріптерді кіші әріпке айналдыру
        text = text.toLowerCase();

        // Мәтінді сөздерге бөлу (бос орын, үтір, нүкте арқылы)
        String[] words = text.split("\\W+");

        // Сөздердің жиілігін сақтау үшін карта (сөз - саны)
        HashMap<String, Integer> wordCount = new HashMap<>();

        int totalWords = 0; // жалпы сөз саны

        // Әр сөзді қарап, санау
        for (String word : words) {
            if (word.isEmpty()) continue; // бос сөздерді өткізіп жіберу

            // Егер сөз бар болса +1, болмаса 1 деп қосу
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            totalWords++;
        }

        // Бірегей (қайталанбайтын) сөздер саны
        int uniqueWords = wordCount.size();

        // Ең жиі кездесетін сөзді табу
        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }

        // Сөздерді жиілігі бойынша сұрыптау (кему ретімен)
        List<Map.Entry<String, Integer>> sortedList =
                new ArrayList<>(wordCount.entrySet());

        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Нәтижені шығару
        System.out.println("\n📊 Статистика:");
        System.out.println("Жалпы сөз саны: " + totalWords);
        System.out.println("Бірегей сөздер: " + uniqueWords);

        // Ең жиі сөз
        if (maxCount > 0) {
            System.out.println("Ең жиі сөз: " + mostFrequentWord + " (" + maxCount + " рет)");
        }

        // Барлық сөздердің жиілігін шығару
        System.out.println("\n📌 Сөздердің жиілігі:");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Scanner жабу (ресурсты босату)
        scanner.close();
    }
}