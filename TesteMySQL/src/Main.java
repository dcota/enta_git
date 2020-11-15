import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TimeZone;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = getConnection();
		/*String sql = "INSERT INTO costumers (firstname, lastname) VALUES (?, ?)";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, "Ana");
		statement.setString(2, "Cota");
		int rows = statement.executeUpdate();
		if(rows > 0) {
			System.out.println("Linha adicionada");
		}
		statement.close();*/
		
		String sql1 = "SELECT * FROM costumers WHERE lastname LIKE \"Cota\"";
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
	}
	
	public static  Connection getConnection() throws Exception {
		//String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/teste?serverTimezone=America/Scoresbysund";
		String username = "root";
		String password = "Coronelchaves$75";
		//Class.forName(driver);
		try {
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;

		} catch (Exception e){
			System.out.println("Erro...");
			System.out.println(e);
		}
		return null;
	}

}
