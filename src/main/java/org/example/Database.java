package org.example;
import java.sql.*;
import java.util.*;
import java.util.logging.Logger;
public class Database
{
        Scanner s=new Scanner(System.in);
        static Logger l=Logger.getLogger("database.class");
        String url;
        String user;
        String pass;
        Database() {
                l.info("Enter the url:");
                url = s.nextLine();
                l.info("Enter the username:");
                user= s.nextLine();
                l.info("Enter the password:");
                pass = s.nextLine();
        }
        public void getDatabase() throws SQLException {
                DatabaseConnection database1 = DatabaseConnection.getdatabase();
                database1.newConnection(url, user, pass);
                database1.closeConnection();
        }
    }
