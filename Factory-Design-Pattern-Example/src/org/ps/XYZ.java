package org.ps;

// Singleton class Design Pattern
class ABC {
    private static ABC instance; // Singleton instance

    private ABC() {
        // Private constructor is used to Block the user to create an object
    }
    public static ABC getInstance() {
        if (instance == null) {
            instance = new ABC();
        }
        return instance;
    }
}

// Second class
public class XYZ {
    public static void main(String[] args) {
    	//ABC obj=new ABC(); // ERROR:The constructor ABC() is not visible.
        // Get the singleton instance of ABC
        ABC obj1 = ABC.getInstance();

        // Attempting to create a new object of ABC will return the same instance
        ABC obj2 = ABC.getInstance();

        // obj1 and obj2 will refer to the same instance of ABC
        System.out.println(obj1 == obj2); // Output: true
    }
}
