	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	
public class DB_insert {
	
	private static final String DB_IP = "ip";
	private static final String DB_PORT = "3306";
	private static final String DB_NAME = "port_shipments";
	private static final String DB_USER = "ittstudent";
	private static final String DB_PASS = "ittstudent-123";
	static Connection con = null;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://"+DB_IP+":"+DB_PORT+"/"+DB_NAME,DB_USER, DB_PASS);
			
		} catch (SQLException e) {
			System.out.println("Error connecting to Database " + e.getMessage());
		}
		
	}

	public static void importEntry(Entry entry) {
		try {
			PreparedStatement st = con.prepareStatement("INSERT INTO " + DB_NAME + " (boat_name, dock_id, crane_id, unloading_time, package_id) values (?, ?, ?, ?, ?)");
			st.setString(1, entry.getKorab().getName());
			st.setInt(2, entry.getDok());
			st.setInt(3, entry.getKran());
			st.setString(4, entry.getTime());
			st.setLong(5, entry.getPratkaNomer());
			st.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL exception: " + e.getMessage());
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void getCranesInfo() {
		try {
			PreparedStatement st = con.prepareStatement("SELECT COUNT(ID), crane_id, FROM " + DB_NAME + " GROUP BY crane_id, ORDER BY crane_id ASC;");
			ResultSet res = st.executeQuery();
			for (int i = 0; i < res.getFetchSize(); i++) {
				System.out.println(res.next());
			}
		} catch (SQLException e) {
			System.out.println("SQL exception: " + e.getMessage());
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void getDocsInfo() {
		try {
			PreparedStatement st = con.prepareStatement("SELECT COUNT(boat_name), dock_id, FROM " + DB_NAME + " GROUP BY dock_id, ORDER BY dock_id ASC;");
			ResultSet res = st.executeQuery();
			for (int i = 0; i < res.getFetchSize(); i++) {
				System.out.println(res.next());
			}
		} catch (SQLException e) {
			System.out.println("SQL exception: " + e.getMessage());
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void best() {
		try {
			PreparedStatement st = con.prepareStatement("SELECT COUNT(ID), boat_name, FROM " + DB_NAME + " GROUP BY boat_name, ORDER BY ID DESC, LIMIT 1;");
			ResultSet res = st.executeQuery();
			System.out.println(res);
		} catch (SQLException e) {
			System.out.println("SQL exception: " + e.getMessage());
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
}
