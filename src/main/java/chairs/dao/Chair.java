package chairs.dao;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

import chairs.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(SCOPE_PROTOTYPE)
public class Chair {

    @Autowired
    Database db;

    int id;

    public Chair(int id) {
        this.id = id;
        System.out.println("Chair.class: created!");
    }

    public boolean saveStatic() {
        if (db.saveChair(id) == false) {
            throw new RuntimeException("couldn't save chair! Sincerely, Chair class");
        } else {
            System.out.println("Chair.class: saved!");
            return true;
        }
    }

    public boolean save() {
        if (db.saveChair(id) == false) {
            throw new RuntimeException("couldn't save chair! Sincerely, Chair class");
        } else {
            System.out.println("Chair.class: saved!");
            return true;
        }
    }

    public boolean update(int id) {
        this.id = id;
        if (db.updateChair(id) == false) {
            throw new RuntimeException("couldn't update chair! Sincerely, Chair class");
        } else {
            System.out.println("Chair.class: updated!");
            return true;
        }
    }

}
