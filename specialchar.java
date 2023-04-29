//program to remove special character in java

public class specialchar {
    public static void main(String[] args) {
        String str="j@a$v#a%pro*gr^am";

        String ne=str.replaceAll("[^a-zA-Z0-9]", ""); //here ^ sign indicates that apart from alphabate remove all characters
        System.out.println(ne);
    }
}
