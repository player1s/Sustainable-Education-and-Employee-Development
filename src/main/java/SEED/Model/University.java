package SEED.Model;

public class University {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
