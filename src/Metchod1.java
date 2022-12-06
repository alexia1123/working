public class Metchod1 {
    public static void main(String[] args) {
        class StringInt {
            public static void main(String[] args) {
                String str = "123" + "123"; //123123
                String first = "125";
                String second = "126";
                System.out.println(sumStr(first, second));
            }

            //method which takes 2 str and return one int = sum of 2 str
            public static int sumStr(String s1, String s2) {
                int i = Integer.valueOf(s1);
                int j = Integer.valueOf(s2);
                return i + j;
            }
        }

    }


    }