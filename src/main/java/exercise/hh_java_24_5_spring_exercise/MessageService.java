package exercise.hh_java_24_5_spring_exercise;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    private final List<Message> messages = new ArrayList<>();

    public MessageService() {
        // Pre-initialize messages
        messages.add(new Message("John Doe", "Hello World!", "id-1"));
        messages.add(new Message("Jane Smith", "Spring Boot is great!", "id-2"));
        messages.add(new Message("Alice", "Lombok makes life easier!", "id-3"));
    }

    public List<Message> getAllMessages() {
        return messages;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }
}
