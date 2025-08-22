public class EarthVolume {
    public static void main(String[] args) {
        // Radius of Earth in km & taking variables for calculations
        double radiusKm = 6378;          
        double pi = 3.141592653589793;
        
        // Volume in cubic kilometers
        double volumeKm = (4.0/3) * pi * Math.pow(radiusKm, 3);
        
        // convert radius to miles
        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles = (4.0/3) * pi * Math.pow(radiusMiles, 3);
        // final result 
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm +  " and cubic miles is " + volumeMiles);
    }
}
