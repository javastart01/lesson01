/**
 * Created by mao on 11.02.2017.
 */
public  class Calculate {
    public static void main(String[] arg){
        System.out.println("Calculated...");
        System.out.println("Вычисляю....");
        int first =Integer.valueOf(arg[0]);
        int second=Integer.valueOf(arg[1]);
        int sum=first+second;
        System.out.println("Sum is " + sum);
        double powe=Math.pow(first,second);
        System.out.println("Pow is "+powe);

    }

}
