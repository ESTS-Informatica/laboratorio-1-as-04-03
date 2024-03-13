import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WordGenerator {
    private ArrayList<String>words;
    private static Random random = new Random();
    public WordGenerator(){
        words = new ArrayList<>();
    }
    private void fillArrayList(){
        words = new ArrayList<String>(Arrays.asList("boolean", "break", "byte", "case", "char", "class", "continue", "do", "double", "else",
                "enum", "for", "if", "import", "int"));
    }
    public String generateWord(){
        return words.get(random.nextInt(words.size()));
    }
    public void addWord(String word){
        if (word != null && !word.isEmpty()){
            words.add(word);
        }
    }
}
