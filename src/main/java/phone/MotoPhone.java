package phone;

public class MotoPhone extends Phone {

    public MotoPhone(int number, String model, float weight) {
        super(number, model, weight);
    }

    @Override
    public String toString() {
        return "phone.MotoPhone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    int receivedCall (String callname) {
        System.out.println("This is "+callname+" calling from number "+number);
        return number;
    }
}
