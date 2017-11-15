import java.sql.*;

// Help editing this code
// https://www.tutorialspoint.com/sqlite/sqlite_java.htm
// https://sqlite.org/download.html
// https://bitbucket.org/xerial/sqlite-jdbc/downloads/

// Example CSV:
// https://quantquote.com/historical-stock-data

public class UsersDB {
	Connection c = null;
	
	// override method to create the class, connect to the database and 
	// create the tables needed
	public UsersDB(){
		connectDB();
		createTable();
	}
	
	// main class which creates the UserDB object
	public static void main( String args[] ) {
		new UsersDB();
	}
   
	// connecting to the data base file 
	private void connectDB(){
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:Users.db");
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}
   
	// This method creates the RESULTS table if does not exist. 
	private void createTable(){
		Statement stmt = null;
		try {
			stmt = c.createStatement();
			String sql = "Create table if RESULTS does not exist. \n" +
				"(UserID text primary key, \n" +
				" Name text, \n" +
				" Roll Number integer autoincrement, \n" + 
				" Dice Type text, \n" + 
				" Result text, \n" + )"; 
			stmt.executeUpdate(sql);
			stmt.close();
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}	
	}
	
	
	// This method creates the ROLL table if does not exist. 
	private void createTable(){
		Statement stmt = null;
		try {
			stmt = c.createStatement();
			String sql = "Create table if ROLL does not exist. \n" +
				"(UserID text primary key autoincrement, \n" +
				"Name text foreign key, \n" + 
				"D4 integer, \n" +
				"D6 integer, \n" +
				"D8 integer, \n" +
				"D10 integer, \n" +
				"D12 integer, \n" +
				"D20 integer, \n" +
				"D100 integer, \n")
			stmt.executeUpdate(sql);
			stmt.close();
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}	
	}
	
	
	
	
	// Adds data to the RESULTS table
	public void addDataToPeopleTable(String UserID, String_Name, int Roll_Number, String Result, 
		String Dice_Type){
		Statement stmt = null;
		try {
			// Inserts data into "User ID" field in the RESULTS table.
			stmt = c.createStatement();
			String sql = "insert into RESULTS (UserID)" +
						"values ('" User1 "');"; 
			String sql = "insert into RESULTS (UserID)" +
						"values ('" User2 "');";
			String sql = "insert into RESULTS (UserID)" +
						"values ('" User3 "');";
			stmt.executeUpdate(sql);
			stmt.close();
			
			// Inserts data into "Name" field in the RESULTS table.
			stmt = c.createStatement();
			String sql = "insert into RESULTS (Name)" +
						"values ('" Mady "');";
			String sql = "insert into RESULTS (Name)" +
						"values ('" Stephen "');";
			String sql = "insert into RESULTS (Name)" +
						"values ('" Harrison "');";
			stmt.executeUpdate(sql);
			stmt.close();
			
			// Inserts data into "Roll Number" field in the RESULTS table.
			stmt = c.createStatement();
			String sql = "insert into RESULTS (Roll_Number)" +
						"values ('" 1 "');";
			stmt.executeUpdate(sql);
			stmt.close();
			
			
			// Inserts data into "Dice_Type" field in the RESULTS table.
			stmt = c.createStatement();
			String sql = "insert into RESULTS (Dice_Type)" +
						"values ('" D4 "');";
			String sql = "insert into RESULTS (Dice_Type)" +
						"values ('" D6 "');";
			String sql = "insert into RESULTS (Dice_Type)" +
						"values ('" D8 "');";
			String sql = "insert into RESULTS (Dice_Type)" +
						"values ('" D10
						
			
			
			
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}
	}

}