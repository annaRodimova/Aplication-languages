package Databases;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataBases implements Methods{

    public String search (String search_word) throws SQLException, ClassNotFoundException {
        Connection connection = connect_to_db("LexusIS250@#", "Dictionary");
        Statement statement = connection.createStatement();
        String word_res = "";


        if (check_word(search_word)) {
            ResultSet res = statement.executeQuery(String.format("select translation from dict where word = '%s';", search_word));
            while (res.next()) {
                word_res = res.getString(1);
            }
        }
        else {
            ResultSet res1 = statement.executeQuery(String.format("select word from dict where translation = '%s';", search_word)); // поиск слова, с помощью метода стринг формат, в селекте %s это наша переменная search_word
            while (res1.next()) {
                word_res = res1.getString(1); // присваиваем значение найденого слова нашей переменной
            }
        }
        return word_res;
    }


}
