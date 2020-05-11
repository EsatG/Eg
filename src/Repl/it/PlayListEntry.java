package Repl.it;

public class PlayListEntry {

    String title;
    String artist;
    int playCount;

    public void setTitle(String title){
        this.title = title;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public void setPlayCount(int playCount){
        this.playCount = playCount;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getPlayCount(){
        return playCount;
    }

}

class PlayListEntryObjects {
    public static void main(String[] args) {

        PlayListEntry obj = new PlayListEntry();

        obj.setTitle("Disco Hits of the 90s");

        System.out.println(obj.getTitle());


    }
}
