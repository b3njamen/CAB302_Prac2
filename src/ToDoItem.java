public class ToDoItem {
    private String description;
    private boolean isDone;

    public ToDoItem(String description) {
        this.description = description;
        isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public Boolean isDone(){
        return isDone;
    }

    // Doesn't get used, task says add for every field though, so I did.
    public void setDescription(String description){
        this.description = description;
    }

    public void setDone(Boolean isDone){
        this.isDone = isDone;
    }

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
}