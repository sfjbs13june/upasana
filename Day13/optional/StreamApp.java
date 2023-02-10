package optional;

import optional.model.Hospital;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApp {
    private static Hospital[] arrayOfHospital= {
            new Hospital("1", "ABC","Mumbai"),
            new Hospital("2", "DEF", "Pune"),
            new Hospital("3", "GHI", "Delhi")
    };

    public Stream<Hospital> getHospitalArray()
    {
        return Stream.of(arrayOfHospital);
    }

    public Stream<Hospital> getHospitalList(){
        List<Hospital> hosList = Arrays.asList(arrayOfHospital);
        return hosList.stream();
    }

    public Stream<Hospital> getHospitalData(){
        return  Stream.of(arrayOfHospital[0], arrayOfHospital[1], arrayOfHospital[2]);
    }

    public Stream<Hospital> getHospitalStreamBulider(){
        Stream.Builder<Hospital> hosStreamBuilder = Stream.builder();

        hosStreamBuilder.accept(arrayOfHospital[0]);
        hosStreamBuilder.accept(arrayOfHospital[1]);
        hosStreamBuilder.accept(arrayOfHospital[2]);

        Stream<Hospital> hospitalStream = hosStreamBuilder.build();
        return hospitalStream;
    }
}
