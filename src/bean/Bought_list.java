package bean;

public class Bought_list {
	private int user_id;
	
	private int goods_id;
	
	private String bought_list_time;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public String getBought_list_time() {
		return bought_list_time;
	}

	public void setBought_list_time(String bought_list_time) {
		this.bought_list_time = bought_list_time;
	}

}
