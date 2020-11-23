import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.TimeZone;

public class MySQL {

	public static void main(String[] args) throws Exception {
		
		Properties p = new Properties();
		Connection conn = getConnection(p);
		
		//métodos para teste
		createRow(conn);
		querySample(conn);
		//deleteExample(conn);
		
		//criar ficheiro propriedades
		/*OutputStream os = new FileOutputStream("dbConfig.properties");
		p.setProperty("url", "jdbc:mysql://localhost:3306/teste?serverTimezone=America/Scoresbysund");
		p.setProperty("username", "root");
		p.setProperty("password", "Coronelchaves$75");
		p.store(os, null);*/
		
		
	}
	
	public static  Connection getConnection(Properties p) throws Exception {
		InputStream is = new FileInputStream("dbConfig.properties");
		p.load(is);
		//String url = "jdbc:mysql://localhost:3306/teste?serverTimezone=America/Scoresbysund";
		//String username = "root";
		//String password = "Coronelchaves$75";
		//Class.forName(driver);
		try {
			Connection conn = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
			System.out.println("Connected");
			return conn;

		} catch (Exception e){
			System.out.println("Erro...");
			System.out.println(e);
		}
		return null;
	}
	
	
	public static void createRow(Connection conn) {
		try {
			String fn="Mário";
			String ln = "Borges";
			String sql = "INSERT INTO costumers (firstname, lastname) VALUES (?, ?)";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, fn);
			statement.setString(2, ln);
			int rows = statement.executeUpdate();
			if(rows > 0) {
				System.out.println("Linha adicionada");
			}
			statement.close();
		} catch (SQLException e) {

		}
	}
	
	public static void querySample(Connection conn) {
		try {
			String sql1 = "SELECT firstname,lastname FROM costumers ";
			Statement statement1 = conn.createStatement();
			ResultSet result = statement1.executeQuery(sql1);
			int count = 0;
			while(result.next()) {
				String fn = result.getString("firstname");
				String ln = result.getString("lastname");
				count++;
				System.out.println("Costumer " + count + ": " + fn + " " + ln);
			}
			statement1.close();
		} catch (SQLException e) {
			System.out.println("Erro...");
			System.out.println(e);
		}

	}
	
	public static void deleteExample(Connection conn) {
		try {
			String sql1 = "DELETE FROM costumer WHERE firstname LIKE \"Mário\" AND lastname LIKE \"Borges\"";
			Statement statement1 = conn.createStatement();
			statement1.executeUpdate(sql1);
			System.out.println("Deleted");
			statement1.close();
		} catch(SQLException e) {
			System.out.println("Erro...");
			System.out.println(e);
		}
	}
}
