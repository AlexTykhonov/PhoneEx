package phone;//Класс phone.Phone.
//а) Создайте класс phone.Phone, который содержит переменные number, model и weight.
//б) Создайте три экземпляра этого класса.
//в) Выведите на консоль значения их переменных.
//г) Добавить в класс phone.Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//д) Добавить конструктор в класс phone.Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
//е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//ж) Добавить конструктор без параметров.
//з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
//и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//к) Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.

public class Phone {

protected int number;
protected String model;
protected float weight;

    public Phone() {
    }

    public Phone(int number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }


    int receivedCall (String callname) {
        System.out.println("The original method receivedCall -> call from "+callname);
        return this.number;
    }

    //к) Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    void sendMessage (int messagenumber, int...vars) {
        int i1=1;
        for (int i:vars) {
            System.out.println(i1+" cообщение ушло на номер:"+i);
            i1++;
        }
    }
}
