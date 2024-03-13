public class FullGame {
    private WordGuessingGame wordGuessingGame;
    private InputReader inputReader;

    public FullGame(){
        wordGuessingGame = new WordGuessingGame();
        inputReader = new InputReader();
    }

    public void reset(){
        wordGuessingGame.setNumberOfTries(0);
        wordGuessingGame.setHiddenWord(wordGuessingGame.getWordGenerator().generateWord());
        wordGuessingGame.initializeGuessedWord();
    }

    public void play(){
        do{
            reset();
            wordGuessingGame.play();
        }
        while(inputReader.getChar("Pretende jogar novamente? [s/n]") == 's');
    }
}
