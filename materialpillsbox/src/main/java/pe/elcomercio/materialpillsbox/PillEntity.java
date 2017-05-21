package pe.elcomercio.materialpillsbox;

/**
 * Created by Carlos Leonardo Camilo Vargas Huamán on 5/20/17.
 *
 */

public class PillEntity {

    private int id;
    private String name;

    public PillEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
