package StringsDemo;

public class Endwith {

    public static void main(String[] args) {
        {
            String str ="We are learning java";
            String[] strArr = str.split(" ");
            for(int i=0;i< strArr.length;i++)
            if(strArr[i].endsWith("e"))
            {
                System.out.println(strArr[i]);

            }


            for (String x : strArr)
            {
                if (x.endsWith("a"))
                {
                    System.out.println(x);
                }
            }
        }
    }

}
