import java.util.Scanner;

public class Prompter {
    private Jar jar;

    public Prompter(Jar jar) {
        this.jar = jar;
    }
    
    public void AdministratorSetup() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What type of item are in the Jar?:  ");
        String itemType = scanner.nextLine();
        int maxNumbersOfItems;  
      
        do {
          System.out.print("What is the maximum amount of " + itemType + "?: ");
          maxNumbersOfItems = Integer.parseInt(scanner.nextLine());
          if (maxNumbersOfItems > 1000) {
           System.out.print("Your guess must be less than 1000 \n"); 
          }
        } while (maxNumbersOfItems > 1000);  
      
        jar.setItemName(itemType);
        jar.setMaxNumberOfItems(maxNumbersOfItems);
    }
    
    public void ShownMaxNumberOfItems() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many "  + jar.getItemName() + " are in the jar? Pick a number between 1 and " + jar.getMaxNumberOfItems() + "\n");
    }
    
    public void PrompToGuessUntilGetCorrectAnswer() {
        int randomNumber = jar.fillJar();
        int tries = 0;
        Scanner scanner = new Scanner(System.in);
        for(int i=1; i <= jar.getMaxNumberOfItems(); i++) {
            tries++;
            System.out.print("Guess:  ");
            int guess = Integer.parseInt(scanner.nextLine());
            if (guess == randomNumber) {
                System.out.print("Congratulations!!! You got it in " + tries + " attempts");
                break;
            } else if (guess > randomNumber) {
                System.out.print("Your guess is too high \n");
            } else {
                System.out.print("Your guess is too low \n");
            }
        }
    }
}