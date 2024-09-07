package templateMethod;

abstract class DataProcessor {
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

//Concrete subclass implementing the specific steps for a CSV file
class CSVDataProcessor extends DataProcessor {
	@Override
	protected void loadData() {
		System.out.println("Loading data from a CSV file");
	}

	@Override
	protected void processData() {
		System.out.println("Processing CSV data");
	}

	@Override
	protected void saveData() {
		System.out.println("Saving processed data to a CSV file");
	}
}


public class Main {
	public static void main(String[] args) {
		 DataProcessor csvProcessor = new CSVDataProcessor();
	     csvProcessor.process(); // Execute the template method
	}
}
