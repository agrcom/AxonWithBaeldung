import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class MessageCreatedEvent {

    private String id;
    private String text;
}
