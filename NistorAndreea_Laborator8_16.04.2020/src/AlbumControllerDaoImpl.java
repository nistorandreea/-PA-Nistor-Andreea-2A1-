import java.util.ArrayList;
import java.util.List;

public class AlbumControllerDaoImpl implements AlbumControllerDao{

    List<AlbumController> albums;
    public AlbumControllerDaoImpl()
    {
        albums = new ArrayList<AlbumController>();
        AlbumController album1 = new AlbumController(1, "Bad", 1, "1984");
        AlbumController album2 = new AlbumController(2, "perfect", 2, "2018");
        albums.add(album1);
        albums.add(album2);
    }

    public List<AlbumController> getAllAlbums() {
        return albums;
    }

    public AlbumController getAlbum(int id) {
        return albums.get(id);
    }

    public void updateAlbum(AlbumController album) {
            albums.get(AlbumController.getId()).setName(AlbumController.getName());
            System.out.println("Album: Id " + AlbumController.getId() + ", updated in the database");

    }

    public void deleteAlbum(AlbumController album) {
        albums.remove(AlbumController.getId());
        System.out.println("Album: Id " + album.getId() + ", deleted from database");
    }
}
