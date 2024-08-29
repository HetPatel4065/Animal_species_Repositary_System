import java.sql.*;
import java.util.*;

class SubCategory {
	Scanner sc = new Scanner(System.in);
	public void insert(insert_subcategory subcat) throws Exception {
		Connection connection = new DBConnection().getConnection();
		if (connection != null) {
			String insertSQL = "call insertsub_category(?,?)";
			PreparedStatement statement = connection.prepareStatement(insertSQL);
			statement.setInt(1, subcat.getSubid());
			statement.setString(2, subcat.getSubname());
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
			System.out.println("Enter Sub Category Id: ");
			int subid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Sub Category Name: ");
			String subname = sc.nextLine();
			String updateSQL = "update sub_category set sub_category_name=? where sub_category_id=?";
			PreparedStatement statement = connection.prepareStatement(updateSQL);
			statement.setString(1, subname);
			statement.setInt(2, subid);
			int rowAffected = statement.executeUpdate();
			if (rowAffected > 0) {
				System.out.println("Updation Successfully");
			} else {
				System.out.println("Updation Error");
			}
		}
	}
	public void delete(linkList_subcategory link_subcat) throws Exception {
		Connection connection = new DBConnection().getConnection();
		if (connection != null) {
			System.out.println("Enter Sub Category ID : ");
			int subid = sc.nextInt();
			String deleteSQL = "delete from sub_category where sub_category_id=?";
			PreparedStatement statement = connection.prepareStatement(deleteSQL);
			statement.setInt(1, subid);
			int rowAffected = statement.executeUpdate();
			if (rowAffected > 0) {
				link_subcat.DELETE(subid);
				System.out.println("Deletion Successfully");
			} else {
				System.out.println("Deletion Error");
			}
		}
	}
	public void list() throws Exception {
		Connection connection = new DBConnection().getConnection();
		if (connection != null) {
			String selectSQL = "select * from sub_category order by sub_category_id";
			PreparedStatement statement = connection.prepareStatement(selectSQL);
			ResultSet set = statement.executeQuery();
			while (set.next()) {
				int sub_category_id = set.getInt("sub_category_id");
				String sub_category_name = set.getString("sub_category_name");
				System.out.println("Sub Category Id : " + sub_category_id + " \nSub Category Name : " + sub_category_name);
			}
		}
	}
}