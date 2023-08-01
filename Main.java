public class Main {
    public static void main(String[] args) {
        SolarSystem mercury = SolarSystem.MERCURY;
        SolarSystem venus = SolarSystem.VENUS;
        SolarSystem earth = SolarSystem.EARTH;
        SolarSystem mars = SolarSystem.MARS;
        SolarSystem jupiter = SolarSystem.JUPITER;
        SolarSystem saturn = SolarSystem.SATURN;
        SolarSystem uranus = SolarSystem.URANUS;
        SolarSystem neptune = SolarSystem.NEPTUNE;

        System.out.println("Mercury distance from Sun: " + mercury.getDistanceFromSun() + " million km");
        System.out.println("Venus distance from Sun: " + venus.getDistanceFromSun() + " million km");
        System.out.println("Earth distance from Sun: " + earth.getDistanceFromSun() + " million km");
        System.out.println("Mars distance from Sun: " + mars.getDistanceFromSun() + " million km");
        System.out.println("Jupiter distance from Sun: " + jupiter.getDistanceFromSun() + " million km");
        System.out.println("Saturn distance from Sun: " + saturn.getDistanceFromSun() + " million km");
        System.out.println("Uranus distance from Sun: " + uranus.getDistanceFromSun() + " million km");
        System.out.println("Neptune distance from Sun: " + neptune.getDistanceFromSun() + " million km");

        System.out.println("Next planet after Earth is: " + earth.getNextPlanet());
    }
}

