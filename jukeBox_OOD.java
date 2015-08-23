public class Jukebox{
	private CDPlayer cdPlayer;
	private User user;
	private Set<CD> cdCollection;
	private SongSelector songSelector;
    
    public Jukebox(CDPlayer cdPlayer, User user, Set<CD> cdCollection, SongSelector songSelector){
    	...
    }

    public void setUser(User u){
        this.user = u;
    }

    public Song getCurrentSong(){
    	return songSelector.getCurrentSong();
    }

}

public class CD{
	private String name;
	private Int id;

	public CD(String n, int i){
		name = n;
		id = i;
	}
}

public class CDPlayer{
	private PlayList playList;
	private CD cd;

	public CDPlayer(CD c, PlayList p){...}
	public CDPlayer(CD c){ this.cd = c};
	public CDPlayer(PlayList p){this.playList = p}

	public void playSong(Song s){
		...
	}

	public PlayList getPlayList(){
		return playList;
	}

	public void setPlayList(PlayList p){
		playList = p;
	}

	public CD getCD(){
		return cd;
	}

	public void setCD(CD c){
		cd = c;
	}

}

public class Song{

}

public class User{
	private String name;
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	private long ID;

	public void setID(long ID){
		this.ID = ID;
	}

	public long getID(){
		return ID;
	}

	public User(String name, long ID){

	}

	public User getUser(){
		return this;
	}


}

public Class PlayList{
	private Song song;
	private Queue<Song> queue;

	public PlayList(Song song, Queue<Song> queue){
		...
	}

	public Song getNextToPlay(){
		return queue.peek();
	}

	public void queueUpSong(Song s){
		queue.add(s);
	}
}

