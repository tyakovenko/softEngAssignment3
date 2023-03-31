import java.util.ArrayList;
import java.util.List;

public class Player {
    private String firstName;
    private String lastName;
    private List<NSF> nsfs;

    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nsfs = new ArrayList<>();
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
        return firstName + "" + lastName;
    }

    public void listPlayerNSFs(){
        for(int i = 0; i < nsfs.size(); i++){
            if (i == nsfs.size() - 1){
                System.out.print(nsfs.get(i).toString());
            }else{
                System.out.print(nsfs.get(i).toString() + ", ");
            }
        }
    }

    public void addNSF(NSF nsf){
        nsfs.add(nsf);
    }

}
