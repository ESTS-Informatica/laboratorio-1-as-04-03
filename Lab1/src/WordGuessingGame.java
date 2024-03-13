public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;

    public WordGuessingGame{
        this.hiddenWord="abc";
        this.guessedWord= "___"
        this.numberOfTries=0;
    }
    public String getHiddenWord(){
        return hiddenWord;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public String getGuessedWord() {
        return guessedWord;
    }

    public void showGuessedWord(){
        System.out.println("Estado: " + guessedWord);
    }
}
