// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         System.out.println("hello revanth");

//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the value ");

//         int x = sc.nextInt();
//         System.out.print("enter the value ");

//         int y = sc.nextInt();
//         System.out.print("enter the value ");

//         int z = sc.nextInt();

//         if(y<=x && z<=x ){
//             System.out.println(x);
//         }else if(z<=y){
//             System.out.println(y);
//         }else{
//             System.out.println(z);
//         }


//         // //ternery operator
//         // (condition = true)?TRUE:FALSE;
//         System.out.println((y<=x && z<=x)?x:(z<=y)?y:z);
        
   
//     }
// }


class counter {
        public static int count;
        counter(){
            count = 0;
        }
    };
class Main {
   
    public static void main(String[] args){
        counter c1 = new counter();
        counter c2 = new counter();
        c1.count++;
        System.out.println(c1.count);
        System.out.println(c2.count);
    }
    
};