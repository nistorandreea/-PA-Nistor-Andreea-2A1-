import java.util.List;

public interface AlbumControllerDao {
    public List<AlbumController> getAllAlbums();
    public AlbumController getAlbum(int id);
    public void updateAlbum(AlbumController albums);
    public void deleteAlbum(AlbumController albums);
}
