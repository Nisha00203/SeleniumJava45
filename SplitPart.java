package StringsDemo;

public class SplitPart {

    public static void main(String[] args) {
        {
            String str= "We are here";
            String[] strArr = str.split(" ");
            for(int i=0;i<strArr.length;i++)
            {
                if(strArr[i].endsWith("re"))
                {
                    System.out.println(strArr[i]);
                }
            }
        }
    }
}
