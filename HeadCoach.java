package Racing;

public class HeadCoach extends Person{
    private String endOfContract;
    private String nickName;

    public HeadCoach(String name, String surname, String role) {
        super(name, surname, role);
        this.endOfContract = endOfContract;
        this.nickName = nickName;
    }

    public String getEndOfContract(String endOfContract) {
        return endOfContract;
    }

    public void setEndOfContract(String endOfContract) {
        this.endOfContract = endOfContract;
    }

    public String getNickName(String nickName) {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getHeadCoachInfo(){
        return getPersonInfo() + "End of Contract: " + getEndOfContract("2024, ") + "Nickname: " + getNickName("Gagao");
    }
}
