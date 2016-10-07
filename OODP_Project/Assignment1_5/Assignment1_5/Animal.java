
/**
 * Describes the basic operations possible in an animal.
 * 
 * @author Hrushikesh Vasista, Vedant Godhamgaonkar 
 * @version Assignment-1
 */
public interface Animal
{
    final static int SICK = 1;
    final static int DEPRESSED = 1;
    final static int HEALTHY = 5;
    final static int RECOVERING = 1;
    final static int ACTIVE = 1;
    final static int LAZY = 1;
    final static int OBESE = 1;    
    final static int FAMISHED = 1;
    final static int VACCINATED = 1;
    
    /**
     * Display the following details: animal name, type, ready for adoption?, medical condition, 
     * picture, notes.
     * 
     * @return        animal details
     */
    String toString();
    
    String name();
    Polygon draw();
    String type();
    String notes();
    int getAge();
    int getRegistrationId();
    boolean adoptionStatus();
    
    
    
}
