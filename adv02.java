/*
Create a class Phone with below attributes: int os, String brand, String price
Write getters, setters and paramterized constructor in the above mentioned attributes sequence as required.
Create class Solution with main method.
Implement two static methods - findPriceForGivenBrand and getPhoneIdBaseOnOs in Solution class.

findPriceForGivenBrand method: This method will take two input parameters array of phone object and String parameter brand.
The method will take and return the sum of the price attribute from phone objects for the brand passed as paramter.
If no phone with the given brand is present in the array of phone objects, then the method should return 0.

getPhoneIdBaseOnOs method: This method will take a String parameter as along with the array of Phone objects.
The method will return the phone object, if the input string parameter matches with the os attribute of the
phone object and its price attribute is greater than or equal to 50000.
If any of the conditions are not met, then the method should return null.
NOTE: No phone object would have the same value for as attribute.
All phone object would have the price greater than 0. All the searches should be Case Sensitive.

These above mentioned static methods should be called from the main method.

findPriceForGivenBrand() : The main method should print as it is if the returned price is greater than 0,
or it should print "THe given Brand is not available"

getPhoneIdBaseOnOs() : The main method should print phoneId of the returned phone objet.
It the returned value is null then print "No phones are available with specified with os and price range."

Input:
111
ios
Apple
30000
222
android
samsang
50000
333
symbian
HTC
12000
444
Paranoid
HTC
89000
Blackberry
android

OUTPUT:
The given Brand is not available
222
*/


import java.util.Scanner;

public class adv02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] arr = new Phone[4];
        for(int i = 0; i < arr.length; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();

            arr[i] = new Phone(a, b, c, d);
        }
        String brand  = sc.nextLine();
        String os = sc.nextLine();

        int sum = findPriceForGivenBrand(arr, brand);
        if(sum > 0){
            System.out.println(sum);
        }else {
            System.out.println("The given Brand is not available");
        }

        Phone res = getPhoneIdBaseOnOs(arr, os);
        if(res != null){
            System.out.println(res.getPhoneId());
        }else {
            System.out.println("The given Brand is not available");
        }
    }
    public static int findPriceForGivenBrand( Phone[] arr, String brand){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getBrand().equals(brand)){
                sum += arr[i].getPrice();
            }
        }
        if(sum > 0)
            return sum;
        else
            return 0;
    }
    public static Phone getPhoneIdBaseOnOs(Phone[] arr, String os){
        Phone temp = null;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getOs().equals(os) && arr[i].getPrice() >= 50000) {
                return arr[i];
            }
        }
        return temp;
    }
}


class Phone{
    int phoneId;
    String os;
    String brand;
    int price;

//    Constructor
    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.os = os;
        this.brand = brand;
        this.price = price;
    }
//    getters
    public int getPhoneId() {
        return phoneId;
    }
    public String getOs() {
        return os;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}