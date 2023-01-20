/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

import java.util.HashSet;
import property.Property;

/**
 *
 * @author tretali
 */
public class Owner extends AbstractAccount {
    
    HashSet <Property> myProperties;
    
    public Owner(String surname, String name, String login, String electronicAddress){
        super(surname, name, login, electronicAddress, "Owner");
        myProperties = new HashSet<>();
    }
    
    @Override
    public boolean isOwner(){
        return true;
    }
    
    public void addProperty(Property property){
        myProperties.add(property);
    }
    
}
