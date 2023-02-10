package optional;

import optional.model.Hospital;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalApp {
    public Optional<Hospital> getHospital(String name)
    {
        Hospital hospital1 = new Hospital("01","ABC","Mumbai");
        Hospital hospital2 = new Hospital("02","NHG","Delhi");
        Map<String,Hospital> data = new HashMap<>();
        data.put("01",hospital1);
        data.put("02",hospital2);

        Hospital result= data.get(name);
        return Optional.ofNullable(result);




    }
}
