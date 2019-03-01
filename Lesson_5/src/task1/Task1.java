package task1;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(degree(5, -3));
    }


    //метод возведения числе в целую степень

    public static double degree (double number, int i){
        if (i == 0){return 1;}
        if (number == 0) {return 0;}
        if (number == 1) {return number;}
        if (i == -1) {return 1/number;}

        if (i < 0) {
            return 1/number*degree(number, ++i);
        }

        return number*degree(number, --i);
    }
}
