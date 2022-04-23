package Racing.src.main.java.RacingClubApp;

public class Chairman extends Person{
    private String presidentialPeriodEnd;

    public Chairman(String name, String surname, String role) {
        super(name, surname, role);
        this.presidentialPeriodEnd = presidentialPeriodEnd;
    }

    public String getPresidentialPeriodEnd(String presidentialPeriodEnd) {
        return presidentialPeriodEnd;
    }

    public void setPresidentialPeriodEnd(String presidentialPeriodEnd) {
        this.presidentialPeriodEnd = presidentialPeriodEnd;
    }

    public String getChairmanInfo(){
       return getPersonInfo() + "Presidential Period End: " + getPresidentialPeriodEnd("2024");
    }

}
