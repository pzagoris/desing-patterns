
public class Main {

	public static void main(String[] args) {
        Document doc = new Document();

        // Try to render the document in its initial state
        doc.render();

        // Publish the document (moving it to Moderation state)
        doc.publish();

        // Render in Moderation state
        doc.render();

        // Publish the document again (moving it to Published state)
        doc.publish();

        // Render in Published state
        doc.render();

        // Try to publish the document again (already Published)
        doc.publish();
	}

}
