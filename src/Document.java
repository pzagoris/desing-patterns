// The context in the UML diagram
class Document {
    private State state;

    public Document() {
        // Initial state is Draft
        state = new DraftState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void publish() {
        state.publish(this);
    }

    public void render() {
        state.render(this);
    }
}