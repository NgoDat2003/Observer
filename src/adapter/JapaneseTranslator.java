package adapter;

public class JapaneseTranslator {
    public String translateToJapanese(String text) {

        if ("xin chào".equalsIgnoreCase(text)) {
            return "こんにちは";  // "こんにちは"
        }
        return "Không dịch được";  
}
