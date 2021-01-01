package io.sunilbranch.springgithub.model;

public class GreetingMessage {

    private final long id;
    private final String content;

    public GreetingMessage(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "GreetingMessage{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
