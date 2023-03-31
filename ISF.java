import java.util.ArrayList;
import java.util.List;

public class ISF {
    private String name;
    private List<NSF> nsfs;

    ISF(String name){
        this.name = name;
        this.nsfs = new ArrayList<>();
    }

    //this is not in the diagram but following directions this would need to be present
    void setNSFs(List<NSF> nsfs) {
        this.nsfs = nsfs;
    }

    void setName(String name) {
        this.name = name;
    }

    List<NSF> getNSFs() {
        return nsfs;
    }

    String getName() {
        return name;
    }

    int countNSFs(){
        return 0;
    }

    int countPlayersInNSFs(){
        int count = 0;
        for (int i = 0; i < nsfs.size(); i++){
            count = count + nsfs.get(i).getPlayers().size();
        }
        return count;
    }

    boolean addNSF (NSF nsf){
        this.nsfs.add(nsf);
        return true;
    }
}
