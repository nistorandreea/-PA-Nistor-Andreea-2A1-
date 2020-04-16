import java.util.ArrayList;
import java.util.List;

public class ArtistControllerDaoImpl implements ArtistControllerDao  {


        //list is working as a database
        List<ArtistController> artists;

        public void StudentDaoImpl(){
            artists = new ArrayList<ArtistController>();

            ArtistController artist1 = new ArtistController(1, "Michael Jackson", "America");
            ArtistController artist2 = new ArtistController(2, "Bruno Mars", "America");
            artists.add(artist1);
            artists.add(artist2);
        }
        @Override
        public void deleteArtist(ArtistController artists) {
            ArtistController.remove(artists.getId());
            System.out.println("Artist: Id " + artists.getId() + ", deleted from database");
        }

        //retrive list of artists from the database
        @Override
        public List<ArtistController> getAllArtists() {
            return artists;
        }


        @Override
        public void updateArtist(ArtistController artists) {
            ArtistController.get(artists.getId()).setName(artists.getName());
            System.out.println("Artist: Id " + artists.getId() + ", updated in the database");
        }

    public void create(String name, String country){

    }
    public void findByName(String name){

    }
}
