/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pc_id_managment;

import java.sql.*;

/**
 *
 * @author root
 */
public class Pc_id_managment {

    public static void main(String[] args) {
       try{
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","");
	        java.sql.Statement state = con.createStatement();
	       // state.execute("INSERT INTO student VALUES (01,'mr x',22)");
	       // state.execute("UPDATE student SET name = 'mr b' WHERE id = 01 ");
	        System.out.println("connected");
	    }catch(Exception e){
	        e.printStackTrace();
	    }
    }
}
