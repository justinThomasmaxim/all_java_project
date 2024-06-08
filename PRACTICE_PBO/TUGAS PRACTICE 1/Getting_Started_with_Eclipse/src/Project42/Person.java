//package Project42;
//
//// This class will define a person and the information about a person that is needed
//
//public class Person {
//
//// Declare a variable for the person's name
//// Declare a variable for the person's age
//	
//	public Person() { // include parameters for name and age
//		// create a constructur that will initialize the name and age variables
//	}
//
//	// create a method called getName() that will return the person's name
//	
//	// create a method called getAge() that will return the person's age
//	
//	// create a method called getAge() that will set the person's age
//}

package Project42;

public class Person {
    // Declare a variable for the person's name
    private String name;
    
    // Declare a variable for the person's age
    private int age;

    public Person(String initialName, int initialAge) {
        // Constructor that initializes the name and age variables
        name = initialName;
        age = initialAge;
    }

    // Method to get the person's name
    public String getName() {
        return name;
    }

    // Method to get the person's age
    public int getAge() {
        return age;
    }

    // Method to set the person's age
    public void setAge(int newAge) {
        age = newAge;
    }
}

