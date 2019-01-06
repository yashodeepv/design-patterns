package creational.abstractfactory;

/**
 *
 * Abstract Factory Pattern
 *
 * Requirement:
 *   Create UI components with OS specific appearance.
 *   For example: Button or other UI components should appear different in Windows and Mac
 *
 *   Create more than 1 types of Objects for a given condition like in above case it is OS
 *
 */
public class Main {

    public static void main(String[] args) {

        UIComponentFactory factory = createFactory(OS.WIN);

        Button submitButton = factory.createButton();
        DropDown cityDropdown = factory.createDropDown();

        submitButton.onPress();
        cityDropdown.getSelectedItem();

    }

    private static UIComponentFactory createFactory(OS os) {
        UIComponentFactory factory = null;
        switch (os) {
            case MAC:
                factory = new MacFactory();
                break;
            case WIN:
                factory = new WinFactory();
                break;
            default: throw new UnsupportedOperationException();
        }
        return factory;
    }
}


