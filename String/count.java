package String;

public class count {
    public static void main(String[] args) {
        String str = "india is my india";
        int n = str.length();
        String[] arr = new String[4];
        String word = "";
        int j = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if ((ch == ' ' && (i + 1 < n && str.charAt(i + 1) != ' ')) || i == n - 1) {
                if (i == n - 1)
                    word = word + ch;
                arr[j++] = word;
                word = "";
            } else
                word = word + ch;
        }

        int[] wordCount = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                wordCount[i]++;
                for (int k = i + 1; k < arr.length; k++) {
                    if (arr[i]==(arr[k])) {
                        wordCount[i]++;
                        arr[k] = "";
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i] + " " + wordCount[i]);
                System.out.println("-------");
            }
        }
    }
}
