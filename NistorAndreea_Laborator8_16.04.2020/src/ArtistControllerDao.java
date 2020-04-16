import java.util.List;

public interface ArtistControllerDao {
    public List<ArtistController> getAllArtists();
    public void updateArtist(ArtistController artists);
    public void deleteArtist(ArtistController artists);
    public void create(String name, String country);
    public void findByName(String name);
}
