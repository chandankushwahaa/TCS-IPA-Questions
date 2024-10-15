/*
Create a class Phone with below attributes: int os, String brand, String price
Write getters, setters and paramterized constructor in the above mentioned attributes sequence as required.
Create class Solution with main method.
Implement two static methods - findPriceForGivenBrand and getPhoneIdBaseOnOs in Solution class.

findPriceForGivenBrand method: This method will take two input parameters array of phone object and String parameter brand.
The method will take and return the sum of the price attrubute from phone objects for the brand passed as paramter.
If no phone with the given brand is present in the array of phone objects, then the method should return 0.

getPhoneIdBaseOnOs method: This method will take a String parameter as along with the array of Phone objects.
The method will return the phone object, if the input string parameter matches with the os attribute of the
phone object and its price attribute is greater than or equal to 50000.
If any of the conditions are not met, then the method should return null.
NOTE:


*/


public class adv02 {
    public static void main(String[] args) {

    }
//    findPriceForGivenBrand()
//    getPhoneIdBaseOnOs()
}


class Phone{
    int os;
    String brand;
    String price;

//    Constructor
    public Phone(int os, String brand, String price) {
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
//    getters
    public int getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public String getPrice() {
        return price;
    }
}