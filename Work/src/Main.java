
public class Main {

	public static void main(String[] args) {
		Day Day1 = new Day(); // referans olu�turma
		Day1.id=1;
		Day1.Dayname = "1.G�n";
		Day1.Date ="21 Nisan 2021" ;
		Day1.detail="16 GB Ram ";
		
		Day Day2 = new Day(); 
		Day2.id=2;
		Day2.Dayname = "2.G�n";
		Day1.Date ="24 Nisan 2021" ;
		Day2.detail=" ";
		
		Day [] Days = {Day1,Day2};
		   for (Day Day : Days) 
		   {
			   System.out.println(Day.Dayname);
		   }
		   System.out.println(Days.length);
	    Category category1 =new Category ();   
		category1.id= 1;
		category1.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)";
	    Category category2 =new Category ();   
		category2.id= 2;
		category2.name="Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT) ";
		
		CategoryManager categoryManager =new CategoryManager();
		categoryManager.addToCart(category1);// metod dataya ihtiya� duyuyorsa parametre ile yapar�z
		categoryManager.addToCart(category2);
	}

}
