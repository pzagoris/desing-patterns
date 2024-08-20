
public class PublishedState implements State {
    @Override
    public void publish(Document doc) {
        System.out.println("Document is already Published. Cannot publish again.");
    }

    @Override
    public void render(Document doc) {
        System.out.println("Document is Published. Rendering content to users.");
    }
}