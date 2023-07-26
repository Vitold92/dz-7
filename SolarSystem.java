enum SolarSystem {
    MERCURY(0, 0, 2439, null),
    VENUS(1, 108, 6051, MERCURY),
    EARTH(2, 149, 6371, VENUS),
    MARS(3, 228, 3389, EARTH),
    JUPITER(4, 778, 69911, MARS),
    SATURN(5, 1427, 58232, JUPITER),
    URANUS(6, 2871, 25362, SATURN),
    NEPTUNE(7, 4497, 24622, URANUS);

    private int distanceFromSun;
    private int distanceFromPrevious;
    private int radius;
    private SolarSystem previousPlanet;
    private SolarSystem nextPlanet;

    SolarSystem(int prevDistance, int distanceFromSun, int radius, SolarSystem previous) {
        this.distanceFromPrevious = prevDistance;
        this.radius = radius;
        this.distanceFromSun = distanceFromSun;
        this.previousPlanet = previous;
        if (previous != null) {
            previous.nextPlanet = this;
        }
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public int getRadius() {
        return radius;
    }

    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }

    public SolarSystem getNextPlanet() {
        return nextPlanet;
    }
}

