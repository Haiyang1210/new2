package sen;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Connection;

public class User {
	//˽������
	private String username;
	private String password;
	
	//�޲ι���
	public User() {
		// TODO Auto-generated constructor stub
	}
	//�вι���
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
		//����������
		String driver = "com.mysql.jdbc.Driver";
		try {
			//������������
			Class.forName(driver);
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mmmmm","root","666666");
			Statement statement = con.createStatement();
			String sql = "select * from user";
			//ResultSet�࣬������Ż�ȡ�Ľ����
			rs = statement.executeQuery(sql);
			return rs;
		}
		catch( Exception e) {
			return null; //null�������ͣ�����ƥ��ResultSet
		}
	}
	
	public int insert(User u) {
		//����Connection����
		Connection con;
		//����������
		String driver = "com.mysql.jdbc.Driver";
		//URLָ��Ҫ���ʵ����ݿ���mydata
		String url = "jdbc:mysql://localhost:3306/mmmmm";
		//MySQL����ʱ�û���
		String user = "root";
		//MySQL����ʱ������
		String password = "666666";
		//������ѯ�����
		try {
			//������������
			Class.forName(driver);
			//1.getConnection()����������MySQL���ݿ⣡
			con = DriverManager.getConnection(url,user,password);
			//����statement���������ִ��SQl��䣻
			Statement statement = con.createStatement();
			//Ҫִ�е�SQL���
			String sql = "insert into user values('"+u.getUsername()+"','"+u.getPassword()+"')";
			//3/ResultSet�࣬������Ż�ȡ�Ľ����
			int rs = statement.executeUpdate(sql);//executeQuery��ѯ��executeUpdate����ɾ����
			return rs;
		}
		catch( Exception e) {
			return 0;
		}
	}
	
	//����
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
