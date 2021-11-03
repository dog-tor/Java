/**
 * dog-tor
 *
 * 3/20/2014
 * 
 * This program will be an abstract SuperClass that has a default constructor and two abstract methods.
 */
public class VehicleDriver
{
    public static void main(String[] args)
    {
        
        System.out.println("dog-tor");
        System.out.println("03/28/2014");
        System.out.println();
        System.out.println("                                         V   V   EEEEE   H   H   IIIII   CCCCC   L       EEEEE      DD      RRRR    IIIII   V   V   EEEEE   RRRR                   ");
        System.out.println("                                         V   V   E       H   H     I     C       L       E          D  D    R   R     I     V   V   E       R   R                ");
        System.out.println("                                         V   V   EEEEE   HHHHH     I     C       L       EEEEE      D   D   RRRR      I     V   V   EEEEE   RRRR                             ");
        System.out.println("                                          V V    E       H   H     I     C       L       E          D  D    R  R      I      V V    E       R  R                ");
        System.out.println("                                           V     EEEEE   H   H   IIIII   CCCCC   LLLLL   EEEEE      DD      R   R   IIIII     V     EEEEE   R   R                                     ");
        System.out.println("                                  ----------------------------------------------------------------------------------------------------------------------     ");
        System.out.println();
        System.out.println("\n\n\nCreating Ship object myCruise.");
        Cruise myCruise = new Cruise();
        System.out.println(myCruise);
        myCruise.setVehicleID("Pinkster");
        myCruise.setColor("Pink");
        myCruise.setAnchors(15);
        myCruise.setLifeVests(200);
        myCruise.setPools(3);
        myCruise.setSlides(4);
        System.out.println(myCruise);
        
        System.out.println("\n\n\nCreating Ship object myYacht.");
        Yacht myYacht = new Yacht();
        System.out.println(myYacht);
        myYacht.setVehicleID("YAH YACHT");
        myYacht.setColor("Brown");
        myYacht.setAnchors(2);
        myYacht.setLifeVests(5);
        myYacht.setCabins(1);
        myYacht.setChefs(1);
        System.out.println(myYacht);
        
        System.out.println("\n\n\nCreating Plane object myFighter.");
        Fighter myFighter = new Fighter();
        System.out.println(myFighter);
        myFighter.setVehicleID("FAST FLYER");
        myFighter.setColor("Neon Yellow");
        myFighter.setPilots(1);
        myFighter.setParachutes(2);
        myFighter.setMissles(4);
        myFighter.setBullets(500);
        System.out.println(myFighter);
        
        System.out.println("\n\n\nCreating Plane object myPassenger.");
        Passenger myPassenger = new Passenger();
        System.out.println(myPassenger);
        myPassenger.setVehicleID("BIG BIRDY");
        myPassenger.setColor("Black");
        myPassenger.setPilots(2);
        myPassenger.setParachutes(200);
        myPassenger.setAttendants(20);
        myPassenger.setBlankets(200);
        System.out.println(myPassenger);
        
        System.out.println("\n\n\nCreating Truck object myCargo.");
        Cargo myCargo = new Cargo();
        System.out.println(myCargo);
        myCargo.setVehicleID("HAUL");
        myCargo.setColor("Orange");
        myCargo.setCargoCapacity(15);
        myCargo.setTowPackage(true);
        myCargo.setWheels(18);
        myCargo.setCamper(true);
        System.out.println(myCargo);
        
        System.out.println("\n\n\nCreating Truck object myGarbage.");
        Garbage myGarbage = new Garbage();
        System.out.println(myGarbage);
        myGarbage.setVehicleID("GIMME TRASH");
        myGarbage.setColor("Green");
        myGarbage.setCargoCapacity(5);
        myGarbage.setTowPackage(true);
        myGarbage.setPoundsOfGarbage(69);
        myGarbage.setHasRoboticArm(true);
        System.out.println(myGarbage);
        
        System.out.println("\n\n\nCreating Car object mySports.");
        Sports mySports = new Sports();
        System.out.println(mySports);
        mySports.setVehicleID("2FAST");
        mySports.setColor("Red");
        mySports.setIsAutomatic(true);
        mySports.setHasSunRoof(true);
        mySports.setZeroToSixty(5.3);
        mySports.setHasNitrous(true);
        System.out.println(mySports);
        
        System.out.println("\n\n\nCreating Car object myFamily.");
        Family myFamily = new Family();
        System.out.println(myFamily);
        myFamily.setVehicleID("FAMOBILE");
        myFamily.setColor("Green");
        myFamily.setIsAutomatic(true);
        myFamily.setHasSunRoof(true);
        myFamily.setChildren(2);
        myFamily.setHasGoodGasMileage(true);
        System.out.println(myFamily);
    }
}