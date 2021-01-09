package Databases;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DataBases dataBases = new DataBases();
        System.out.println(dataBases.search("картина"));
    }
}
