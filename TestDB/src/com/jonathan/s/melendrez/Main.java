package com.jonathan.s.melendrez;

import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\tr_lnd_user\\Desktop\\JavaProjects\\TestDB\\"+DB_NAME;

    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {

	try{
	    final String createContactsTable = "CREATE TABLE IF NOT EXISTS "+TABLE_CONTACTS+
                " ("+ COLUMN_NAME +" text, " +
                      COLUMN_PHONE+" integer, "+
                      COLUMN_EMAIL+" text" +
                ")";

	    String dropTable = "DROP TABLE IF EXISTS "+TABLE_CONTACTS;

        /*String insertContacts1 = "INSERT INTO contacts (name,phone, email)" +
                                 "VALUES('Joe', 45632, 'joe@anywhere.com')";*/
        /*String insertContacts2 = "INSERT INTO contacts (name,phone, email)" +
                "VALUES('Jane', 4829484, 'jane@somewhere.com')";
        String insertContacts3 = "INSERT INTO contacts (name,phone, email)" +
                "VALUES('Fido', 9038, 'dog@email.com')";
        String deleteContact1 = "DELETE FROM contacts WHERE name='Joe'";
        String updateContact2 = "UPDATE contacts SET phone=5566789 WHERE name='Jane'";
*/
        String getContacts = ("SELECT * FROM "+TABLE_CONTACTS);

        /*String insertContacts1 = "INSERT INTO "+TABLE_CONTACTS+
                                " (" +COLUMN_NAME+ ", " +
                                    COLUMN_PHONE+ ", "+
                                    COLUMN_EMAIL +
                                " ) "+
                                "VALUES('Tim', 6545678, 'tim@email.com')";*/

        /*String insertContacts2 = "INSERT INTO "+TABLE_CONTACTS+
                " (" +COLUMN_NAME+ ", " +
                COLUMN_PHONE+ ", "+
                COLUMN_EMAIL +
                " ) "+
                "VALUES('Joe', 45632, 'joe@anywhere.com')";

        String insertContacts3 = "INSERT INTO "+TABLE_CONTACTS+
                " (" +COLUMN_NAME+ ", " +
                COLUMN_PHONE+ ", "+
                COLUMN_EMAIL +
                " ) "+
                "VALUES('Jane', 4829484, 'jane@somewhere.com')";

        String insertContacts4 = "INSERT INTO "+TABLE_CONTACTS+
                " (" +COLUMN_NAME+ ", " +
                COLUMN_PHONE+ ", "+
                COLUMN_EMAIL +
                " ) "+
                "VALUES('Dog', 9038, 'dog@email.com')";*/

        String updateContacts3 = "UPDATE " + TABLE_CONTACTS + " SET " +
                                COLUMN_PHONE + "=5566789"+
                                " WHERE " + COLUMN_NAME + "='Jane'";
        String deleteContacts2 = "DELETE FROM " + TABLE_CONTACTS +
                                " WHERE " + COLUMN_NAME + "='Joe'";

        //-----------------------------------------------------------------------------------------------------------------------------------
        Connection conn = DriverManager.getConnection(CONNECTION_STRING);
        //conn.setAutoCommit(false);
        Statement statement = conn.createStatement();
        statement.execute(dropTable);
        statement.execute(createContactsTable);

        insertContact(statement,"Tim",6545678,"tim@email.com");/*statement.execute(insertContacts1);*/ //statement.execute(insertContacts2); statement.execute(insertContacts3); statement.execute(insertContacts4);statement.execute(updateContacts3); statement.execute(deleteContacts2);
        insertContact(statement,"Joe",45632,"joe@anywhere.com");
        insertContact(statement,"Jane",482948,"jane@somewhere.com");
        insertContact(statement,"Fido",9038,"dog@email.com");
        //  statement.execute(insertContacts1); statement.execute(insertContacts2); statement.execute(insertContacts3);
        //statement.execute(updateContact2); statement.execute(deleteContact1);
      //  statement.execute(getContacts);
      //  ResultSet results = statement.getResultSet();
        ResultSet results = statement.executeQuery(getContacts);

        while (results.next()){
            System.out.println(results.getString(COLUMN_NAME)+" "+
                    results.getInt(COLUMN_PHONE)+" "+
                    results.getString(COLUMN_EMAIL));
        }results.close();

        //CLOSES THE STATEMENT AND DB CONNECTION
        statement.close(); conn.close();

	} catch (SQLException e){
        System.out.println("Something went wrong: "+e.getMessage());
    }
    }

    private static void insertContact(Statement statement, String name, int phone, String email) throws SQLException{
        String insertContacts4A = "INSERT INTO "+TABLE_CONTACTS+
                " (" +COLUMN_NAME+ ", " +
                COLUMN_PHONE+ ", "+
                COLUMN_EMAIL +
                " ) "+
                "VALUES('"+name+"', "+phone+", '"+email+"')";
        statement.execute(insertContacts4A);

    }

}

