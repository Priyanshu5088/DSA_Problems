/* */


public class LexicographicalFruits {
    public static void LexoFruits(String fruits[]){
        for(int i = 0; i<fruits.length-1; i++){
            int min_fruit = i;
            for(int j = i+1; j<fruits.length; j++){
                if(fruits[j].compareTo(fruits[min_fruit]) < 0){
                    min_fruit = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_fruit];
            fruits[min_fruit] = temp;
        }
    }

    public static void main(String[] args) {
        String fruits[] = {"mango","orange","apple","banana"};
        LexoFruits(fruits);

        for(int i = 0; i<fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
    }
    
}
