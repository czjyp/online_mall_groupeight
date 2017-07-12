package bean;

import annotation.Column;

public class Goods {
	private int user_id;

	private int goods_id;
	
	private String goods_name;
	
	private double goods_price;
	
	private int type_id ;
	
	private int goods_num;
	
	private int goods_status;
	
	private String goods_publish_time;
	
	private String goods_images;
	
	private String goods_description;

	public int getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(int goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public double getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(double goods_price) {
		this.goods_price = goods_price;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public int getGoods_num() {
		return goods_num;
	}

	public void setGoods_num(int goods_num) {
		this.goods_num = goods_num;
	}

	public int getGoods_status() {
		return goods_status;
	}

	public void setGoods_status(int goods_status) {
		this.goods_status = goods_status;
	}

	public String getGoods_publish_time() {
		return goods_publish_time;
	}

	public void setGoods_publish_time(String goods_publish_time) {
		this.goods_publish_time = goods_publish_time;
	}

	public String getGoods_images() {
		return goods_images;
	}

	public void setGoods_images(String goods_images) {
		this.goods_images = goods_images;
	}

	public String getGoods_description() {
		return goods_description;
	}

	public void setGoods_description(String goods_description) {
		this.goods_description = goods_description;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	 

}
