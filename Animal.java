import java.sql.*;
import java.util.*;

class Animal {
    public void insert(insert_animal animal) throws Exception {
        DBConnection cc = new DBConnection();
        Connection connection = cc.getConnection();
        if (connection != null) {
            String sql="{call insertanimal(?,?,?,?,?,?,?,?,?)}";
            PreparedStatement statement = connection.prepareCall(sql);
            statement.setInt(1, animal.getId());
            statement.setString(2, animal.getAnimal_name());
            statement.setInt(3, animal.getAnimal_hight());
            statement.setInt(4, animal.animal_weight);
            statement.setString(5, animal.animal_sciname);
            statement.setInt(6, animal.getLife_span());
            statement.setInt(7, animal.getAnimal_hight());
            statement.setString(8, animal.getAnimal_color());
            statement.setString(9, animal.getGender());
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Insertion Successfully");
            } else {
                System.out.println("Insertion Failed");
            }
        }
    }
    public void update() throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Animal Id: ");
            int aid = sc.nextInt();
            System.out.println("Enter Animal Name: ");
            String name = sc.next();
            String updateSQL = "update animal set name=? where animal_id=?";
            PreparedStatement statement = connection.prepareStatement(updateSQL);
            statement.setString(1, name);
            statement.setInt(2, aid);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Update Successfully");
            } else {
                System.out.println("Update Failed");
            }
        }
    }
    public void delete(linkList_animal link_animal) throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Animal Id: ");
            int aid = sc.nextInt();
            String deleteSQL = "delete from animal where animal_id=?";
            PreparedStatement statement = connection.prepareStatement(deleteSQL);
            statement.setInt(1, aid);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
            link_animal.DELETE(aid);
            System.out.println("Deletion Successfully");
            } else {
                System.out.println("Deletion Failed");
            }
        }
    }  
    public void list() throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            String selectSQL = "select * from animal order by animal_id";
            PreparedStatement statement = connection.prepareStatement(selectSQL);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                int animal_id = set.getInt("animal_id");
                String animal_name = set.getString("animal_name");
                String height = set.getString("height");
                int weight = set.getInt("weight");
                String sci_name = set.getString("sci_name");
                int life_span = set.getInt("life_span");
                int age = set.getInt("age");
                String color = set.getString("color");
                String gender = set.getString("gender");
                System.out.println("Animal Id : " + animal_id
                        + " \n Animal Name : " + animal_name
                        + " \n Height: " + height
                        + " \n Weight: " + weight
                        + " \n sci_name: " + sci_name
                        + " \n life_span: " + life_span
                        + " \n age: " + age
                        + " \n color: " + color
                        + " \n gender: " + gender);
            }
        }
    }
}