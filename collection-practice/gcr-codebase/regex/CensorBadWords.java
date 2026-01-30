public class CensorBadWords {
    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";

        String regex = "\\b(damn|stupid)\\b";

        String censoredText = text.replaceAll(regex, "****");

        System.out.println(censoredText);
    }
}
