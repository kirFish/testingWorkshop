//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        if(Integer.valueOf(value) < 0){
            throw new NumberFormatException();
        }

        return 1;
    }


    public String sixthTask(String value) {

        String result = value;
        if(Integer.valueOf(value) > 1000){
            result = "";
        }
        return result;
    }



}