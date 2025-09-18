package Vocaloid;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class VocaloidDAO {
    private Map<String, Vocaloid> vocaloidMap;

    public VocaloidDAO() {
        vocaloidMap = new HashMap<>();
    }

    public void addVocaloid(Vocaloid vocaloid) {
        vocaloidMap.put(vocaloid.getId(), vocaloid);
    }

    public Vocaloid getVocaloidById(String id) {
        return vocaloidMap.get(id);
    }

    public List<Vocaloid> getAllVocaloids() {
        return new ArrayList<>(vocaloidMap.values());
    }

    public List<Vocaloid> getVocaloidsByManufacturer(String manufacturer) {
        List<Vocaloid> result = new LinkedList<>();
        for (Vocaloid v : vocaloidMap.values()) {
            if (v.getManufacturer().equalsIgnoreCase(manufacturer)) {
                result.add(v);
            }
        }
        return result;
    }

    public boolean removeVocaloidById(String id) {
        return vocaloidMap.remove(id) != null;
    }

    public Iterator<Vocaloid> iterator() {
        return vocaloidMap.values().iterator();
    }

    public boolean hasVocaloid(String id) {
        return vocaloidMap.containsKey(id);
    }
}
