package StringsDemo;

public class ParseDemo {

    public static void main(String[] args) {

        String str="12,11,90";
        String[] strArr = str.split(",");
        String number = " ";
        for(int i=0;i<strArr.length;i++)
        {
            number = number+strArr[i];
        }


       // System.out.println(number-1);

    }
}
