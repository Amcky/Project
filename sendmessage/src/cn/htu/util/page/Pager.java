package cn.htu.util.page;

@SuppressWarnings("unused")
public class Pager {
	private int currentPage;// 当前页数
	private int size = 17;// 每页显示多少记录
	private int totalCounts;// 总记录数
	private int totalpages;// 总页数
	private int firstPage;
	private int lastPage;
	private int prePage;
	private int NextPage;
	private int startposition;// 开始记录位置

	public int getStartposition() {
		return (getCurrentPage() - 1) * size;
	}

	public void setStartposition(int startposition) {
		this.startposition = startposition;
	}

	public int getFirstPage() {
		return 1;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return getTotalpages();
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public int getPrePage() {
		if (getCurrentPage() - 1 <= 0)
			return 1;
		return getCurrentPage() - 1;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public int getNextPage() {
		if (getCurrentPage() + 1 > getTotalpages())
			return getTotalpages();
		return getCurrentPage() + 1;
	}

	public void setNextPage(int nextPage) {
		NextPage = nextPage;
	}

	public Pager(int currentPage, int totalCounts) {
		this.currentPage = currentPage;
		this.totalCounts = totalCounts;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTotalCounts() {
		return totalCounts;
	}

	public void setTotalCounts(int totalCounts) {
		this.totalCounts = totalCounts;
	}

	public int getTotalpages() {
		if (totalCounts % size == 0)
			return totalCounts / size;
		return totalCounts / size + 1;

	}

	public void setTotalpages(int totalpages) {
		this.totalpages = totalpages;
	}

}
