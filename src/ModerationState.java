public class ModerationState implements State {
    @Override
    public void publish(Document doc) {
        System.out.println("Document is approved by moderators and is now Published.");
        doc.setState(new PublishedState());
    }

    @Override
    public void render(Document doc) {
        System.out.println("Document is in Moderation state. Rendering preview.");
    }
}