import lombok.Data;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

@Data
public class MarkReadMessageCommand {

    @TargetAggregateIdentifier
    private String id;

    public MarkReadMessageCommand(String id) {
        this.id = id;
    }

}
