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
public class InnerContact extends OuterContact implements Contact{
    private int contactId;

    public InnerContact(Account ownerAccount) {
        super(ownerAccount);
        contactType = ContactType.Inner;
    }
   
    public InnerContact(int id, int contactId, Account ownerAccount) {
        super(id,ownerAccount);
        this.contactId = contactId;
        contactType = ContactType.Inner;
    }    

    public int getContactId() {
        return contactId;
    }

    /*@Override
    public void setCellPhoneNum(String cellPhoneNum) throws IncorrectSetDataException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setHomePhoneNum(String homePhoneNum) throws IncorrectSetDataException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setName(String name) throws IncorrectSetDataException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setPhoto(String photo) throws IncorrectSetDataException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setSocialNetworkLink(String socialNetworkLink) throws IncorrectSetDataException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setSurname(String surname) throws IncorrectSetDataException {
        throw new UnsupportedOperationException();
    }
 

    @Override
    public void setEmail(String email) throws IncorrectSetDataException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setMiddleName(String middleName) throws IncorrectSetDataException {
        throw new UnsupportedOperationException();
    }*/

    
    
    
    
}
