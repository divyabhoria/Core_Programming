public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double km3 = (4.0/3.0) * Math.PI * Math.pow(radiusKm, 3);
        double mile3 = km3 / Math.pow(1.60934, 3); // 1 mile = 1.60934 km
        System.out.println("The volume of earth in cubic kilometers is " + km3 + " and cubic miles is " + mile3);
    }
}
