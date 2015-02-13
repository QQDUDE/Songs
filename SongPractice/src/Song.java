import java.util.ArrayList;


public class Song
	{
		static int longestSong = 0;
		private String title;
		private String artist;
		private int songLength;
		static ArrayList <Song> songs = new ArrayList <Song>();
		public Song (String t, String a, int l)
			{
				title = t;
				artist = a;
				songLength = l;
			}
		public static void main(String[] args)
			{
				
				songs.add(new Song("This Afternoon","Nickelback",433));
				songs.add(new Song("Rockstar","Nickelback",412));
				songs.add(new Song("Hero","Skillet",307));
				songs.add(new Song("Forgiven","Skillet",339));
				songs.add(new Song("Open Arms","Journey",319));
				printList();
				System.out.println("songs minus ten seconds");
				System.out.println(" ");
			for (int i=0; i < songs.size(); i++)
				{
					
					songs.get(i).setLength(songs.get(i).getLength()-10);
				}
			printList();
			System.out.println("names with song removed");
			System.out.println(" ");
			for (int i =0; i < songs.size(); i++)
				{
					if(songs.get(i).getTitle().length() > longestSong)
						{
							longestSong = songs.get(i).getTitle().length();
							
						}
					
				}
			
			for (int i =0; i < songs.size(); i++)
				{
					if (songs.get(i).getTitle().length() == 14)
						{
							songs.remove(i);
						}		
				}
				
			printList();
			System.out.println("names with my name as artist");
			System.out.println(" ");
			for(int i=0; i < songs.size(); i++)
				{
					songs.get(0).setArtist("Mike");
				}
			printList();
			}
			
			
		public String getTitle()
			{
				return title;
			}
		public void setTitle(String title)
			{
				this.title = title;
			}
		public String getArtist()
			{
				return artist;
			}
		public void setArtist(String artist)
			{
				this.artist = artist;
			}
		public int getLength()
			{
				return songLength;
			}
		public void setLength(int length)
			{
				this.songLength = length;
			}
		public static void printList()
			{
				for(Song o: songs)
					{
						System.out.println("Name of Song:" + o.getTitle());
						System.out.println("Name of Artist:" + o.getArtist());
						System.out.println("Length of Song:"+ o.getLength());
						System.out.println(" ");
					}
			}
	}
