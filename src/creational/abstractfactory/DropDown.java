package creational.abstractfactory;

public interface DropDown {
    Object getSelectedItem();
}

class MacDropDown implements DropDown {
    @Override
    public Object getSelectedItem() {
        System.out.println("Mac creational.abstractfactory.Button");
        return null;
    }
}

class WinDropDown implements DropDown {
    @Override
    public Object getSelectedItem() {
        System.out.println("Win dropdown");
        return null;
    }
}