
package DB;

/**
 *
 * @author Eladnani Ahmed Reda
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionDB {
	public static Connection loadDatabase() {
		Connection cn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/appgestiondons?zeroDateTimeBehavior=convertToNull","root","");
			System.out.println("connected");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return cn;
		
	}
	
	

}