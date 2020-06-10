package collection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;  //Map.containsKey(key) и Map.get(key).
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);

        }
        return rsl;
    }


    public Citizen get(String passport) {
        return null;
    }
}
