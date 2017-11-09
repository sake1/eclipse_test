package id.ac.sgu.loop;

public class Content implements Comparable{
	
	public static final int MAX_LENGTH = 30;
	
	private String title;
	private int page;
	
	public Content(String title, int page) {
		super();
		this.title = title;
		this.page = page;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	@Override
	public int compareTo(Object o) {
		return Integer.compare(this.page, ((Content) o).getPage());
	}
}
