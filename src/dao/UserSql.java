package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.util.Args;

import bean.Goods;
import bean.User;

public final class UserSql extends Sql {

	public static List<Goods> BrowseOrder(int user_id, int currentPage, int ItemCount) {
		List<Goods> list = new ArrayList<>();
		String sqlStr = "select * from goods where goods_id in (select goods_id from (select distinct goods_id,collections_id from collections where user_id=? AND collections_id>? order by collections_id limit ?) as tp)";
		Object[] args = new Object[3];
		args[0] = user_id;
		args[1] = (currentPage - 1) * ItemCount;
		args[2] = ItemCount;
		ResultSet resultSet = null;
		try {
			resultSet = execSQL(sqlStr, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			while (resultSet.next()) {

				Goods goods = new Goods();
				goods.setGoods_id(resultSet.getInt("goods_id"));
				goods.setGoods_description(resultSet.getString("goods_description"));
				goods.setGoods_images(resultSet.getString("goods_images"));
				goods.setGoods_name(resultSet.getString("goods_name"));
				goods.setGoods_num(resultSet.getInt("goods_num"));
				goods.setGoods_price(resultSet.getDouble("goods_price"));
				goods.setGoods_publish_time(resultSet.getString("Goods_publish_time"));
				goods.setGoods_status(resultSet.getInt("goods_status"));
				goods.setType_id(resultSet.getInt("type_id"));
				goods.setUser_id(resultSet.getInt("user_id"));

				list.add(goods);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		closeSQLConn();
		return list;
	}

	public static boolean checkUser(String username, String password) {
		ResultSet rs = null;
		String sqlStr="SELECT user_pwd FROM user WHERE user_name=?";
		Object[] args= {username};
		try {
			rs = execSQL(sqlStr,args);
		} catch (SQLException e) {
			System.err.println("查询数据库出错");
			e.printStackTrace();
			closeSQLConn();
			return false;
		}
		try {
			if (rs == null) {
				closeSQLConn();
				return false;
			}
			while (rs.next()) {
				String temp_password = rs.getString("user_pwd").trim();
				if (password.equals(temp_password)) {
					closeSQLConn();
					return true;
				}
				closeSQLConn();
				return false;
			}
		} catch (SQLException e) {
			System.err.println("操作ResultSet出错");
			e.printStackTrace();
		}
		closeSQLConn();
		return false;
	}

	private static boolean RegisterJudge(String value, int type) {
		String QuerysqlString = "";
		switch (type) {
		case 1:
			QuerysqlString = "SELECT * FROM user WHERE user_name=?";
			break;
		case 2:
			QuerysqlString = "SELECT * FROM user WHERE user_pwd=?";
			break;
		case 3:
			QuerysqlString = "SELECT * FROM user WHERE user_email=?";
			break;
		default:
			break;
		}
		ResultSet rSet = null;
		Object args[]= {value};
		try {
			rSet = execSQL(QuerysqlString,args);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		try {
			if (rSet == null)
				return true;
			else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static String RegisterUser(String username, String password, String Email) {
		if (RegisterJudge(username, 1) && RegisterJudge(password, 2) && RegisterJudge(Email, 3)) {
			String InsertsqlString = "INSERT INTO user(user_name,user_pwd,user_email) VALUES(?,?,?)";
			ResultSet rSet = null;
			Object args[]= {username,password,Email};
			try {
				rSet = execSQL(InsertsqlString,args);
				closeSQLConn();
				return "Register success";
			} catch (Exception e) {
				e.printStackTrace();
				closeSQLConn();
				return "Query wrong";
			}
		}
		closeSQLConn();
		return "the information already exists";
	}

	public static String ModifyUserInfo(User user) {
		return null;
	}

	public static void main(String[] args) {
		List<Goods> list = BrowseOrder(1, 2, 5);
		for (Goods goods : list) {
			System.out.println(goods.getUser_id() + "\t" + goods.getGoods_id());
		}
		
		System.out.println(checkUser("1", "1"));
		System.out.println(RegisterJudge("1", 1));
	}
}
