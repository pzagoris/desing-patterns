// Step 2: Create concrete strategies implementing the Strategy interface
class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}