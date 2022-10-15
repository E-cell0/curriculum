public class Main1{
    public static void main(String[] args){
        int[] data = {3, 1, 2, 7, 5};
        for(int i = 0; i < 5; i++){
            System.out.print(data[i] + " ");
        }
        
        
        System.out.println();




for (int i = 0; i < 5; i++) {
    for (int j = 4; j > i; j--) {
        //if(data[i] > data[j]) {


        if (data[i] > data[j]) {
          int box = data[j];
          data[j] = data[i];
          data[i] = box;
        //}
            }
    }
}
for(int i = 0; i < data.length; i++){
    System.out.print(data[i] + " ");
}
}
}