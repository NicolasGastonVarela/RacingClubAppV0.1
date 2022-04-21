package Racing.src.main.java.RacingClubApp;

public class ClubApp {
    public static void main(String[] args){
    TestRunner testRunner = new TestRunner();
        System.out.println("Complete Club Information: " + "\n" + "Board: " + "\n" +
                testRunner.chairman.getChairmanInfo() + "\n" + "Staff: " + "\n" + testRunner.headCoach.getHeadCoachInfo()
                + "\n" + "Squad: " + "\n" + testRunner.player1.getPlayer1Info()+ "\n" + testRunner.player2.getPlayer2Info() + "\n" +
                testRunner.player3.getPlayer3Info() + "\n" + testRunner.player4.getPlayer4Info() + "\n" +
                testRunner.player5.getPlayer5Info() + "\n" + testRunner.player6.getPlayer6Info() + "\n" +
                testRunner.player7.getPlayer7Info() + "\n" + testRunner.player8.getPlayer8Info() + "\n" +
                testRunner.player9.getPlayer9Info() + "\n" + testRunner.player10.getPlayer10Info());
    }
}
