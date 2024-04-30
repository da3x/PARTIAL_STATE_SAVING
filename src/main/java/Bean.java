import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.UUID;

@Named
@ViewScoped
public class Bean implements Serializable {

    public String hello() {
        return "Hello World";
    }

    public String random() {
        return UUID.randomUUID().toString();
    }
}
