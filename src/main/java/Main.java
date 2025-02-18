import command.Light;
import command.RemoteControl;
import command.impl.LightOffCommand;
import command.impl.LightOnCommand;
import strategy.impl.FixedDiscount;
import strategy.impl.LoyalCustomerDiscount;
import strategy.impl.PercentageDiscount;
import strategy.impl.PriceCalculator;

public class Main {
    public static void main(String[] args) {
        // Strategy Pattern Demo
        PriceCalculator calculator = new PriceCalculator();
        calculator.setDiscountStrategy(new FixedDiscount(50));
        System.out.println("Price after fixed discount: " + calculator.calculatePrice(500));

        calculator.setDiscountStrategy(new PercentageDiscount(10));
        System.out.println("Price after percentage discount: " + calculator.calculatePrice(500));

        calculator.setDiscountStrategy(new LoyalCustomerDiscount());
        System.out.println("Price for loyal customer: " + calculator.calculatePrice(500));

        // Command Pattern Demo
        Light light = new Light();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new LightOnCommand(light));
        remote.pressButton();

        remote.setCommand(new LightOffCommand(light));
        remote.pressButton();
    }
}
