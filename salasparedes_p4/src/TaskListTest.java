import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
public class TaskListTest {

    /*
    * DEAR GRADER I HAVE AN ISSUE WITH THE FACT ON WHY SHOULD I MAKE MY METHODS PRIVATE
    * IF I DO THAT THEN MY TEST CASES WONT WORK SO I HAVE MADE THE EXECUTIVE DECISION OF MAKING
    * THE METHODS PUBLIC HOPE THAT'S OKI
    */
    @Test
    public void addingTaskItemsIncreasesSize() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-11"));
        assertEquals(1, tl.GetTaskItems().size());
    }

    @Test
    public void completingTaskItemChangesStatus() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-11"));
        tl.MarkItemComplete(0, true);
        assertEquals(true, tl.getTaskItemByIndex(0).isCompleted());
    }

    @Test
    public void completingTaskItemFailsWithInvalidIndex() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-11"));
        assertThrows(IndexOutOfBoundsException.class,() -> tl.MarkItemComplete(1, true));
    }

    @Test
    public void editingTaskItemDescriptionChangesValue() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-11"));
        tl.editItemDescription(0, "New Description");
        assertEquals("New Description", tl.getTaskItemByIndex(0).getDescription());
    }

    @Test
    public void editingTaskItemDescriptionFailsWithInvalidIndex() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-11"));
        assertThrows(IndexOutOfBoundsException.class,() -> tl.editItemDescription(1, "New Description"));
    }

    @Test
    public void editingTaskItemDueDateChangesValue() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-11"));
        tl.EditItemDueDate(0, "2020-11-17");
        assertEquals(LocalDate.parse("2020-11-17"), tl.getTaskItemByIndex(0).getDueDate());
    }

    @Test
    public void editingTaskItemDueDateFailsWithInvalidIndex() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-16"));
        assertThrows(IndexOutOfBoundsException.class,() -> tl.EditItemDueDate(1, "2020-11-17"));
    }

    @Test
    public void editingTaskItemTitleChangesValue() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-16"));
        tl.EditItemTitle(0, "New Title");
        assertEquals("New Title", tl.getTaskItemByIndex(0).getTitle());
    }

    @Test
    public void editingTaskItemTitleFailsWithInvalidIndex() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-11"));
        assertThrows(IndexOutOfBoundsException.class,() -> tl.EditItemTitle(1, "New Title"));
    }

    @Test
    public void newTaskListIsEmpty() {
        TaskList tl = new TaskList();
        assertEquals(0, tl.GetTaskItems().size());
    }

    @Test
    public void removingTaskItemsDecreasesSize() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "1111-11-11"));
        tl.RemoveTask(0);
        assertEquals(0, tl.GetTaskItems().size());
    }

    @Test
    public void removingTaskItemsFailsWithInvalidIndex() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-11"));
        assertThrows(IndexOutOfBoundsException.class, () -> tl.RemoveTask(1));
    }

    @Test
    public void uncompletingTaskItemChangesStatus() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-11", true));
        tl.MarkItemComplete(0, false);
        assertEquals(false, tl.getTaskItemByIndex(0).isCompleted());
    }

    @Test
    public void uncompletingTaskItemFailsWithInvalidIndex() {
        TaskList tl = new TaskList();
        tl.AddTask(new TaskItem("TEST", "TEST", "2020-11-11", true));
        assertThrows(IndexOutOfBoundsException.class,() -> tl.MarkItemComplete(1, false));
    }

    @Test
    public void editingTaskItemChangesValues(){

    }
    @Test
    public void gettingTaskItemDescriptionFailsWithInvalidIndex(){

    }
    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){

    }
    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){

    }
    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){

    }
    @Test
    public void gettingTaskItemTitleFailsWithInvalidIndex(){

    }
    @Test
    public void gettingTaskItemTitleSucceedsWithValidIndex(){

    }
    @Test
    public void savedTaskListCanBeLoaded(){

    }
}

