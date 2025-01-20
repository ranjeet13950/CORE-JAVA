import java.util.*;
public class Loops {
    public static void main(String[]args){
 //               for loop
//        for(int i = 0; i<=3; i++){
//            System.out.println("hello");
//        }

//       for(int i=1; i<=10; i++){
//           System.out.print(i+ " ");
//       }


        //WHILE LOOP

//       int i = 1;
//       while(i<=10){
//           System.out.println(i);
//           i++;
//       }

//        int i=0;
//        do{
//            System.out.println("hello");
//
//            i++;
//        }  while(i<3);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        int sum = 0;
//        for(int i =1; i<=n; i++){
//           sum = sum+i;
//        }
//        System.out.println(sum );

          for(int i = 1; i<=10; i++) {
              System.out.println(n * i);
          }
    }
}
