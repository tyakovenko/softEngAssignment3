import java.util.ArrayList;
import java.util.List;

public class IOC {
    private String name;
    private List<ISF> isfs;

   IOC (String name)
    {
        this.name= name;
        this.isfs = new ArrayList<>();
    }

    String getName() {
        return name;
    }

   void setIsfs(List<ISF> isfs) {
        this.isfs = isfs;
    }

    void setName(String name) {
        this.name = name;
    }

    int countNSFs(){
       return 0;
    }

    int countPlayersInISFNSFs(){
       int count = 0;
       for (int i =0; i < isfs.size(); i++){
           count = count + isfs.get(i).countPlayersInNSFs();
       }
       return count;
    }

}
