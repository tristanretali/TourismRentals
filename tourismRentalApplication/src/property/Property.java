/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package property;

import account.Owner;
import bid.Bid;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * class representing a property
 * 
 * @author pielaporte
 */
public class Property {
    private int code;
    private String name;
    private String type;
    private String coordinate;
    private String description;
    private int maxOccupiers;
    private int nominalPrice;
    private Owner owner;
    private ArrayList<Bid> bids = new ArrayList<>();
    static ArrayList<Property> properties = new ArrayList<>();
    Property(String myName, String myType, String myCoordinate, String myDescription, int myMaxOccupiers, int myNominalPrice, Owner myOwner){
        code = properties.size();
        name = myName;
        type = myType;
        coordinate = myCoordinate;
        description = myDescription;
        maxOccupiers = myMaxOccupiers;
        nominalPrice = myNominalPrice;
        owner = myOwner;
    }
    
    private void changeData() throws changeDataException{
        String stringRead;
        Scanner scan = new Scanner(System.in);
        boolean fini = false;
        while(!fini){
        System.out.println("1. change name");
        System.out.println("2. change type");
        System.out.println("3. change coordinate");
        System.out.println("4. change description");
        System.out.println("5. change maxOccupiers");
        System.out.println("6. change nominalPrice");
        System.out.println("7. quit");
        System.out.println("Choose an option :");
        stringRead = scan.nextLine();
            switch(stringRead){
                case("1"):
                    System.out.println("The current name is " + this.name + ", choose a new name :");
                    name = scan.nextLine();
                break;
                case("2"):
                    System.out.println("1. Estate");
                    System.out.println("2. Home");
                    System.out.println("3. Apartment");
                    System.out.println("The current type is " + this.type + ", choose a new type :");
                    stringRead = scan.nextLine();
                    if(stringRead == "1"){
                        this.type = "Estate";
                    }else if(stringRead == "2"){
                        this.type = "Home";
                    }else if(stringRead == "3"){
                        this.type = "Apartment";
                    }else{
                        throw new changeDataException("The number choose is invalid");
                    }
                break;
                case("3"):
                    System.out.println("The coordinate is " + this.coordinate + ", choose a new coordinate :");
                    coordinate = scan.nextLine();     
                break;
                case("4"):
                    System.out.println("The description is " + this.description + ", choose a new description :");
                    description = scan.nextLine();
                break;
                case("5"):
                    System.out.println("The max occupiers is " + this.maxOccupiers + ", choose a new max occupiers :");
                    stringRead = scan.nextLine();
                    try{
                        Integer.parseInt(stringRead); 
                    }catch (Exception e) {
                        System.err.println("Error: please enter an integer.");
                    }
                    maxOccupiers = Integer.parseInt(stringRead);
                break;
                case("6"):
                    System.out.println("The nominal price is " + this.nominalPrice + ", choose a new nominal price :");
                    description = scan.nextLine();
                break;  
                case("7"):
                    fini = true;
            }
        }
    }
}
