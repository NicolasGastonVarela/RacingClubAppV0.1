package Racing.src.main.java.RacingClubApp;

public class Person {
    private String name;
    private String surname;
    private String role;

    public Person(String name, String surname, String role) {
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPersonInfo(){
        return "Name: " + getName() + "Surname: " + getSurname() + "Role: " + getRole();
    }
}


