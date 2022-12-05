package advance;

import java.sql.Connection;
import java.sql.SQLException;

public class advance {
	public static void main(String[] args) {
				
				String url="jdbc:mysql://localhost:3306/javabatch";
				String username="root";
				String password="root";
				
				String sql="INSERT INTO product VALUES(1'LeeCooper','Jeans')";
				 Connection conection=null;
						try {
						
							Class.forName("com.mysql.cj.jdbc,Driver");
							connection=DriverManager.getConnection(url,username,password);
							Statement statement=connection.createStatement();
							statement.execute(sql);
							System.out.println("All good");
						}catch(ClassNotFoundException e){
							e.printStackTrace();
							
						}catch(SQLException e) {
							e.printStackTrace();
						}finally {
							connection.close();
						}
			}
}
