package Racing;

public class Player extends Person{
    private String shirtNumber;
    private String position;
    private String preferredFoot;

    public Player(String name, String surname, String role) {
        super(name, surname, role);
        this.shirtNumber = shirtNumber;
        this.position = position;
        this.preferredFoot = preferredFoot;
    }

    public String getShirtNumber(String shirtNumber) {
        return shirtNumber;
    }

    public void setShirtNumber(String shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public String getPosition(String position) {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPreferredFoot(String preferredFoot) {
        return preferredFoot;
    }

    public void setPreferredFoot(String preferredFoot) {
        this.preferredFoot = preferredFoot;
    }

    public String getPlayer1Info(){
        return getPersonInfo() + "Shirt Number: " + getShirtNumber("29, ") + "Position: " + getPosition("Midfielder, ")
                + "Preferred Foot: " + getPreferredFoot("Right");
    }

    public String getPlayer2Info(){
        return getPersonInfo() + "Shirt Number: " + getShirtNumber("5, ") + "Position: " + getPosition("Left Back, ")
                + "Preferred Foot: " + getPreferredFoot("Left");
    }

    public String getPlayer3Info(){
        return getPersonInfo() + "Shirt Number: " + getShirtNumber("23, ") + "Position: " + getPosition("Defensive Midfielder / Centre Back, ")
                + "Preferred Foot: " + getPreferredFoot("Right");
    }

    public String getPlayer4Info(){
        return getPersonInfo() + "Shirt Number: " + getShirtNumber("20, ") + "Position: " + getPosition("Centre Back, ")
                + "Preferred Foot: " + getPreferredFoot("Right");
    }

    public String getPlayer5Info(){
        return getPersonInfo() + "Shirt Number: " + getShirtNumber("10, ") + "Position: " + getPosition("Offensive Midfielder, ")
                + "Preferred Foot: " + getPreferredFoot("Left");
    }

    public String getPlayer6Info(){
        return getPersonInfo() + "Shirt Number: " + getShirtNumber("17, ") + "Position: " + getPosition("Left/Right Wing, ")
                + "Preferred Foot: " + getPreferredFoot("Left");
    }

    public String getPlayer7Info(){
        return getPersonInfo() + "Shirt Number: " + getShirtNumber("9, ") + "Position: " + getPosition("Centre Forward, ")
                + "Preferred Foot: " + getPreferredFoot("Right");
    }

    public String getPlayer8Info(){
        return getPersonInfo() + "Shirt Number: " + getShirtNumber("19, ") + "Position: " + getPosition("Midfielder, ")
                + "Preferred Foot: " + getPreferredFoot("Right");
    }

    public String getPlayer9Info(){
        return getPersonInfo() + "Shirt Number: " + getShirtNumber("1, ") + "Position: " + getPosition("Goalkeeper, ")
                + "Preferred Foot: " + getPreferredFoot("Right");
    }

    public String getPlayer10Info(){
        return getPersonInfo() + "Shirt Number: " + getShirtNumber("22, ") + "Position: " + getPosition("Offensive Midfielder, ")
                + "Preferred Foot: " + getPreferredFoot("Right");
    }
}
