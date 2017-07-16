package mainpackge;

public class OuterContact implements Contact{
    protected int id;
    protected ContactType contactType;
    protected String name;
    protected String surname;
    protected String middleName;
    protected String email;
    protected String cellPhoneNum;
    protected String homePhoneNum;
    protected String socialNetworkLink;
    protected String photo;
    protected String nickname;
    protected String note;
    protected int ownerId;
    
    public OuterContact(int id, Account ownerAccount) {
        this.id = id;
        ownerId = ownerAccount.getId();
        contactType = ContactType.Outer;
    }
    
    public OuterContact(Account ownerAccount) {
        ownerId = ownerAccount.getId();
        contactType = ContactType.Outer;
    }

    @Override
    public ContactType getContactType() {
        return contactType;
    }
    
    @Override
    public void setNote(String note) {
        if (note == null) {
            return;
        }
        this.note = note;
    }

    @Override
    public String getNote() {
        return note;
    }
    
    @Override
    public void setNickname(String nickname) throws IncorrectSetDataException{
        if (nickname == null) {
            return;
        }
        if(nickname.length()>20) throw new IncorrectSetDataException("Данное поле не может быть длиннее 20 символов");
        this.nickname = nickname;
    }

    @Override
    public String getNickname() {
        return nickname;
    }   
    
    
    @Override
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

    @Override
    public void setCellPhoneNum(String cellPhoneNum) throws IncorrectSetDataException {
        if (cellPhoneNum == null) {
            return;
        }
        if (cellPhoneNum.length() > 20) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 20 символов");
        }
        this.cellPhoneNum = cellPhoneNum;
    }

    @Override
    public void setEmail(String email) throws IncorrectSetDataException {
        if (email == null) {
            return;
        }
        if (email.length() > 255) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 255 символов");
        }
        this.email = email;
    }

    @Override
    public void setHomePhoneNum(String homePhoneNum) throws IncorrectSetDataException {
        if (homePhoneNum == null) {
            return;
        }
        if (homePhoneNum.length() > 20) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 20 символов");
        }
        this.homePhoneNum = homePhoneNum;
    }

    @Override
    public void setMiddleName(String middleName) throws IncorrectSetDataException {
        if (middleName == null) {
            return;
        }
        if (middleName.length() > 20) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 20 символов");
        }
        this.middleName = middleName;
    }

    @Override
    public void setPhoto(String photo) throws IncorrectSetDataException {
        if (photo == null) {
            return;
        }
        if (photo.length() > 255) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 255 символов");
        }
        this.photo = photo;
    }

    @Override
    public void setSocialNetworkLink(String socialNetworkLink) throws IncorrectSetDataException {
        if (socialNetworkLink == null) {
            return;
        }
        if (socialNetworkLink.length() > 255) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 255 символов");
        }
        this.socialNetworkLink = socialNetworkLink;
    }

    @Override
    public void setSurname(String surname) throws IncorrectSetDataException {
        if (surname == null) {
            return;
        }
        if (surname.length() > 20) {
            throw new IncorrectSetDataException("Данное поле не может быть длиннее 20 символов");
        }
        this.surname = surname;
    }



    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getCellPhoneNum() {
        return cellPhoneNum;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public String getHomePhoneNum() {
        return homePhoneNum;
    }

    @Override
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhoto() {
        return photo;
    }

    @Override
    public String getSocialNetworkLink() {
        return socialNetworkLink;
    }

    @Override
    public String getSurname() {
        return surname;
    }
}
