public class Main {
    public static void main(String[] args) {

        //Declaration variables
        String a = "first";
        String b = "second";
        String c = "third";
        String d = "fourth";
        String e = "fifth";

        //Declaration array
        String[] ary_words = new String[5];

        //Data assign to array
        ary_words[0] = a;
        ary_words[1] = b;
        ary_words[2] = c;
        ary_words[3] = d;
        ary_words[4] = e;

        //Data get from array
        System.out.println("index " + ary_words[0]);
        System.out.println("index " + ary_words[1]);
        System.out.println("index " + ary_words[2]);
        System.out.println("index " + ary_words[3]);
        System.out.println("index " + ary_words[4]);

        int size = ary_words.length;
        System.out.println(size);

        String fourthIndex = ary_words[4];
        System.out.println("fourth index" + fourthIndex);
        System.out.println(ary_words.toString());

    }
}