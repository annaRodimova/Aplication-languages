package Databases;

import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class learning implements Methods {

    public String random_russian_word() throws SQLException, ClassNotFoundException {

        Connection connection = connect_to_db("LexusIS250@#", "Dictionary");
        Statement statement = connection.createStatement();
        //statement.executeUpdate("select count(word) from dict");
        ResultSet result = statement.executeQuery("select word from dict ORDER BY rand() LIMIT 10;");  // Можно было через рендом, в селекте прописать где id = %s (значению рендома)
        ArrayList <String> rand_rus_word = new ArrayList<>();
        while (result.next()) {
            rand_rus_word.add(result.getString(1));
        }
        connection.close();
        Random random = new Random();
        int a = random.nextInt(10);
        String rand_word = rand_rus_word.get(a);
        return rand_word;

    }
    public boolean check_learning_word (String word, String translation) throws SQLException, ClassNotFoundException {
        boolean result = false;
        DataBases db = new DataBases();
        Connection connection = connect_to_db("LexusIS250@#", "Dictionary");
        Statement statement = connection.createStatement();

        if(db.check_word(word)) {
                ResultSet res1 = statement.executeQuery(String.format("select word from dict where word = '%s';", word));
            String select_word = "";
                while (res1.next()) {
                    select_word = res1.getString(1);
                }

                if (word.equals(select_word)) {
                    add_new_word(translation, word, "dict");
                    statement.executeUpdate(String.format("delete from dict where word = '%s';", word));
                    result = true;
                }
                else {
                    result = false;
                }
            }
            else {
                ResultSet res1 = statement.executeQuery(String.format("select translation from dict where word = '%s';", word));
                String select_word = "";
                    while (res1.next()) {
                        select_word = res1.getString(1);
                    }

                if (word.equals(select_word)) {
                    add_new_word(word, translation, "dict");
                    statement.executeUpdate(String.format("delete * from dict where translation = '%s';", word));
                    result = true;
                }
                else {
                    result = false;
                }


        }
            return result;
    }


}
