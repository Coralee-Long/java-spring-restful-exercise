package exercise.hh_java_24_5_spring_exercise;

public class Message {
    private String name;
    private String message;
    private String id;

    // Constructor with all arguments
    public Message(String name, String message, String id) {
        this.name = name;
        this.message = message;
        this.id = id;
    }

    // No-argument constructor
    public Message() {
    }

    // Getters and setters (if not using Lombok)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
