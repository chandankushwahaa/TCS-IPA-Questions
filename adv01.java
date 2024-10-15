/*
Create a class TravelAgencies with below attributes:
regNo - int
agencyName - String
packageType - String
price - int
flightFacility - boolean

Write getters, setters for the above attributes. Create constructor which takes parameter in tha above sequence.
Create class Solution with main method. Implement two static methods findAgencyWithHighestPackagePrice and agencyDetailsForGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method: This method will take array of TravelAgencies objects as an input
parameter and return the highest package price from the given array of objects.

agencyDetailsForGivenAndType method: This method will take three parameter - array of travelAgencies objects, int regNo
and String packageType. The method will return the travelAgencies object based on below conditions:-

FlightFacility should be available. The input parameter(regNo and packageType) should method with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null.
NOTE: Same Travel agency can have more than one package type. Travel agency and package type combination is unique.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For findAgencyWithHighestPackagePrice method: The main method should print the highestPackagePrice as it is.

for agencyDetailsForGivenIdAndType method: The main method should print the agencyName and price of the returned
object. The agencyName and price should concatinated with : while printing.



Input:
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Sliver
20000
false
987
Diamond

OUTPUT:
50000
Cox and Kings : 40000
*/

import java.util.*;

public class adv01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        travelAgencies[] arr = new travelAgencies[4];
        for(int i = 0; i < 4; i++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            boolean e = sc.nextBoolean();

            arr[i] = new travelAgencies(a, b, c, d, e);


        }
        int regNo = sc.nextInt(); sc.nextLine();
        String packgeType = sc.nextLine();

        int maxi = findAgencyWithHighestPackagePrice(arr);
        System.out.println(maxi);

//         AgencyName and price
        travelAgencies result = agencyDetailsForGivenAndType(arr, regNo, packgeType);
        System.out.println(result.getAgencyName() + " : " + result.getPrice());
    }

    public static int findAgencyWithHighestPackagePrice(travelAgencies[] arr){
        int max = arr[0].getPrice();
        for(int i = 1; i < arr.length; i++){
            if(arr[i].getPrice() > max){
                max = arr[i].getPrice();
            }
        }
        if(max  < 0){
            return 0;
        }
        else {
            return max;
        }
    }
    public static travelAgencies agencyDetailsForGivenAndType(travelAgencies[] arr, int regNo, String packageType){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].flightFacility == true){
                if(arr[i].regNo == regNo && arr[i].packageType.equals(packageType)){    // arr[i].getRegNo() == regNo
                    return arr[i];
                }
            }
        }
        return null;
    }
}

class travelAgencies{
    int regNo;
    String agencyName;
    String packageType;
    int price;
    boolean flightFacility;

    public travelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean isFlightFacility() {
        return flightFacility;
    }
}