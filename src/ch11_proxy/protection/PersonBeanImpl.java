package ch11_proxy.protection;

public class PersonBeanImpl implements PersonBean {
	String name;
	String gender;
	String interests;
	int rating;
	int ratingCount = 0;

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getInterests() {
		return interests;
	}

	/**
	 * 计算rating的平均值
	 */
	public int getHotOrNotRating() {
		if (ratingCount == 0)
			return 0;
		return (rating / ratingCount);
	}
	
	/**
	 * 返回被评论的次数
	 */
	public int getRatingCount() {
		return ratingCount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	/**
	 * 受欢迎程度
	 */
	public void setHotOrNotRating(int rating) {
		// 累计评分
		this.rating += rating;
		// 评论次数累计
		ratingCount++;
	}
}
