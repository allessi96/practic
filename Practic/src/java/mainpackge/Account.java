/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackge;

import java.util.ArrayList;

/**
 *
 * @author Chemax
 */
public class Account{
    private ArrayList<Contact> contacts;
    
    protected int id;
    protected String name;
    protected String surname;
    protected String middleName;
    protected String email;
    protected String cellPhoneNum;
    protected String homePhoneNum;
    protected String socialNetworkLink;
    protected String photo;
    
    public Account(int id) {
        this.id = id;
    }
    
    public Account() {
    }
    
    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }
    
    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    public void setName(String name) throws IncorrectSetDataException {
        if (name == null) {
            return;
        }
        if (name.length() > 20) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 20 символов");
        }
        /*проверка данных на длину в соответствии с требованиями бд*/
        this.name = name;
    }

    public void setCellPhoneNum(String cellPhoneNum) throws IncorrectSetDataException {
        if (cellPhoneNum == null) {
            return;
        }
        if (cellPhoneNum.length() > 20) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 20 символов");
        }
        this.cellPhoneNum = cellPhoneNum;
    }

    public void setEmail(String email) throws IncorrectSetDataException {
        if (email == null) {
            return;
        }
        if (email.length() > 255) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 255 символов");
        }
        this.email = email;
    }

    public void setHomePhoneNum(String homePhoneNum) throws IncorrectSetDataException {
        if (homePhoneNum == null) {
            return;
        }
        if (homePhoneNum.length() > 20) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 20 символов");
        }
        this.homePhoneNum = homePhoneNum;
    }

    public void setMiddleName(String middleName) throws IncorrectSetDataException {
        if (middleName == null) {
            return;
        }
        if (middleName.length() > 20) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 20 символов");
        }
        this.middleName = middleName;
    }

    public void setPhoto(String photo) throws IncorrectSetDataException {
        if (photo == null) {
            return;
        }
        if (photo.length() > 255) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 255 символов");
        }
        this.photo = photo;
    }

    public void setSocialNetworkLink(String socialNetworkLink) throws IncorrectSetDataException {
        if (socialNetworkLink == null) {
            return;
        }
        if (socialNetworkLink.length() > 255) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 255 символов");
        }
        this.socialNetworkLink = socialNetworkLink;
    }

    public void setSurname(String surname) throws IncorrectSetDataException {
        if (surname == null) {
            return;
        }
        if (surname.length() > 20) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 20 символов");
        }
        this.surname = surname;
    }



    public int getId() {
        return id;
    }

    public String getCellPhoneNum() {
        return cellPhoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getHomePhoneNum() {
        return homePhoneNum;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public String getSocialNetworkLink() {
        return socialNetworkLink;
    }

    public String getSurname() {
        return surname;
    }
    
}
