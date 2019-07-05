package org.katheer.jdbc;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Client {
    public static void main(String[] args) throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521" +
                ":orcl", "system", "katheer");

        /*
        //CLOB Insert
        File in_file = new File("F:/input.pdf");
        FileReader in_reader = new FileReader(in_file);

        PreparedStatement insert = connection.prepareStatement("INSERT INTO app_conf VALUES(?,?)");
        insert.setString(1, "app01");
        insert.setCharacterStream(2, in_reader, in_file.length());
        int insertRowCount = insert.executeUpdate();
        if (insertRowCount == 1) {
            System.out.println("Document inserted successfully");
        } else {
            System.out.println("Document insertion failed");
        }
        */

        /*
        //CLOB Read
        PreparedStatement read = connection.prepareStatement("SELECT * FROM app_conf WHERE " +
                "app_name=?");
        read.setString(1, "app01");
        ResultSet resultSet = read.executeQuery();

        resultSet.next();
        Reader out_reader = resultSet.getCharacterStream("conf");
        FileWriter out_writer = new FileWriter("F:/output.pdf");

        int data = out_reader.read();
        while (data != -1) {
            out_writer.write(data);
            data = out_reader.read();
        }

        System.out.println("Document read from database successfully");
        */
    }
}
