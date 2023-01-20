/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

import java.util.ArrayList;


/**
 *
 * @author tretali
 */
public class Administrator extends AbstractAccount {   
    
    ArrayList<Account> allAccount;
    
    public Administrator(String surname, String name, String login, String electronicAddress){
        super(surname, name, login, electronicAddress, "Administrator");
        allAccount = new ArrayList<>();
    }
    
    @Override
    public boolean isAdministrator(){
        return true;
    }
    
    public void addAccount(Account account){
        allAccount.add(account);
    }
}
