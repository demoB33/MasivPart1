public class Main {
    public static void main(String[] args) {
        //Массивы Часть 1
        // Задача 1
        int[] apple = new int[3];
        apple[0] = 1;
        apple[1] = 2;
        apple[2] = 3;
        double[] weights = {1.57, 7.654, 9.986};
        int[] cat = {1, 2, 3, 4, 5, 6, 7,};
        //Задача 2
        System.out.print(apple[0] + ",");
        System.out.print(apple[1] + ",");
        System.out.println(apple[2]);
        System.out.print(weights[0] + ",");
        System.out.print(weights[1] + ",");
        System.out.println(weights[2]);
        for (int i = 0; i < cat.length; i++) {
            if(i < 6) {
                System.out.print(cat[i] + ",");
            }else{
                System.out.println(cat[6]);
            }
        }
        //Задача 3
        for (int i = 2; i >= 0; i--) {
            if (i > 0) {
                System.out.print(apple[i] + ",");
            }else{
                System.out.println(apple[i]);
            }
        }
        System.out.print(weights[2] + ",");
        System.out.print(weights[1] + ",");
        System.out.println(weights[0]);
        for (int i = 6; i >= 0; i--) {
            if(i > 0){
                System.out.print(cat[i] + ",");
            }else{
                System.out.println(cat[i]);
            }
        }
        //Задача 4
        for (int i = 0; i < apple.length; i++) {
            if (apple[i] % 2 !=0){
                apple[i]++;
                System.out.println(apple[i]);
            }else{
                System.out.println(apple[i]);
            }
        }
    }
}