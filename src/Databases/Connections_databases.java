package Databases;

import java.sql.Connection;
import java.sql.SQLException;

public interface Connections_databases {
    public Connection connect_to_db(String password, String name_DB) throws ClassNotFoundException, SQLException;

}
