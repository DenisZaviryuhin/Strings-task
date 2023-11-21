package app;

public class Main02 {
    public static void main(String[] args) {
        getOutput(getData(provideData()));

    }

    private static String[] provideData() {
        return new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};

    }

    private static String getData(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        for (String name : words) {
            if (!name.equals("onion")) {
                count++;
                stringBuilder.append(count)
                        .append(") ")
                        .append(name)
                        .append("\n");
            }


        }
        return stringBuilder.toString();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
