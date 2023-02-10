import java.text.Format;

public class Buldozhka {
    // Продумайте структуру класса Бульдожка. Какие поля и методы будут актуальны для приложения, которое является
    // а) информационной системой ухода за ней
    // б) архивом выставки бульдожков
    // в) информационной системой Театра бульдожек имени Дарахвелидзе

    String name;
    int age;
    String colour;
    String sex;
    int idCheap;

    static int count = 0;

    Buldozhka(String name, int age, String colour, String sex) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.sex = sex;
        this.idCheap = count+1;
        count++;
    }
    public void freshDog() {
        System.out.println(this.name + " моется");
    }

    public void eatDog(){
        System.out.println(this.name + " кушает");
    }

    public void walkDog(){
        System.out.println(this.name + " гуляет");
    }
    public static void getCount() {
        System.out.println("Собак - "+count);
    }
}
