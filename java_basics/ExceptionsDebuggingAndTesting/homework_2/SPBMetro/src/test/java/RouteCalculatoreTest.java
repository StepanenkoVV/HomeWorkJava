import core.Line;
import core.Station;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class RouteCalculatoreTest extends TestCase {
    StationIndex stationIndex;
    RouteCalculator routeCalculator;
    ArrayList<Station> stations;

    //Схема тестовой линии
    //[l1-Сокольники]
    //[l1-Красносельская]
    //[l1-Комсомольская]
    //[l1-Красные Ворота]
    //[l1-Чистые пруды]  ->[transfer]  ->[l2 - Сретенский бульвар]
    //                                   [l2-Чкаловская]            ->[transfer]->[l3-Курская]
    //                                                                            [l3-Бауманская]
    //                                                                            [l3-Электрозаводская]

    protected void setUp() {
        //<<<==========================================================>>>
        Line line1 = new Line(1, "Сокольническая_линия");
        Line line2 = new Line(2, "Люблинско_Дмитровская_линия");
        Line line3 = new Line(3, "Арбатско_Покровская_линия");
        //<<<==========================================================>>>
        stations = new ArrayList<>(); //
        //<<<==========================================================>>>
        Station station1_1 = new Station("Сокольники_1_1", line1);
        Station station1_2 = new Station("Красносельская_1_2", line1);
        Station station1_3 = new Station("Комсомольская_1_3", line1);
        Station station1_4 = new Station("Красные_Ворота_1_4", line1);
        Station station1_5 = new Station("Чистые_пруды_1_5", line1); //(пересадка на другую линию)
        stations.add(station1_1);
        stations.add(station1_2);
        stations.add(station1_3);
        stations.add(station1_4);
        stations.add(station1_5);
        //<<<==========================================================>>>
        Station station2_1 = new Station("Сретенский_бульвар_2_1", line2);
        Station station2_2 = new Station("Чкаловская_2_2", line2); //(пересадка на другую линию )
        stations.add(station2_1);
        stations.add(station2_2);
        //<<<==========================================================>>>
        Station station3_1 = new Station("Курская_3_1", line3);
        Station station3_2 = new Station("Бауманская_3_2", line3);
        Station station3_3 = new Station("Электрозаводская_3_3", line3);
        stations.add(station3_1);
        stations.add(station3_2);
        stations.add(station3_3);
        //<<<==========================================================>>>
        stationIndex = new StationIndex();
        //<<<==========================================================>>>
        line1.addStation(station1_1);
        line1.addStation(station1_2);
        line1.addStation(station1_3);
        line1.addStation(station1_4);
        line1.addStation(station1_5);
        //<<<==========================================================>>>
        line2.addStation(station2_1);
        line2.addStation(station2_2);
        //<<<==========================================================>>>
        line3.addStation(station3_1);
        line3.addStation(station3_2);
        line3.addStation(station3_3);
        //<<<==========================================================>>>

        stationIndex.addLine(line1);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);
        //<<<==========================================================>>>
        stationIndex.addStation(station1_1);
        stationIndex.addStation(station1_2);
        stationIndex.addStation(station1_3);
        stationIndex.addStation(station1_4);
        stationIndex.addStation(station1_5);
        //<<<==========================================================>>>
        stationIndex.addStation(station2_1);
        stationIndex.addStation(station2_2);
        //<<<==========================================================>>>
        stationIndex.addStation(station3_1);
        stationIndex.addStation(station3_2);
        stationIndex.addStation(station3_3);
        //<<<==========================================================>>>
        //Пересадка с 1-ой на 2-ую линию
        List<Station> line1_line2 = new ArrayList<>();
        line1_line2.add(station1_5);
        line1_line2.add(station2_1);
        stationIndex.addConnection(line1_line2);
        //<<<==========================================================>>>
        //Пересадка с 2-ой на 3-ую линию
        List<Station> line2_line3 = new ArrayList<>();
        line2_line3.add(station2_2);
        line2_line3.add(station3_1);
        stationIndex.addConnection(line2_line3);

        routeCalculator = new RouteCalculator(stationIndex);


    }

    @Test
    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(stations);
        double expected = (4 * 2.5) + 3.5 + (1 * 2.5) + 3.5 + (2 * 2.5);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsConnected() {

        List<Station> routeActual = new ArrayList<>();
        routeActual.add(stationIndex.getStation("Чистые_пруды_1_5", 1));
        routeActual.add(stationIndex.getStation("Сретенский_бульвар_2_1", 2));

        Set<Station> connected = stationIndex.getConnectedStations(stationIndex.getStation("Чистые_пруды_1_5"));

        assertTrue(connected.contains(stationIndex.getStation("Сретенский_бульвар_2_1")));


    }

    public void testGetRouteViaConnectedLine() {

        List<Station> routeActual = new ArrayList<>();
        routeActual.add(stationIndex.getStation("Сретенский_бульвар_2_1", 2));
        routeActual.add(stationIndex.getStation("Чкаловская_2_2", 2));

        List<Station> routeExpected = routeCalculator.getShortestRoute(stationIndex.getStation("Сретенский_бульвар_2_1"),
                stationIndex.getStation("Чкаловская_2_2"));

        assertEquals(routeActual, routeExpected);

    }


    @Test
    public void testGetRouteOnTheLine() {

        List<Station> route = new ArrayList<>();
        route.add(stationIndex.getStation("Сокольники_1_1", 1));
        route.add(stationIndex.getStation("Красносельская_1_2", 1));
        route.add(stationIndex.getStation("Комсомольская_1_3", 1));
        route.add(stationIndex.getStation("Красные_Ворота_1_4", 1));
        route.add(stationIndex.getStation("Чистые_пруды_1_5", 1));

        List<Station> actualRoute = routeCalculator.getShortestRoute(stationIndex.getStation("Сокольники_1_1"),
                stationIndex.getStation("Чистые_пруды_1_5"));

        assertEquals(route, actualRoute);

    }

    public void testGetRouteWithOneConnection() {

        List<Station> route = new ArrayList<>();
        route.add(stationIndex.getStation("Сокольники_1_1", 1));
        route.add(stationIndex.getStation("Красносельская_1_2", 1));
        route.add(stationIndex.getStation("Комсомольская_1_3", 1));
        route.add(stationIndex.getStation("Красные_Ворота_1_4", 1));
        route.add(stationIndex.getStation("Чистые_пруды_1_5", 1));

        route.add(stationIndex.getStation("Сретенский_бульвар_2_1", 2));
        route.add(stationIndex.getStation("Чкаловская_2_2", 2));


        List<Station> actualRoute = routeCalculator.getShortestRoute(stationIndex.getStation("Сокольники_1_1", 1),
                stationIndex.getStation("Чкаловская_2_2", 2));
        assertEquals(route, actualRoute);

    }

    public void testGetRouteWithTwoConnections() {
        List<Station> route = new ArrayList<>();
        route.add(stationIndex.getStation("Сокольники_1_1", 1));
        route.add(stationIndex.getStation("Красносельская_1_2", 1));
        route.add(stationIndex.getStation("Комсомольская_1_3", 1));
        route.add(stationIndex.getStation("Красные_Ворота_1_4", 1));
        route.add(stationIndex.getStation("Чистые_пруды_1_5", 1));
        route.add(stationIndex.getStation("Сретенский_бульвар_2_1", 2));
        route.add(stationIndex.getStation("Чкаловская_2_2", 2));
        route.add(stationIndex.getStation("Курская_3_1", 3));
        route.add(stationIndex.getStation("Бауманская_3_2", 3));
        route.add(stationIndex.getStation("Электрозаводская_3_3", 3));


        List<Station> actualRoute = routeCalculator.getShortestRoute(stationIndex.getStation("Сокольники_1_1", 1),
                stationIndex.getStation("Электрозаводская_3_3", 3));

        assertEquals(route, actualRoute);
    }

//
//    @Override
//    protected void tearDown() throws Exception {
//        // super.tearDown();
//    }
}
