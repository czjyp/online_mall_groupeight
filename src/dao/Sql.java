package dao;

import java.sql.*;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class Sql {
	// 数据库的驱动名
	private final static String dbDriver = "com.mysql.jdbc.Driver";
	// 数据库的url地址
	private final static String url = "jdbc:mysql://localhost:3306/s_hand?useUnicode=true&characterEncoding=utf-8&useSSL=true";

	private final static String userName = "root";

	private final static String password = "515658";

	private static Connection conn = null;
	private static Session session = null;

	private static int lport = 3308;// 本地端口
	private static String rhost = "localhost";// 远程MySQL服务器
	private static int rport = 3306;// 远程MySQL服务端口

	public static void go() {
		String user = "root";// SSH连接用户名
		String password = "515658czjyp";// SSH连接密码
		String host = "172.93.37.148";// SSH服务器
		int port = 27753;// SSH访问端口
		try {
			JSch jsch = new JSch();
			if (session == null) {
				session = jsch.getSession(user, host, port);
				session.setPassword(password);
				session.setConfig("StrictHostKeyChecking", "no");
			}
			if (!session.isConnected()) {
				session.connect();

				// String boundaddress ="0.0.0.0";
				int assinged_port = session.setPortForwardingL(lport, rhost, rport);
				System.out.println("localhost:" + assinged_port + " -> " + rhost + ":" + rport);
			}
			System.out.println(session.getServerVersion());// 这里打印SSH服务器版本信息

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected static Connection Connection4Mysql() {
		// 加载数据库驱动
		try {
			Class.forName(dbDriver).newInstance();
			// System.out.println("加载驱动成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("数据库驱动加载失败");
		}
		// 获取数据库链接
		try {
			if (conn == null)
				conn = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("获取数据库链接失败");
		}
		return conn;
	}

	public Sql() {
		//go();
		Connection4Mysql();
	}

	// 执行各种SQL语句的方法

	protected static ResultSet execSQL(String sql, Object... args) throws SQLException {
		if (conn == null||conn.isClosed()) {
			//go();
			conn = Connection4Mysql();
		}
		// 建立PreparedStatement对象
		PreparedStatement pStmt = conn.prepareStatement(sql);
		// 为pStmt对象设置SQL参数值

		for (int i = 0; i < args.length; i++) {
			pStmt.setObject(i + 1, args[i]);
		}
		 System.out.println(pStmt.toString());
		// 执行SQL语句
		pStmt.execute();
		// 返回结果集,如果执行的SQL语句不返回结果集，则返回null
		ResultSet resultSet = pStmt.getResultSet();
		// closeSQLConn();
		return resultSet;

	}

	protected static void closeSQLConn() {
		// 关闭数据库链接
		if (conn != null) {
			try {
				conn.close();		
				conn=null;
				if (session!=null&&session.isConnected())
					session.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}