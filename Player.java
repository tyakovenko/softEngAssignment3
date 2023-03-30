import java.util.List;

public class Player {
    private String firstName;
    private String lastName;

    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String name){
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String name){
    }

    public List<NSF> getNSFs(){
        return null;
    }

    public void setNSFs(List<NSF> NSFs){
    }

    @Override
    public String toString(){
        return "";
    }

    public void listPlayerNSFs(){
    }

    public void addNSF(NSF nsf){}

}
