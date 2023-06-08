package com.example.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

 public class PizaDAO {
    public List<Piza> getPizas() {
        List<Piza> lesPizas = new ArrayList();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/hajkhali1u_projet", "hajkhali1u_appli", "32219666");


            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from pizza");

            while (rs.next()) lesPizas.add(new Piza(rs.getString(1), rs.getFloat(2),rs.getInt(2)));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return lesPizas;
    }


    public void ajouterPizza (Piza piza){

        try{Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/hajkhali1u_projet","hajkhali1u_appli","32219666");

            PreparedStatement statement = con.prepareStatement("INSERT INTO Pizza(nom,prix,nb_ing) VALUES(?,?,?);");
            statement.setString(1,piza.getNom());
            statement.setFloat(2,piza.getPrix());
            statement.setInt(3,piza.getNb_ing());
            statement.executeUpdate();
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void supprimerPizzaDonnee(){
        try{Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://devbdd.iutmetz.univ-lorraine.fr:3306/hajkhali1u_projet","hajkhali1u_appli","32219666");

            Statement st = con.createStatement();
            PreparedStatement statement = con.prepareStatement("DELETE FROM Pizza;");
            statement.executeUpdate();
            con.close();


        }catch(Exception e){
            System.out.println(e);
        }
    }



}