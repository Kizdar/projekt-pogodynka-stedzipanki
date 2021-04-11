package pogodynka.repozytory;

import pogodynka.model.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repo {
    //    private static Integer id;
//    private static Location location;
    private static Map<Integer, Location> saveMap = new HashMap<>();

    public static void putToMap(Integer key, Location location) {
        saveMap.put(key, location);
    }

    public static Location getValue(Integer key){
        return saveMap.get(key);
    }

    public static Set<Integer> getKeyMap() {
        return saveMap.keySet();
    }



}





