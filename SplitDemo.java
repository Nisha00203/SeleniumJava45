package StringsDemo;

public class SplitDemo {

    public static void main(String[] args) {
        String str="We are learning Java";
        String[] strArr =  str.split(" ");
        for(int i=0;i< strArr.length;i++)

        if(strArr[i].endsWith("e"))
        {
            System.out.println(strArr[i]);

        }


    }

}
