import java.util.ArrayList;
import java.util.List;

public class Challenge1 {
    public static void main(String[] args) {
        generateString("Tipo B");
        List<String> fruits = new ArrayList<>();
        fruits.add("Manzana");
        fruits.add("Pera");
        fruits.add("Mandarina");
        fruits.add("Banana");
        wordInArray("Banana", fruits);
    }

    //String type;
    public static String generateString(String type){
        String number="";
        for(int i=0; i<8; i++){
            int num = (int)((Math.random()*9)+0);
            //System.out.println(num);
            number = number + Integer.toString(num);
            //System.out.println(number);
        }
        if (type.equals("Tipo A")){
            number = "54"+number;
        }
        else{
            number = "08"+number;
        }
        return number;
    }
    public static boolean wordInArray(String word, List<String> array){
        boolean answer;
        if(array.contains(word)){
            answer = false;
        }
        else{
            answer = true;
        }
        return answer;
    }
}
