package optional;

import optional.model.Hospital;

import java.util.Optional;

public class App {
    public static void main(String args) {
        OptionsApp optionsApp = new OptionsApp();
        Optional<Hospital> result = optionsApp.getHospital("ABC");

        System.out.println(result);
        if (result.isPresent())
        {
            Hospital hospital = result.get();
            System.out.println(hospital);


        }

    }
}
