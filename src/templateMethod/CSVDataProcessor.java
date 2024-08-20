package templateMethod;

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
