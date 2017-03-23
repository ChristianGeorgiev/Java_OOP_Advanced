package ex2;

public class Message {
    private Importance importance;
    private String content;

    public Message(Importance importance, String content){
        this.importance = importance;
        this.content = content;
    }

    public Importance getImportance() {
        return this.importance;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public String toString(){
        return String.format("%s: %s", this.importance.name(), this.content);
    }
}
