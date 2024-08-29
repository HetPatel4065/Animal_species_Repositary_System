import java.sql.*;
import java.util.*;

class City {
    Scanner sc = new Scanner(System.in);
    public void insert(insert_city city) throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            String insertSQL = "{call insertcity(?,?)}";
            PreparedStatement statement = connection.prepareStatement(insertSQL);
            statement.setInt(1, city.getCityid());
            statement.setString(2, city.getCityname());
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Insertion Successfully");
            } else {
                System.out.println("Insertion Error");
            }
        }
    }
    public void update() throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            System.out.println("Enter City ID: ");
            int cityid = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter City Name: ");
            String cityname = sc.nextLine();
            String updateSQL = "update city set city_name=? where city_id=?";
            PreparedStatement statement = connection.prepareStatement(updateSQL);
            statement.setString(1, cityname);
            statement.setInt(2, cityid);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Updation Successfully");
            } else {
                System.out.println("Updation Error");
            }
        }
    }
    public void delete(linkList_city link_city) throws Exception {
        System.out.println("Enter City Id: ");
        int cityId = sc.nextInt();
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            String deleteSQL = "delete from city where city_id=?";
            PreparedStatement statement = connection.prepareStatement(deleteSQL);
            statement.setInt(1, cityId);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Deletion Successfully");
                link_city.DELETE(cityId);
            } else {
                System.out.println("Deletion Error");
            }
        }
    }
    public void list() throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            String selectSQL = "select * from city";
            PreparedStatement statement = connection.prepareStatement(selectSQL);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                int city_id = set.getInt("city_id");
                String city_name = set.getString("city_name");
                System.out.println("City ID : " + city_id
                        + " \n City Name : " + city_name);
            }
        }
    }
}