public class AlbumController {
    //Create the DAO class AlbumController, having the methods create(String name, int artistId, int releaseYear) and findByArtist(int artistId).
    //id, name, artist_id, releaseYear
    public int id;
    public String name;
    public int artist_id;
    public String releaseYear;

    public AlbumController(int id, String name, int artist_id, String releaseYear)
    {
        this.id = id;
        this.name = name;
        this.artist_id = artist_id;
        this.releaseYear = releaseYear;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArtist_id(int artist_id) {
        this.artist_id = artist_id;
    }

    public int getArtist_id() {
        return artist_id;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getReleaseYear() {
        return releaseYear;
    }
}
