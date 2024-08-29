import java.sql.*;
import java.util.*;

class Category {
    Scanner sc = new Scanner(System.in);
    public void insert(insert_category category) throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            String insertSQL = "{call insertcategory(?,?)}";
            PreparedStatement statement = connection.prepareStatement(insertSQL);
            statement.setInt(1, category.getCatid());
            statement.setString(2, category.getCatname());
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
            System.out.println("Enter Category Name : ");
            String catname = sc.nextLine();
            System.out.println("Enter Category ID : ");
            int catid = sc.nextInt();
            String updateSQL = "update category set category_name=? where category_id=?";
            PreparedStatement statement = connection.prepareStatement(updateSQL);
            statement.setString(1, catname);
            statement.setInt(2, catid);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Updation Successfully");
            } else {
                System.out.println("Updation Error");
            }
        }
    }
    public void delete(linkList_category link_cat) throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            System.out.println("Enter Category ID : ");
            int catid = sc.nextInt();
            String deleteSQL = "delete from category where category_id=?";
            PreparedStatement statement = connection.prepareStatement(deleteSQL);
            statement.setInt(1, catid);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
            link_cat.DELETE(catid);
            System.out.println("Deletion Successfully");
            } else {
                System.out.println("Deletion Error");
            }
        }
    }
    public void list() throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            String selectSQL = "select * from category order by category_id";
            PreparedStatement statement = connection.prepareStatement(selectSQL);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                int category_id = set.getInt("category_id");
                String category_name = set.getString("category_name");
                System.out.println("Category Id : " + category_id
                        + " \n Category Name : " + category_name);
            }
        }
    }
}