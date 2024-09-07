// Step 1: Product Interfaces
interface Button {
    void click();
}

interface Checkbox {
    void toggle();
}

// Step 2: Concrete Products for Windows
class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows Button clicked!");
    }
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("Windows Checkbox toggled!");
    }
}

// Step 3: Concrete Products for MacOS
class MacOSButton implements Button {
    @Override
    public void click() {
        System.out.println("MacOS Button clicked!");
    }
}

class MacOSCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("MacOS Checkbox toggled!");
    }
}

// Step 4: Abstract Factory Interface
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Step 5: Concrete Factory for Windows
class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// Step 6: Concrete Factory for MacOS
class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

// Step 7: Client Class
class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void run() {
        button.click();
        checkbox.toggle();
    }
}

// Step 8: Test the Abstract Factory
public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        // Based on some configuration or input, decide the factory type
        String os = "Windows"; // Can also be "MacOS"

        if (os.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        Application app = new Application(factory);
        app.run();
    }
}
