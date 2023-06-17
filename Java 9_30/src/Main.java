class Main {
	public static void main(String[] args) {
		Article[] articles = new Article[9];

		articles[0] = new Article();
		System.out.println(articles[0].id);
		
		articles[1] = new Article();
		System.out.println(articles[1].id);
		
		articles[2] = new Article();
		System.out.println(articles[2].id);
		
		articles[3] = new Article(5, "13-13-13 13:13:13");
		System.out.println(articles[3].id);
		System.out.println(articles[3].regData);

	}
}

class Article {
	static int lastId;
	int id;
	String regData;
	
	static {
		lastId = 9;
	}
	
	Article(int id, String regData) {
		this.id = id;
		this.regData = regData;
	}
	
	Article() {
		this(lastId +1, "2023-1209 12:12:12");
		lastId+=9;
	}
}