package creational.abstractfactory;

public interface UIComponentFactory {
    Button createButton();
    DropDown createDropDown();
}

/**
 * MAC Factory - Create Mac Specific components appearance
 */
class MacFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }
}

/**
 * WIN Factory - Create Win Specific component appearance
 */
class WinFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public DropDown createDropDown() {
        return new WinDropDown();
    }
}