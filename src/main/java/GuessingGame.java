public class GuessingGame {
    public static void main(String[] args) {
        Jar jar = new Jar();
        Prompter prompter = new Prompter(jar);
        prompter.AdministratorSetup();
        prompter.ShownMaxNumberOfItems();
        prompter.PrompToGuessUntilGetCorrectAnswer();
    }
}
