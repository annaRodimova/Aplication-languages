package Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface Methods {
    public default Connection connect_to_db(String password, String name_DB) throws ClassNotFoundException, SQLException {
        String connections = "jdbc:mysql://localhost:3306/";
        String add_connections = "?serverTimezone=Europe/Moscow";
        String user = "root";
        String all_connections = connections + name_DB + add_connections;
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(all_connections, user, password);
        return connection;
    }
    public default void add_new_word (String word, String translate_word, String table) throws SQLException, ClassNotFoundException {
        Connection connection = connect_to_db("LexusIS250@#", "Dictionary");
        Statement statement = connection.createStatement();
        statement.executeUpdate(String.format("create table if not exists %s (id int primary key auto_increment, word varchar (50), " +
                "translation varchar(50));", table));
        statement.executeUpdate(String.format("insert into %s (word, translation)  values ('%s' , '%s'); " , table, word ,translate_word)); //на место %s добавляем строки word ,translate_word
        connection.close();
    }
    public default boolean check_word (String search_word) {
        String word_res = "";
        Pattern english_pattern = Pattern.compile("[A-Za-z]{1,}");
        Pattern rus_pattern = Pattern.compile("[А-Яа-я]{1,}");
        Matcher matcher = english_pattern.matcher(search_word);
        int Russian_word = 0;
        int English_word = 0;
        while (matcher.find()) {
            English_word ++;
        }

        matcher = rus_pattern.matcher(search_word);
        while (matcher.find()) {
            Russian_word ++;
        }
        return English_word > Russian_word;
    }
}
