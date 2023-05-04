public class Main {
    public static void main(String[] args) {
        System.out.println(weatherForWalking((int) generateRandomAge(), (int) generateRandomAge()));
        System.out.println(weatherForWalking((int) generateRandomAge(), (int) generateRandomAge()));
        System.out.println(weatherForWalking((int) generateRandomAge(), (int) generateRandomAge()));
        System.out.println(weatherForWalking((int) generateRandomAge(), (int) generateRandomAge()));
        System.out.println(weatherForWalking((int) generateRandomAge(), (int) generateRandomAge()));
    }

    public static String weatherForWalking(int age, int temperature){

        if ((age >= 20 && age <= 45) && (temperature >=-20 && temperature <= 30))
            return "Можно идти гулять";
        else if(age < 20 && (temperature >=0 && temperature <= 28))
            return "Можно идти гулять";
        else if(age > 45 && (temperature >=-10 && temperature <= 25))
            return "Можно идти гулять";
        else
            return "Оставайтесь дома";
    }

    public static double generateRandomAge(){
        return 1 + Math.random()*99;
    }
}

