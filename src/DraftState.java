public class DraftState implements State {
    @Override
    public void publish(Document doc) {
        System.out.println("Document is being reviewed by moderators.");
        doc.setState(new ModerationState());
    }

    @Override
    public void render(Document doc) {
        System.out.println("Document is in Draft state. Render is not allowed.");
    }
}