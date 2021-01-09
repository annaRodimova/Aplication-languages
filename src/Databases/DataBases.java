package Databases;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataBases implements Connections_databases{
    @Override
    public Connection connect_to_db(String password, String name_DB) throws ClassNotFoundException, SQLException{
        String connections = "jdbc:mysql://localhost:3306/";
        String add_connections = "?serverTimezone=Europe/Moscow";
        String user = "root";
        String all_connections = connections + name_DB + add_connections;
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(all_connections, user, password);
        return connection;
    }
    public void add_new_word (String word, String translate_word) throws SQLException, ClassNotFoundException {
        Connection connection = connect_to_db("LexusIS250@#", "Dictionary");
        Statement statement = connection.createStatement();
        statement.executeUpdate("create table if not exists dict (id int primary key auto_increment, word varchar (50), " +
                "translation varchar(50));");
        statement.executeUpdate(String.format("insert into dict (word, translation)  values ('%s' , '%s'); " ,word ,translate_word)); //на место %s добавляем строки word ,translate_word
        connection.close();
    }
    public String search (String search_word) throws SQLException, ClassNotFoundException {
        Connection connection = connect_to_db("LexusIS250@#", "Dictionary");
        Statement statement = connection.createStatement();
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

        if (English_word > Russian_word) {
            ResultSet res = statement.executeQuery(String.format("select translation from dict where word = '%s';", search_word));
            while (res.next()) {
                word_res = res.getString(1);
            }
        }
        if (Russian_word > English_word) {
            ResultSet res1 = statement.executeQuery(String.format("select word from dict where translation = '%s';", search_word)); // поиск слова, с помощью метода стринг формат, в селекте %s это наша переменная search_word
            while (res1.next()) { // вопрос почему через цикл?
                word_res = res1.getString(1); // присваиваем значение найденого слова нашей переменной
            }
        }
        return word_res;
    }

}
