package Travel;

public class Review {
	
	private String r_privatenum;
	private String review;
	private String r_attraction;
	
	public String getR_attraction() {
		return r_attraction;
	}
	public void setR_attraction(String r_attraction) {
		this.r_attraction = r_attraction;
	}
	public String getR_privatenum() {
		return r_privatenum;
	}
	public void setR_privatenum(String r_privatenum) {
		this.r_privatenum = r_privatenum;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public Review() {
		super();
	}
	public Review(String r_privatenum, String review, String r_attraction) {
		super();
		this.r_privatenum = r_privatenum;
		this.review = review;
		this.r_attraction = r_attraction;
	}
	@Override
	public String toString() {
		return "Review [r_privatenum=" + r_privatenum + ", review=" + review + ", r_attraction=" + r_attraction + "]";
	}
}
