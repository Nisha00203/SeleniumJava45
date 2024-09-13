package StringsDemo;

public class RemoveComma {

    public static void main(String[] args) {
        {
            String str = "12,22,33";
            String[] strArr = str.split(",");
            String temp= " ";
            for(int i=0;i<strArr.length;i++)
            {
                temp = temp+strArr[i];
            }

            System.out.println(temp);


        }
    }
}
