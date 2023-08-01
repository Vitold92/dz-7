enum SolarSystem {
    MERCURY(0, 2439, null),
    VENUS(108, 6051, MERCURY),
    EARTH(149, 6371, VENUS),
    MARS(228, 3389, EARTH),
    JUPITER(778, 69911, MARS),
    SATURN(1427, 58232, JUPITER),
    URANUS(2871, 25362, SATURN),
    NEPTUNE(4497, 24622, URANUS);

    private int distanceFromSun;
    private int radius;
    private SolarSystem previousPlanet;
    private SolarSystem nextPlanet;

    SolarSystem(int prevDistance, int radius, SolarSystem previous) {
        this.radius = radius;
        this.previousPlanet = previous;
        if (previous != null) {
            this.distanceFromSun = previous.distanceFromSun + prevDistance + previous.radius;
            previous.nextPlanet = this;
        } else {
            this.distanceFromSun = 0;
        }
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getDistanceFromPrevious() {
        if (previousPlanet != null) {
            return previousPlanet.radius + distanceFromSun - radius;
        }
        return 0;
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

