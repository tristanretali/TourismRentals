/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author tretali
 */
public abstract class AbstractAccount implements Account {
    private String surname;
    private String name;
    private String login;
    private String electronicAddress;
    private String type;
    private double virtualWallet;
    
    public AbstractAccount(String surname, String name, String login, String electronicAddress, String type){
        this.surname = surname;
        this.name = name;
        this.login = login;
        this.electronicAddress = electronicAddress;
        this.type = type;
        this.virtualWallet = 0.0;
    }
    
    @Override
    public String getSurname(){
        return surname;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public String getLogin(){
        return login;
    }
    
    @Override
    public String getElectronicAddress(){
        return electronicAddress;
    }
    
    @Override
    public String getType(){
        return type;
    }
    
    @Override
    public double getVirtualWallet(){
        return virtualWallet;
    }
    
    
    @Override
    public boolean isAdministrator(){
        return false;
    }
    
    @Override
    public boolean isOwner(){
        return false;
    }
    
    @Override
    public boolean isTenant(){
        return false;
    }
}
