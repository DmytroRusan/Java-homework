package Task33;

public class Task33 {
    public static void main(String[] args) {
        String myText = "Я любю мову Java";
        String[] arrayOfText = myText.split(" ");
        String result = "";
        for (int i = 0; i < arrayOfText.length; i++) {
            result += arrayOfText[i].substring(0, 1).toUpperCase() + arrayOfText[i].substring(1);
        }

        System.out.println(result);
    }
}
