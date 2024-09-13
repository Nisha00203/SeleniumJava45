package StringsDemo;

public class SplitWithSymbol {
    public static void main(String[] args) {

        String str="Color=red";
        String[] strArr = str.split("=");
        System.out.println("split="+strArr[0]);
    }
}