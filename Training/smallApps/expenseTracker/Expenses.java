package Training.smallApps.expenseTracker;

import java.io.Serializable;

public class Expenses implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String description;
    private Category category;

    public Expenses(int id, String description, Category category) {
        this.id = id;
        this.description = description;
        this.category = category;
    }


    public int getId() {return id;}
    public String getDescription() {return description;}
    public Category getCategory() {return category;}
    public void setId(int id) {this.id = id;}
    public void setDescription(String description) {this.description = description;}
    public void setCategory(Category category) {this.category = category;}

    @Override
    public String toString() {
        return "Expenses{" + "id=" + id + ", description=" + description + ", category=" + category + '}';
    }

}
