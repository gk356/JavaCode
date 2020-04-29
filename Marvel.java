public class Marvel{
     public static void main(String args[]){
	// First Object of class IronManMovies
	IronManMovies ironman1 = new IronManMovies();
	ironman1.name = "IronMan-1";
	ironman1.releasedDate = 2001;
	IronManMovies.actor = "Robert Downey Junior";
	System.out.println("Name: " +ironman1.name + " Released Date: " + ironman1.releasedDate + " Actor: "+IronManMovies.actor);
	
	// Second Object of class IronManMovies
	IronManMovies ironman2 = new IronManMovies();
	ironman2.name = "IronMan-2";
	ironman2.releasedDate = 2006;
	System.out.println("Name: " +ironman2.name + " Released Date: " + ironman2.releasedDate + " Actor: "+IronManMovies.actor);

	// Object of class Artist
	Artist artist1 = new Artist();
	artist1.artistName = "Ed Sheeran";
	artist1.latestAlbum = "Divide";
	artist1.soldCopies = 2128000;
	Artist.genre = "Music";

	System.out.println(artist1.artistName + " sold " + artist1.soldCopies + " copies of his new album " + artist1.latestAlbum+ ".");
	System.out.println("Genre: " + Artist.genre);

	// Object of class Artist
	Artist artist2 = new Artist();
	artist2.artistName = "Adele";
	artist2.latestAlbum = "25";
	artist2.soldCopies = 3380000;
	Artist.genre = "Music";

	System.out.println(artist2.artistName + " sold " + artist2.soldCopies + " copies of her new album " + artist2.latestAlbum+ ".");
	System.out.println("Genre: " + Artist.genre);
	
}

}

class IronManMovies{
String name;
int releasedDate;
static String actor;
}

class Artist{
String artistName;
String latestAlbum;
int soldCopies;
static String genre;
}