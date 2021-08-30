public class RemoveParentheses {

    public static void main(String[] args) {
        String value ="(47((56))";
        int valueSize = value.length();
            for (int i = 0; i <valueSize; i++) {
                char firstIn = value.charAt(i);
                int lastIndex= valueSize-1;
                if(firstIn=='('){
                    for (int j = lastIndex; j >=0 ; j--) {
                        if (value.charAt(j)==')'){
                            System.out.print(value.charAt(i));
                            System.out.print(value.charAt(j));

                        }


                    }

                }
            }

    }
}
