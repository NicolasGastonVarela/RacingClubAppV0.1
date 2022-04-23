package Racing.src.main.java.RacingClubApp;

import java.util.Scanner;

public class RestartMenu {

    TestRunner testRunner = new TestRunner();
    Scanner keyboard = new Scanner(System.in);

    public void restartMenu() {
        System.out.println("\n" + "Please enter A for Board info, B for Staff info, C for Squad info or other key for exit");
        String app = keyboard.nextLine();
        switch (app) {
            case "A" -> {
                System.out.println("Board: " + "\n" + testRunner.chairman.getChairmanInfo());
                restartMenu();
            }

            case "B" -> {
                System.out.println("Staff: " + "\n" + testRunner.headCoach.getHeadCoachInfo());
                restartMenu();
            }
            case "C" -> {
                System.out.println("Squad: " + "\n" + testRunner.player1.getPlayer1Info() + "\n" + testRunner.player2.getPlayer2Info() + "\n" +
                        testRunner.player3.getPlayer3Info() + "\n" + testRunner.player4.getPlayer4Info() + "\n" +
                        testRunner.player5.getPlayer5Info() + "\n" + testRunner.player6.getPlayer6Info() + "\n" +
                        testRunner.player7.getPlayer7Info() + "\n" + testRunner.player8.getPlayer8Info() + "\n" +
                        testRunner.player9.getPlayer9Info() + "\n" + testRunner.player10.getPlayer10Info());
                restartMenu();
            }
            default -> System.out.println("Thanks for using Racing Club App");

        }
    }
}
