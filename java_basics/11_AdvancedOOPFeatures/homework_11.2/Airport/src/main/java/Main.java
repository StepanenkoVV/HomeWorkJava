import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import javax.swing.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.TemporalAmount;
import java.util.*;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.stream.Collectors;

public class Main {
    public static final long HOUR = 3600 * 1000; // in milli-seconds.

    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println(findPlanesLeavingInTheNextTwoHours(airport));


    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.

        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        calendar.add(Calendar.HOUR, 2);
        Date datePlusTwoHours = calendar.getTime();


        List<Flight> collect = airport.getTerminals()
                .stream()
                .flatMap(terminal -> terminal.getFlights()
                        .stream())
                .filter(flight -> flight.getType().equals(Flight.Type.DEPARTURE))
                .filter(flight -> flight.getDate().after(now) && flight.getDate().before(datePlusTwoHours)) //рабочий
                .collect(Collectors.toList());


        return collect;

    }

}
