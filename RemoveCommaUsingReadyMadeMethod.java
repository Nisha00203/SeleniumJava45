package StringsDemo;

public class RemoveCommaUsingReadyMadeMethod {

    public static void main(String[] args) {

        String str = "12,33,22";
        String strArr = str.replace(",","");
        int store = Integer.parseInt(strArr);
        System.out.println(store-1);

    }

}
