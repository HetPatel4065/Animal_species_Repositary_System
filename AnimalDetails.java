import java.sql.*;
import java.util.*;

class AnimalDetails {
    public void insert(insert_animal_detail animal_detail) throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            Scanner sc = new Scanner(System.in);
            String insertSQL = "{call insertanimaldetails(?,?,?)}";
            PreparedStatement statement = connection.prepareStatement(insertSQL);
            statement.setInt(1, animal_detail.getPop());
            statement.setInt(2, animal_detail.getAid());
            statement.setInt(3, animal_detail.getCityid());
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Record inserted successfully");
            } else {
                System.out.println("Record not inserted");
            }
        }
    }
    public void update() throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Animal Id: ");
            int aid = sc.nextInt();
            System.out.println("Enter population: ");
            int pop = sc.nextInt();
            System.out.println("Enter city Id: ");
            int cityid = sc.nextInt();
            String updateSQL = "update animal_details set population=? where animal_id=? and city_id=?";
            PreparedStatement statement = connection.prepareStatement(updateSQL);
            statement.setInt(1, pop);
            statement.setInt(2, aid);
            statement.setInt(3, cityid);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Record updated successfully");
            } else {
                System.out.println("Record not found");
            }
        }
    }
    public void delete(linkList_animal_details link_animal_details) throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Animal Id: ");
            int adid = sc.nextInt();
            String deleteSQL = "delete from animal_details where animal_id=?";
            PreparedStatement statement = connection.prepareStatement(deleteSQL);
            statement.setInt(1, adid);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                link_animal_details.DELETE(adid);
                System.out.println("Record deleted successfully");
            } else {
                System.out.println("Record not found");
            }
        }
    }
    public void list() throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            String selectSQL = "select * from animal_details order by animal_id";
            PreparedStatement statement = connection.prepareStatement(selectSQL);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                int population = set.getInt("population");
                int animal_id = set.getInt("animal_id");
                int city_id = set.getInt("city_id");

                System.out.println("Animal Id : " + animal_id 
                +" \n Population : "+ population+ " \n City Id : " + city_id);
            }
        }
    }
}