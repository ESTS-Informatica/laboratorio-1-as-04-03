public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    private WordGenerator wordGenerator;

    public WordGuessingGame() {
        this.guessedWord= "___";
        this.numberOfTries=0;
        this.reader= new InputReader();
        this.wordGenerator = new WordGenerator();
        this.hiddenWord= "abc";

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
    public void setNumberOfTries(int numberOfTries){
        this.numberOfTries = numberOfTries;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public WordGenerator getWordGenerator() {
        return wordGenerator;
    }

    public void play(){
        showWelcome();
        while (!getGuessedWord().equals(getHiddenWord())){
            numberOfTries++;
            char guess = reader.getChar("Qual caracter pretende adivinhar?");
            guess(guess);
            showGuessedWord();
            }
        System.out.println("Muitos Parabéns! Você adivinhou!" );
        showResult();
    }
    public void initializeGuessedWord(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i<getHiddenWord().length(); i++){
            builder.append('_');
        }
        guessedWord = builder.toString();
    }

}
