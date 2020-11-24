package Airport;

import java.util.ArrayList;

public class Airport {

    static ArrayList<Object> hangar = new ArrayList<Object>();
//    static String[] hangar;

//    static Object[] hangar = new Object[10];

    public static void land(Object plane) {
        hangar.add(plane);
    }

    public static String takeoff(Object plane) {
        hangar.remove(plane);
        return plane + " has taken off";
    }
}
