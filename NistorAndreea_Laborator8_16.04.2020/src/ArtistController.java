import java.util.List;

public class ArtistController {
    // Create the DAO class ArtistController, having the methods create(String name, String country) and findByName(String name).
    //id, name, country
    public int id;
    public String name;
    public String country;

    ArtistController(int id, String name, String country)
    {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
