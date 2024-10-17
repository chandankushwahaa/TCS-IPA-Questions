/*
Create a class resort with the below attributes:
resortid : int 
resortname: string
category: string
price: double
rating: double
The above attribrte should be private, write getters, setters and parameterized constructor as required.
create a class with main method.
Implement a static method - findAvgPriceByCategory in Solution class.

findAvgPriceByCategory(): This method will take two input paremeters- array of resort objects and string. The method will return the average price of resort(as int value)
from array of resort objects for the given category(string parameter passed) and whose rating is grater than 4.
If no resort with above condition is present inthe array of resort objectss, then the method should return 0.

Note: All the searches should be case insensitive.





*/
import java.util.Scanner;

public class basic02classes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of resorts:");
    int numberOfResorts = sc.nextInt();
    sc.nextLine();  // Consume newline left-over
    Resort[] resorts = new Resort[numberOfResorts];

    for (int i = 0; i < resorts.length; i++) {
      System.out.println("Enter details for Resort " + (i+1) + ":");
      int resortId = sc.nextInt();
      sc.nextLine();  // Consume newline
      String name = sc.nextLine();
      String category = sc.nextLine();
      double price = sc.nextDouble();
      double rating = sc.nextDouble();
      sc.nextLine();  // Consume newline

      resorts[i] = new Resort(resortId, name, category, price, rating);
    }

    System.out.println("Enter the category to search:");
    String inp_category = sc.nextLine();

    int averagePrice = Solution.findAvgPriceByCategory(resorts, inp_category);
    if (averagePrice > 0) {
      System.out.println("Average price of the " + inp_category + " Resort: " + averagePrice);
    } else {
      System.out.println("There are no such available resorts.");
    }

    sc.close();
  }
}

class Solution {
  public static int findAvgPriceByCategory(Resort[] resorts, String category) {
    double totalAmount = 0;
    int count = 0;

    for (Resort resort : resorts) {
      if (resort.getCategory().equalsIgnoreCase(category) && resort.getRating() > 4) {
        totalAmount += resort.getPrice();
        count++;
      }
    }

    if (count > 0) {
      return (int) (totalAmount / count);  // Return average as an integer
    } else {
      return 0;
    }
  }
}

class Resort {
  private int resortId;
  private String name;
  private String category;
  private double price;
  private double rating;

  // Getters and Setters
  public int getResortId() {
    return resortId;
  }

  public void setResortId(int resortId) {
    this.resortId = resortId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  // Parameterized Constructor
  public Resort(int resortId, String name, String category, double price, double rating) {
    this.resortId = resortId;
    this.name = name;
    this.category = category;
    this.price = price;
    this.rating = rating;
  }
}
