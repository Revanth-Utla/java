import java.util.*;
public class varags {
    // public int avarage(int ...args){
    //     int sum = 0;
    //     for(int x:args){
    //         sum += x;
    //     }
    //     return sum/args.length;
    // }
    // public static void main(String[] args) {
    //    Scanner s = new Scanner(System.in);
    //    int x = s.nextInt();
    //    int y = s.nextInt();
    //    int z = s.nextInt();
    //    varags  v = new varags();
    //    System.out.println(v.avarage(x,y,z) );
    // }
    // enum day{
    //     Sun,mon,tue,wed,thu,fri,sat;
    // }
    // public static void main(String[] args) {
    //     day d =day.mon;
    //     System.out.println(d);
    // }
    // enum light{
    //     red,yellow,green;
    //     light(){
    //         System.out.println(this);
    //     }
    // }
    // public static void main(String[] args) {
    //     light l = light.red;
    // }
    enum coffee{
        small(100),med(200),large(300);
        int quantity;
        coffee(int q){
            this.quantity = q;
        }
        int showQunatity(){
            return this.quantity;
        }
    }
    
    public static void main(String[] args) {
        coffee c = coffee.small;
        System.out.println(c.showQunatity());
        
    }
}
