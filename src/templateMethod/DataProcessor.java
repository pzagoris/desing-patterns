package templateMethod;

public abstract class DataProcessor {

    // Template method
    public final void process() {
		System.out.println("Step 1");
        loadData();
		System.out.println("Step 2");
        processData();
		System.out.println("Step 3");
        saveData();
    }

    // Steps that will be implemented by subclasses
    protected abstract void loadData();
    protected abstract void processData();
    protected abstract void saveData();  
}
