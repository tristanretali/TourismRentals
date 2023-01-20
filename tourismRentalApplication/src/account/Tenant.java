/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author tretali
 */
public class Tenant extends AbstractAccount {
    
    public Tenant(String surname, String name, String login, String electronicAddress){
        super(surname, name, login, electronicAddress, "Tenant");
    }
    
    @Override
    public boolean isTenant(){
        return true;
    }
    
}
