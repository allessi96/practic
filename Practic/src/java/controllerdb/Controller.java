package controllerdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import mainpackge.*;

public class Controller {

    private static Connection conn;
    private static Statement statement;
    private static ResultSet rs;

    //метод присоединения к бд, обязательно должен выполняться перед действиями с бд
    public static void ConnectToDB() throws ClassNotFoundException, SQLException {
        conn = null;
        Class.forName("org.sqlite.JDBC");
        conn = DriverManager.getConnection("jdbc:sqlite:contacts_BD.sqlite");
        statement = conn.createStatement();
    }

    //метод получение аккаунта вместе с его данными и контактами по логину и паролю
    public static Account getAccount(String login, String password)
            throws SQLException, IncorrectSetDataException, InvalidLoginExcetion {
        rs = statement.executeQuery("SELECT * FROM Authentication");
        while (rs.next()) {
            if (rs.getString("login").equals(login) && rs.getString("password").equals(password)) {
                int id = rs.getInt("account_id");
                rs = statement.executeQuery("SELECT * FROM Accounts WHERE account_id = " + id);
                Account account = new Account(id);
                account.setCellPhoneNum(rs.getString("cell_phone_num"));
                account.setEmail(rs.getString("email"));
                account.setHomePhoneNum(rs.getString("home_phone_num"));
                account.setMiddleName(rs.getString("middle_name"));
                account.setName(rs.getString("name"));
                account.setPhoto(rs.getString("photo"));
                account.setSocialNetworkLink(rs.getString("social_network_link"));
                account.setSurname(rs.getString("surname"));
                rs = statement.executeQuery("SELECT * FROM Outer_contacts WHERE account_id = " + id);
                ArrayList<Contact> contacts = new ArrayList<>();
                while (rs.next()){
                    int contactId = rs.getInt("outer_contacts_id");
                    OuterContact con = new OuterContact(contactId, account);
                    con.setCellPhoneNum(rs.getString("cell_phone_num"));
                    con.setEmail(rs.getString("email"));
                    con.setHomePhoneNum(rs.getString("home_phone_num"));
                    con.setMiddleName(rs.getString("middle_name"));
                    con.setName(rs.getString("name"));
                    con.setPhoto(rs.getString("photo"));
                    con.setSocialNetworkLink(rs.getString("social_network_link"));
                    con.setSurname(rs.getString("surname"));
                    con.setNickname(rs.getString("nickname"));
                    con.setNote(rs.getString("note"));
                    contacts.add(con);
                }
                rs = statement.executeQuery("SELECT * FROM Inner_contacts WHERE account_id = " + id);
                while (rs.next()){
                    int contactAccountId = rs.getInt("contact_account_id");
                    int contactId = rs.getInt("inner_contacts_id");
                    InnerContact contact = new InnerContact(contactId, contactAccountId, account);
                    contact.setNickname(rs.getString("nickname"));
                    contact.setNote(rs.getString("note"));
                    ResultSet rs2 = statement.executeQuery("SELECT * FROM Accounts WHERE account_id = " + contactAccountId);
                    rs2.next();
                    contact.setCellPhoneNum(rs2.getString("cell_phone_num"));
                    contact.setEmail(rs2.getString("email"));
                    contact.setHomePhoneNum(rs2.getString("home_phone_num"));
                    contact.setMiddleName(rs2.getString("middle_name"));
                    contact.setName(rs2.getString("name"));
                    contact.setPhoto(rs2.getString("photo"));
                    contact.setSocialNetworkLink(rs2.getString("social_network_link"));
                    contact.setSurname(rs2.getString("surname"));
                } 
                
                account.setContacts(contacts);
                return account;
            }
        }
        throw new InvalidLoginExcetion();
    }
    
    public static void updateContact(Contact contact)throws SQLException{
        if(contact.getContactType()==ContactType.Inner){
            statement.execute("update Account set nickname = '"+contact.getNickname()+"',note = '"
                    +contact.getNote() + "' where id = " +contact.getId());
        } else {
            String str = "";
            String str2;
            str2 = contact.getCellPhoneNum();
            if(str2!=null){
                str += "cell_phone_num = '" + str2 +"',";
            }
            str2 = contact.getEmail();
            if(str2!=null){
                str += "email = '" + str2 +"',";
            }
            str2 = contact.getHomePhoneNum();
            if(str2!=null){
                str += "home_phone_num = '" + str2 +"',";
            }
            str2 = contact.getMiddleName();
            if(str2!=null){
                str += "middle_name = '" + str2 +"',";
            }
            str2 = contact.getName();
            if(str2!=null){
                str += "name = '" + str2 +"',";
            }
            str2 = contact.getPhoto();
            if(str2!=null){
                str += "photo = '" + str2 +"',";
            }
            str2 = contact.getSocialNetworkLink();
            if(str2!=null){
                str += "social_network_link = '" + str2 +"',";
            }
            str2 = contact.getSurname();
            if(str2!=null){
                str += "surname = '" + str2 +"',";
            }
            str = str.substring(0, str.length()-2);
            statement.execute("update Outer_contacts set " + str + " where id = " +contact.getId());
            
        }
        
        
    }
    
    public static void updateAccount(Account account) throws SQLException{
        String str = "";
        String str2;
        str2 = account.getCellPhoneNum();
        if(str2!=null){
            str += "cell_phone_num = '" + str2 +"',";
        }
        str2 = account.getEmail();
        if(str2!=null){
            str += "email = '" + str2 +"',";
        }
        str2 = account.getHomePhoneNum();
        if(str2!=null){
            str += "home_phone_num = '" + str2 +"',";
        }
        str2 = account.getMiddleName();
        if(str2!=null){
            str += "middle_name = '" + str2 +"',";
        }
        str2 = account.getName();
        if(str2!=null){
            str += "name = '" + str2 +"',";
        }
        str2 = account.getPhoto();
        if(str2!=null){
            str += "photo = '" + str2 +"',";
        }
        str2 = account.getSocialNetworkLink();
        if(str2!=null){
            str += "social_network_link = '" + str2 +"',";
        }
        str2 = account.getSurname();
        if(str2!=null){
            str += "surname = '" + str2 +"',";
        }
        str = str.substring(0, str.length()-2);
        statement.execute("update Account set " + str + " where id = " +account.getId());
    }
    
    public static void outerContactAdd(OuterContact contact, Account ownerAccount)
            throws SQLException{
        String columns = "", values = "";
        String str;
        str = contact.getCellPhoneNum();
        if(str!=null){
            columns+="cell_phone_num,";
            values+="'" + str + "'" + ",";
        }
        str = contact.getEmail();
        if(str!=null){
            columns+="email,";
            values+="'" + str + "'" + ",";
        }
        str = contact.getHomePhoneNum();
        if(str!=null){
            columns+="home_phone_num,";
            values+="'" + str + "'" + ",";
        }
        str = contact.getMiddleName();
        if(str!=null){
            columns+="middle_name,";
            values+="'" + str + "'" + ",";
        }
        
        str = contact.getName();
        if(str!=null){
            columns+="name,";
            values+="'" + str + "'" + ",";
        }
        
        str = contact.getNickname();
        if(str!=null){
            columns+="nickname,";
            values+="'" + str + "'" + ",";
        }
        
        str = contact.getNote();
        if(str!=null){
            columns+="note,";
            values+="'" + str + "'" + ",";
        }
        
        str = contact.getPhoto();
        if(str!=null){
            columns+="photo,";
            values+="'" + str + "'" + ",";
        }
        
        str = contact.getSocialNetworkLink();
        if(str!=null){
            columns+="social_network_link,";
            values+="'" + str + "'" + ",";
        }
        
        str = contact.getSurname();
        if(str!=null){
            columns+="surname,";
            values+="'" + str + "'" + ",";
        }
        
        columns = columns.substring(0, columns.length()-2);
        values = values.substring(0, values.length()-2);
        statement.execute("insert into Outer_contacts (" + columns + ") values (" + values + ")");
    }
    
    //public static void outerContact
    
    public static Account registerAccount(Account account, String login, String password)
            throws SQLException, InvalidRegisterException{
        if(!validateLogin(login)) throw new InvalidRegisterException("Данный логин занят");
        if(!validateCellPhoneNumber(account.getCellPhoneNum()))
            throw new InvalidRegisterException("Данный номер телефона имеется в базе данных");
        String columns = "", values = "";
        String str;
        str = account.getCellPhoneNum();
        if(str!=null){
            columns+="cell_phone_num,";
            values+="'" + str + "'" + ",";
        }
        str = account.getEmail();
        if(str!=null){
            columns+="email,";
            values+="'" + str + "'" + ",";
        }
        str = account.getHomePhoneNum();
        if(str!=null){
            columns+="home_phone_num,";
            values+="'" + str + "'" + ",";
        }
        str = account.getMiddleName();
        if(str!=null){
            columns+="middle_name,";
            values+="'" + str + "'" + ",";
        }
        
        str = account.getName();
        if(str!=null){
            columns+="name,";
            values+="'" + str + "'" + ",";
        }
        
        str = account.getPhoto();
        if(str!=null){
            columns+="photo,";
            values+="'" + str + "'" + ",";
        }
        
        str = account.getSocialNetworkLink();
        if(str!=null){
            columns+="social_network_link,";
            values+="'" + str + "'" + ",";
        }
        
        str = account.getSurname();
        if(str!=null){
            columns+="surname,";
            values+="'" + str + "'" + ",";
        }
        columns = columns.substring(0, columns.length()-2);
        values = values.substring(0, values.length()-2);
        statement.execute("insert into Accounts (" + columns + ") values (" + values + ")");
        rs = statement.executeQuery("SELECT * FROM Accounts WHERE cell_phone_num = '" + account.getCellPhoneNum()+"'");
        rs.next();
        int id = rs.getInt("account_id");
        account.setId(id);
        statement.execute("insert into Authentication (account_id, login, password) values (" + id + ",'" + login + "','" + password +"')");
        rs = statement.executeQuery("SELECT * FROM Outer_contacts WHERE cell_phone_num = '" + account.getCellPhoneNum()+"'");
        while(rs.next()){
            statement.execute("delete from Outer_contacts WHERE outer_contacts_id = " + rs.getInt("outer_contacts_id"));
            statement.execute("insert into Inner_contacts (account_id, contact_account_id, nickname, node) values("+
                    rs.getInt("account_id") +","+ id +",'"+  rs.getString("nickname") +"','"+  rs.getString("node") +"')");
        } 
        return account;
    }
    
    public static boolean validateLogin(String login)throws SQLException{
        rs = statement.executeQuery("SELECT * FROM Authentication");
        while (rs.next()) {
            if(rs.getString("login").equals(login)) return false;
        }
        return true;
    }
    
    public static boolean validateCellPhoneNumber(String number)throws SQLException{
        rs = statement.executeQuery("SELECT * FROM Accounts");
        while (rs.next()) {
            if(rs.getString("cell_phone_number").equals(number)) return false;
        }
        return true;
    }
    
    
    

}
