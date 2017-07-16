/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackge;

/**
 *
 * @author Chemax
 */
public interface Contact {
    
    public ContactType getContactType();
            
    public void setNote(String note);
    
    public String getNote();
    
    public void setNickname(String nickname) throws IncorrectSetDataException;

    public String getNickname();
    
    public void setName(String name) throws IncorrectSetDataException;

    public void setCellPhoneNum(String cellPhoneNum) throws IncorrectSetDataException;

    public void setEmail(String email) throws IncorrectSetDataException;

    public void setHomePhoneNum(String homePhoneNum) throws IncorrectSetDataException;
    
    public void setMiddleName(String middleName) throws IncorrectSetDataException;

    public void setPhoto(String photo) throws IncorrectSetDataException;
    
    public void setSocialNetworkLink(String socialNetworkLink) throws IncorrectSetDataException;

    public void setSurname(String surname) throws IncorrectSetDataException;

    public int getId();

    public String getCellPhoneNum();

    public String getEmail();

    public String getHomePhoneNum();

    public String getMiddleName();

    public String getName();

    public String getPhoto();

    public String getSocialNetworkLink();

    public String getSurname();
}
