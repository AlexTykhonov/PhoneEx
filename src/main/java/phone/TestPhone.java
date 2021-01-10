package phone;

public class TestPhone {

    public static void main(String[] args) {
        Phone p1 = new Phone(1214578, "Iphone1", 124);
        Phone p2 = new Phone(2231212, "Samsung", 125);
        Phone p3 = new Phone(3423131, "Pixel", 126);
        System.out.println(p1 + "; " + p2 + "; " + p3);
        System.out.println();

        int receivedCall = p2.receivedCall("John");
        System.out.println("You receved call from " + receivedCall);
        System.out.println();

        MotoPhone motoPhone = new MotoPhone(4, "Motorola", 350);
        System.out.println(motoPhone);

//      задание "И)" сделал с 1 входящей переменной, две ввести в метод под @Override не удалось - появляется ошибка method does not override method in its superclass
//      и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.

        motoPhone.receivedCall("Igor");
        System.out.println();

        Phone phone2 = new Phone(5057890, "Lenovo");
        System.out.println(phone2);

        System.out.println();
        System.out.println("Тестируем отправку сообщений:");
        p1.sendMessage(1212,123231,234124,412341,41241,4345345,62344,7435345,84534,9234234,023423 );

    }

}
