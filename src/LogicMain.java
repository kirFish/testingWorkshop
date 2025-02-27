import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LogicMain {

    private String text = "";
    public static void main(String[] args) {


    }

    LogicMain() {
    }

    LogicMain(String text) {
        this.text = text;
    }

    public int firstTask(String text) {

        if(text.isEmpty()){
            return 0;
        }else{
            return 1;
        }
    }


    public int secondTask(int value) {
        return value;
    }


    public int thirdTask(String value) {
        String[] argArr = value.split(",");
        return Integer.parseInt(argArr[0]) + Integer.parseInt(argArr[1]);
    }


    public int fourthTask(String value) {
        String[] argArr = value.split("/n");
        return Integer.parseInt(argArr[0]) + Integer.parseInt(argArr[1]);
    }

    public int fifthTask(String value) throws NumberFormatException{
        String[] arr = new String[3];
        if(value.contains(",")){
            arr = value.split(",");
        }else{
            arr = value.split("/n");
        }


        return Integer.valueOf(arr[0]) + Integer.valueOf(arr[1]) + Integer.valueOf(arr[2]);
    }


    public String sixthTask(String value) throws NumberFormatException{


        if(Integer.valueOf(value) < 0){
            throw new NumberFormatException();
        }
        return value;
    }

    public String seventhTask(String value) {


        if(Integer.valueOf(value) > 1000){
            return "";
        }

        return value;
    }


    public int eighthTask(String value) {

        List<String> argArr;

        char delimiter = value.charAt(value.indexOf("//") +2 );
        String originalValue = value.split("//")[1];

        if(value.contains("//")){

            argArr = Arrays.asList(originalValue.split(",|\n|" + delimiter));
        }else{
            argArr = Arrays.asList(originalValue.split(",|\n"));
        }

        return Integer.parseInt(argArr.get(1)) + Integer.parseInt(argArr.get(2)) + Integer.parseInt(argArr.get(3)) + Integer.parseInt(argArr.get(4))  ;
    }

    //9. A multi char delimiter can be defined on the first line (e.g. //[###] for ‘###’ as the delimiter)
    public int ninthTask(String value) throws NumberFormatException{
        return 0;
    }

    //10. Many single or multi-char delimiters can be defined (each wrapped in square brackets)
    public int tenthTask(String value) {

        return 0;
    }



}