import java.time.LocalDate;
import java.time.format.DateTimeParseException;
public class TaskItem {
    private String description;
    private LocalDate dueDate;
    private boolean taskCompletion = false;
    private String title;

    public TaskItem (String title, String description, String dueDate) throws IllegalArgumentException, DateTimeParseException {
        SetTitle(title);
        this.description = description;
        SetDueDate(dueDate);
        taskCompletion = false;
    }

    public TaskItem (String title, String description, String dueDate, boolean completed) throws IllegalArgumentException, DateTimeParseException {
        SetTitle(title);
        this.description = description;
        SetDueDate(dueDate);
        this.taskCompletion = completed;
    }

    public void SetTitle (String title) throws IllegalArgumentException {
        if(title.length() < 1)
            throw new IllegalArgumentException("INVALID TITLE YOU DINGUS");
        this.title = title;
    }

    public void SetDueDate (String dueDate) throws DateTimeParseException {
        this.dueDate = LocalDate.parse(dueDate);
    }

    public void SetCompleted (boolean completed) {
        this.taskCompletion = completed;
    }

    public void SetDescription  (String description) {
        if(description.length() < 1){
            throw new IllegalArgumentException("INVALID COME ON KNOW DIDN'T THINK I WAS GOING TO MAKE THIS");
        }
        this.description = description;

    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return taskCompletion;
    }

    @Override
    public String toString() {
        String finalProduct = "[" + dueDate.toString() + "] " + title + ": " + description;
        return taskCompletion ? "COMPLETED POGGERS " + finalProduct : finalProduct;
    }
}
