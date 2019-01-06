package creational.abstractfactory;

public interface Button {
    void onPress();
}

class WinButton implements Button {
    @Override
    public void onPress() {
        System.out.println("Win button pressed");
    }
}

class MacButton implements Button {
    @Override
    public void onPress() {
        System.out.println("Mac button pressed");
    }
}