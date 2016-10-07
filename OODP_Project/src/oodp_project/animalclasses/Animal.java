package oodp_project.animalclasses;
import java.awt.Polygon;


/**
 * Describes the basic operations possible in an animal.
 * 
 * @author Hrushikesh Vasista, Vedant Godhamgaonkar 
 * @version Assignment-1
 */
public interface Animal
{
    final static int SICK = 1;
    final static int HEALTHY = 2;
    final static int RECOVERING = 3;
    final static int OTHER = 4;
    
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
