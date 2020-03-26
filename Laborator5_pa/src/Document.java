import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Document implements Serializable {
    private String id;
    private String name;
    private String location; //file name or Web page
    private Map<String, String> tags;

    //constructor

    public Document(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.tags = new HashMap();
    }

    //setters and getters

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
      
    public void addTags(String key, String value)
    {
        this.tags.put(key, value);
    }

    public Map<String, String> getTags() { return this.tags; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(id, document.id) &&
                Objects.equals(name, document.name) &&
                Objects.equals(location, document.location) &&
                Objects.equals(tags, document.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, tags);
    }
//…
}
