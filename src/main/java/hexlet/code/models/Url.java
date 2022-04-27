package hexlet.code.models;

import io.ebean.Model;
import io.ebean.annotation.WhenCreated;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public final class Url extends Model {

    @Id
    private long id;

    private String name;

    @WhenCreated
    private Date createdAt;

    public Url(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Url{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", createdAt=" + createdAt
                + '}';
    }

}
