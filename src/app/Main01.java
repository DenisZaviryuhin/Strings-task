package app;

public class Main01 {
    public static void main(String[] args) {
        getOutput(getData(editWords()));
    }


    private static String[] editWords() {
        String words = " brange, plum, tomato, onibn, grape ";
        String wrongLetter = "b";
        String wrightLetter = "o";
        String editedWords = words.replaceAll(wrongLetter, wrightLetter);
        String delimiter = ",";
        return editedWords.split(delimiter);
    }

    private static String getData(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String name : words) {
            count++;
            stringBuilder.append(count).append(")").append(name).append("\n");


        }

        return stringBuilder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }

}
