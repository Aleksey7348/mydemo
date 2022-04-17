import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите два числа: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a=0, b=0, result = 0;
        try {
            a = Integer.parseInt(reader.readLine());
            b = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.print("Error" + e.getMessage());
        }
        System.out.print("Введите знак операции: ");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String sing = " ";
        try {
            sing = read.readLine();
        } catch (IOException e) {
            System.out.print("Error" + e.getMessage());
            if (result<0){
                System.out.println("Неверно");
            }

        }
        switch (sing){
            case "+":{
                result = a + b;
                break;
            }
            case "-":{
                result = a - b;
                break;
            }
            case "/":{
                result = a / b;
                break;
            }
            case "*":{
                result = a * b;
                break;
            }
        }
        System.out.print(result);
        if (result<0){
            System.out.println(" неверно");
        }else if(result>10){
            System.out.println(" неверно, результат не может быть больше 10");
        }
    }
}
