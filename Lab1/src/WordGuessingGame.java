public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;

    public WordGuessingGame() {
        this.hiddenWord="abc";
        this.guessedWord= "___";
        this.numberOfTries=0;
        this.reader= new InputReader();
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

    private void showWelcome(){
        System.out.println("#####Bem Vindo ao Jogo#####");
    }
    private void guess(char guess){
        for (int i=0; i<hiddenWord.length(); i++){
            if (hiddenWord.toLowerCase().charAt(i) == guess){
                StringBuilder builder = new StringBuilder(getGuessedWord());
                builder.setCharAt(i, guess);
                guessedWord= builder.toString();
            }
        }
    }
    private void showResult(){
        System.out.println("O número de tentativas foi: " + getNumberOfTries());
    }
    public void play(){
        char guess = reader.getChar("Qual caracter quer colocar?");
        guess(guess);
    }
}
