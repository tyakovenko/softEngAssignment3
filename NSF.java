import java.util.ArrayList;
import java.util.List;

public class NSF {
    protected String sport;
    protected String country;
    private List<Player> players;

    NSF (String sport, String country){
        this.country = country;
        this.sport = sport;
        this.players = new ArrayList<Player>();

    }
    public String getSport(){
        return this.sport;
    }
    public String getCountry(){
        return this.country;
    }

    public void setSport(String sport){
    }
    public void setCountry(String country){
    }

    public List<Player> getPlayers(){
        return this.players;
    }

    public void setPlayers(List<Player> players){
    }

    @Override
    public String toString(){
        return this.country + this.sport;
    }

    public void listNSFPlayers(){
        for(int i = 0; i < players.size(); i++){
            System.out.print(players.get(i) + ", ");
        }
    }

    public void addPlayer (Player player){
    }


}
