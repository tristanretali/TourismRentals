/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package account;

/**
 *
 * @author tretali
 */
public interface Account {
    String getSurname();
    String getName();
    String getLogin();
    String getElectronicAddress();
    String getType();
    double getVirtualWallet();
    boolean isAdministrator();
    boolean isOwner();
    boolean isTenant();
}
