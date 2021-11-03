/**
 * dog-tor
 *
 * 3/3/2014
 * 
 * This program will demonstrate basic inheritance
 * and the "IS-A" relationship between subclasses
 * and superclasses.
 */
public class PersonDriver
{
    public static void main(String[] args)
    {
        System.out.println("\n\n\nCreating Student object myStudent.");
        Student myStudent = new Student();
        System.out.println(myStudent);
        myStudent.setName("Jonathan");
        myStudent.setAge(17);
        myStudent.setProfession("Fast food chef");
        myStudent.setFavSubject("Physics");
        myStudent.setGpa(3.6);
        System.out.println(myStudent);
        
        System.out.println("\n\n\nCreating Teacher object myTeacher.");
        Teacher myTeacher = new Teacher();
        System.out.println(myTeacher);
        myTeacher.setName("John Alamo");
        System.out.println("myTeacher's name is: " + myTeacher.getName());
        myTeacher.setAge(69);
        System.out.println("myTeacher's age is: " + myTeacher.getAge());
        myTeacher.setProfession("Teacher");
        System.out.println("myTeacher's profession is: " + myTeacher.getProfession());
        myTeacher.setSubject("Computer Science");
        System.out.println("myTeacher's subject is: " + myTeacher.getSubject());
        myTeacher.setStudents(14);
        System.out.println("myTeacher's number of students is: " + myTeacher.getStudents());
        
        System.out.println("\n\n\nCreating Farmer object myFarmer.");
        Farmer myFarmer = new Farmer();
        System.out.println(myFarmer);
        myFarmer.setName("Billy Bob");
        System.out.println("myFarmer's name is: " + myFarmer.getName());
        myFarmer.setAge(53);
        System.out.println("myFarmer's age is: " + myFarmer.getAge());
        myFarmer.setProfession("Farmer");
        System.out.println("myFarmer's profession is: " + myFarmer.getProfession());
        myFarmer.setTool("Hoe");
        System.out.println("myFarmer's tool is: " + myFarmer.getTool());
        myFarmer.setCrop("Corn");
        System.out.println("myFarmer's crop is: " + myFarmer.getCrop());
        
        System.out.println("\n\n\nCreating Musician object myMusician.");
        Musician myMusician = new Musician();
        System.out.println(myMusician);
        myMusician.setName("Beethoven");
        System.out.println("myMusician's name is: " + myMusician.getName());
        myMusician.setAge(46);
        System.out.println("myMusician's age is: " + myMusician.getAge());
        myMusician.setProfession("Musician");
        System.out.println("myMusician's profession is: " + myMusician.getProfession());
        myMusician.setGenre("Electrohouse");
        System.out.println("myMusician's genre is: " + myMusician.getGenre());
        myMusician.setInstrument("LaunchPad");
        System.out.println("myMusician's instrument is: " + myMusician.getInstrument());
        
    }
}
