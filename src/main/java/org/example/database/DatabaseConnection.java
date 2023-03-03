package org.example.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class DatabaseConnection {
        static Logger l=Logger.getLogger("database.class");
        static DatabaseConnection db;
        Connection conn;
        private  DatabaseConnection(){}
        public static DatabaseConnection getdatabase(){
            if(db==null)
                db=new DatabaseConnection();
            return db;
        }
        public void newConnection(String url1,String user1,String pass1) throws SQLException {
            conn= DriverManager.getConnection(url1,user1,pass1);
            l.info("Connection created");
        }
        public void closeConnection() throws SQLException{
            conn.close();
            l.info("Connection destroyed");
        }

    }
