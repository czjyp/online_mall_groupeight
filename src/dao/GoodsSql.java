package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.Goods;

public class GoodsSql extends Sql {

	private static int FindTypeid(String value) {
		String sqlStr = "SELECT type_id FROM Goods WHERE type_name='" + value + "';";
		ResultSet rSet = null;
		try {
			rSet = execSQL(sqlStr);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		try {
			while (rSet.next()) {
				return rSet.getInt("type_name");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return -1;
	}

	public static String PublishGoods(Goods goods) {
		// String PublishSqlStr="INSTERT INTO
		// Goods(goods_name,goods_price,goods_num,goods_description)"
		return null;
	}

	public static List<Goods> BrowseGoods() {
		return null;

	}

	public static String BuyGoods(int goods_id, int buyer_id) {
		return null;

	}

	public static String ModifyGoods(int goods_id) {
		return null;

	}

	public static String DeleteGoods(int goods_id) {
		return null;

	}

	public static String CollectGoods(int goods_id) {
		return null;

	}

	public static List<Goods> SearchGoods(String value) {
		return null;

	}

	public static List<Goods> SearchUser(String value) {
		return null;

	}

}
