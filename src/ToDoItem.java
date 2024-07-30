public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field

    public ToDoItem(String description) {
        this.isDone = false;
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setIsDone(boolean setTo){
        isDone = setTo;
    }

    public String getDescription() {
        return description;
    }
}
