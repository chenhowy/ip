public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public boolean markTask() {
        isDone = !isDone;
        return isDone;
    }
}
