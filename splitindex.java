package StringsDemo;

public class splitindex {

    public static void main(String[] args) {
        String str = "We are learning java";
        String[] strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++)
        if (strArr[i].charAt(1) == 'e')
        {
            System.out.println(strArr[i]);

        }

    }

}


