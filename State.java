import java.sql.*;
import java.util.*;

public class State {
    Scanner scanner = new Scanner(System.in);
    public void insert(insert_state state) throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            String insertSQL = "call insertstate(?,?)";
            PreparedStatement statement = connection.prepareStatement(insertSQL);
            statement.setInt(1, state.getState_id());
            statement.setString(2, state.getState_name());
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
            System.out.println("Enter State Name : ");
            String statename = scanner.nextLine();
            System.out.println("Enter State ID : ");
            int stateid = scanner.nextInt();
            String updateSQL = "update state set state_name=? where state_id=?";
            PreparedStatement statement = connection.prepareStatement(updateSQL);
            statement.setString(1, statename);
            statement.setInt(2, stateid);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Updation Successfully");
            } else {
                System.out.println("Updation Error");
            }
        }
    }
    public void delete(linkList_state link_state) throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            System.out.println("Enter State ID : ");
            int stateid = scanner.nextInt();
            String deleteSQL = "delete from state where state_id=?";
            PreparedStatement statement = connection.prepareStatement(deleteSQL);
            statement.setInt(1, stateid);
            int rowAffected = statement.executeUpdate();
            if (rowAffected > 0) {
                link_state.DELETE(stateid);
                System.out.println("Deletion is Successfully");
            } else {
                System.out.println("Deletion Error");
            }
        }
    }
    public void list() throws Exception {
        Connection connection = new DBConnection().getConnection();
        if (connection != null) {
            String selectSQL = "select * from state order by state_id";
            PreparedStatement statement = connection.prepareStatement(selectSQL);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                int state_id = set.getInt("state_id");
                String state_name = set.getString("state_name");
                System.out.println("State Id : " + state_id
                        + " \n State Name : " + state_name);
            }
        }
    }
}