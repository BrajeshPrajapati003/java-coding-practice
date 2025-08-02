class Vehicle{ // Parent class

    protected String brand;
    protected void displayBrand(){
        System.out.println("Brand: "+brand);
    }
}

class Car extends Vehicle{ // Child class
    
    public void setBrand(String brand){
        this.brand = brand;
    }
}

public class ShowProtectedSpecifier { // Main Class
    public static void main(String[] args) {
        Car c = new Car();
        c.setBrand("Mahindra"); // set brand using the public method
        c.displayBrand(); // Access the protected member and method
    }
}