package models;

import java.util.*;
import play.db.ebean.*;
import play.data.validation.Constraints.*;
import javax.persistence.*;

@Entity
public class Task extends Model {
    
  @Id
  public Long id;

  
  @Required
  public String label;
  public String homenumber;
  public String mobilenumber;
  
  public static List<Task> all() {
  return find.all();
}

public static void create(Task task) {
  task.save();
}

public static void delete(Long id) {
  find.ref(id).delete();
}
  
  public static Finder<Long,Task> find = new Finder(
  Long.class, Task.class
  );
    
}