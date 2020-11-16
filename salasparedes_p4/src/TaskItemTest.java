import org.junit.jupiter.api.Test;

import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

public class TaskItemTest {
    @Test
    public void creatingTaskItemFailsWithInvalidDueDate(){
        assertThrows(DateTimeParseException.class, () -> new TaskItem("TEST", "TEST", "NO"));
    }
    @Test
    public void creatingTaskItemFailsWithInvalidTitle(){
        assertThrows(IllegalArgumentException.class, () -> new TaskItem("", "TEST", "1111-11-11"));
    }
    @Test
    public void creatingTaskItemSucceedsWithValidDueDate(){
      assertDoesNotThrow(() -> new TaskItem("TEST", "TEST", "1111-11-11"));
    }
    @Test
    public void creatingTaskItemSucceedsWithValidTitle(){
        assertDoesNotThrow(() ->  new TaskItem("TEST", "TEST", "1111-11-11"));
    }
    @Test
    public void settingTaskItemDueDateFailsWithInvalidDate(){
        assertDoesNotThrow(() ->  new TaskItem("TEST", "TEST", "1111-11-11"));
    }
    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate(){
        TaskItem ti = new TaskItem("TEST", "TEST", "1111-11-11");
        assertThrows(DateTimeParseException.class, () -> ti.SetDueDate("INVALID THE DATE IS WRONG PROGRAM WILL TAKE YOU BACK TO THE TASK MENU: TASK WASN'T CREATED"));
    }
    @Test
    public void settingTaskItemTitleFailsWithInvalidTitle(){
        TaskItem ti = new TaskItem("TEST", "TEST", "1111-11-11");
        assertThrows(IllegalArgumentException.class, () -> ti.SetTitle(""));
    }
    @Test
    public void settingTaskItemTitleSucceedsWithValidTitle(){
        TaskItem ti = new TaskItem("TEST", "TEST", "1111-11-11");
        assertDoesNotThrow(() -> ti.SetTitle("VALID"));
    }
}
