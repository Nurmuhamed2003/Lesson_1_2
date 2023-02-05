import java.util.Random;public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(23, 10));
        System.out.println(ageAndTemperature(15, 23));
        System.out.println(ageAndTemperature(20, 15));
        System.out.println(ageAndTemperature(30, 45));
        System.out.println(ageAndTemperature(10, 33));
    }

    public static String ageAndTemperature(int age, int temperature) {
        if (age > 20 && age < 45) {
            if (temperature > -20 && temperature < 30) {
                return ("Можно идти гулять");            }
        }

        if (age < 20) {
            if (temperature > 0 && temperature < 20) {
                return ("Можно идти гулять");            }
        }

        if (age > 45) {
            if (temperature > -10 && temperature < 25) {
                return ("Можно идти гулять");            }
        } else {

        }
        return ("Оставайтесь дома");
    }

    public static int ageAndTemperature(){
        Random random= new Random();
        int s = random.nextInt(100)+1;
        return s;    }
}