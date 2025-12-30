import java.util.Scanner;

public class MoodDetection {

    public static String detectMood(String text) {
        text = text.toLowerCase();

        if (text.contains("happy") || text.contains("joy") || text.contains("smile"))
            return "😊 Happy";
        else if (text.contains("sad") || text.contains("cry") || text.contains("depressed"))
            return "😢 Sad";
        else if (text.contains("angry") || text.contains("mad") || text.contains("hate"))
            return "😠 Angry";
        else if (text.contains("fear") || text.contains("scared") || text.contains("afraid"))
            return "😨 Fear";
        else if (text.contains("surprised") || text.contains("shocked") || text.contains("wow"))
            return "😲 Surprise";
        else if (text.contains("love") || text.contains("romantic") || text.contains("caring"))
            return "❤️ Love";
        else if (text.contains("excited") || text.contains("thrilled") || text.contains("fantastic"))
            return "🤩 Excited";
        else if (text.contains("bored") || text.contains("tired") || text.contains("dull"))
            return "😐 Bored";
        else if (text.contains("confused") || text.contains("unsure") || text.contains("puzzled"))
            return "😕 Confused";
        else
            return "😶 Neutral";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text:");
        String input = sc.nextLine();
        System.out.println("Detected Mood: " + detectMood(input));
        sc.close();
    }
}
