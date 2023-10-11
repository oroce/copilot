// create a rock, paper, scissor game
// create a rock, paper, scissor game instructions should be in hungarian

package prompting;

import java.util.Scanner;

public class RockPaperScissor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] options = {"kő", "papír", "olló"};
    System.out.println("Üdvözöljük a Kő-Papír-Olló játékban!");
    System.out.println("A játék célja, hogy legyőzze az ellenfelet a megfelelő választással.");
    System.out.println("Kő legyőzi az ollót, olló legyőzi a papírt, papír legyőzi a követ.");
    System.out.println("A játékhoz válasszon egy lehetőséget (1: kő, 2: papír, 3: olló):");
    int userChoice = scanner.nextInt();
    int computerChoice = (int) (Math.random() * 3) + 1;
    System.out.println("Az Ön választása: " + options[userChoice - 1]);
    System.out.println("Az ellenfél választása: " + options[computerChoice - 1]);
    if (userChoice == computerChoice) {
      System.out.println("Döntetlen!");
    } else if ((userChoice == 1 && computerChoice == 3) || (userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2)) {
      System.out.println("Gratulálunk, Ön nyert!");
    } else {
      System.out.println("Sajnáljuk, Ön vesztett!");
    }
  }
}

// please write a readme for this