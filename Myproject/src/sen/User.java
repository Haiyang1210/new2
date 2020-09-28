package sen;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Connection;

public class User {
	//私有属性
	private String username;
	private String password;
	
	//无参构造
	public User() {
		// TODO Auto-generated constructor stub
	}
	//有参构造
	public User(String username,String password) {
		super();
		this.username = username;
		this.password = password;
		
	}
	
	public boolean isUserExist(String username,String password) {
			ResultSet rs = query();
			try {
				String name = null;
				String pass = null;
				while(rs.next()) {
					name = rs.getString("username");
					pass = rs.getString("password");
					if(username.equals(name) && password.equals(pass)) {
						return true;
					}
				}
			}catch(Exception e){
				
			}
			return false;
	}
	public ResultSet query() {
		ResultSet rs = null;
		//驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		try {
			//加载驱动程序
			Class.forName(driver);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmmmm","root","666666");
			Statement statement = con.createStatement();
			String sql = "select * from user";
			//ResultSet类，用来存放获取的结果集
			rs = statement.executeQuery(sql);
			return rs;
		}
		catch( Exception e) {
			return null; //null万能类型，可以匹配ResultSet
		}
	}
	
	public int insert(User u) {
		//声明Connection对象
		Connection con;
		//驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		//URL指向要访问的数据库名mydata
		String url = "jdbc:mysql://localhost:3306/mmmmm";
		//MySQL配置时用户名
		String user = "root";
		//MySQL配置时的密码
		String password = "666666";
		//遍历查询结果集
		try {
			//加载驱动程序
			Class.forName(driver);
			//1.getConnection()方法，链接MySQL数据库！
			con = DriverManager.getConnection(url,user,password);
			//创建statement类对象，用来执行SQl语句；
			Statement statement = con.createStatement();
			//要执行的SQL语句
			String sql = "insert into user values('"+u.getUsername()+"','"+u.getPassword()+"')";
			//3/ResultSet类，用来存放获取的结果集
			int rs = statement.executeUpdate(sql);//executeQuery查询，executeUpdate增、删、改
			return rs;
		}
		catch( Exception e) {
			return 0;
		}
	}
	
	//方法
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return this.username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return this.password;
	}
}
