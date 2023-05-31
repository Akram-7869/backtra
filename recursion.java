import java.util.*;
public class recursion {
    // public static void printten(int n){
    //     //base case
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printten(n-1);
//     }

//     // //printing the numbers from one to 10 increasing order
//     // public static void printten(int n){
//     //     //base case
//     //     if(n==1){
//     //         System.out.print(n+" ");
//     //         return;
//     //     }
//     //     printten(n-1);
//     //     System.out.print(n+" ");
       
       
    // }

    // //factorial 
    // public static int factorial(int n)
    // {
    //     if(n==0){
    //         return 1;
    //     }
    //     int fact1=factorial(n-1);
    //     int fact2=n*fact1;
    //     return fact2;
    // }

    // //print the first the sum of n  natural nu,bres
    // public static int sumofn(int n){
    //     //base case
    //     if(n==1){
    //         return 1;
    //     }
    //     int fact1=sumofn(n-1);
    //     int fact2=n+fact1;
    //     return fact2;
    // }

    //fibonnacci sereis
    // public static int fibonnacci(int n){

    //     //base case
    //     if(n==0||n==1) return n;
    //     int fib1=fibonnacci(n-1);
    //     int fib2=fibonnacci(n-2);
    //     int fib3=fib1+fib2;
    //     return fib3;
    //  }

    // //is sorted array
    // public static boolean issort(int arr[],int i){
    //     //base case
    //     if(i==arr.length-1) return true;
    //      if(arr[i]>arr[i+1]) return false;

    //      return issort(arr, i+1);
    // }

    // //fisrt occurance in array
    // public static int fo(int []arr,int key,int i){
    //     // //base case

    //     if(i==arr.length-1){
    //         return -1;
    //     }
    //     // //int i=0;
    //     // if(arr[i]==key){
    //     //     return i;
    //     // }
    //     // return fo(arr,key,i+1);

    //     //last occurance
    //     if(arr[i]==key){
    //         return i;
    //     }
    //     return fo(arr,key,i-1);

    // }
    
    // //brute force solution for the power of x
    // public static int power(int x,int n){
        // //base condtion
        // if(n==0)return 1;
        // return x*power(x, n-1);

        //optimized solution 
        //base case
        if(n==0)return 1;
        int halfp=power(x, n/2);
        int halfpsq=halfp*halfp;
        //odd nu,ber  of power
        if(n%2!=0) 
        halfpsq= x*halfpsq;

        return halfpsq;
    // }

    // public static void removestring(String str,int i,StringBuilder sb,boolean []map){
    //     //base case
    //     if(i==str.length()){
    //         System.out.println(sb);
    //         return ;
    //     }

    //     //operation
    //     char cuurent=str.charAt(i);
    //     if(map[cuurent-'a']==true){
    //         removestring(str, i+1, sb, map);
    //     }else{
    //         map[cuurent-'a']=true;
    //         removestring(str, i+1, sb.append(cuurent), map);
    //     }

    // }

    // public static void bits(int n,int lp,String str){
    //     //base case
    //     if(n==0){
    //         System.out.println(str);
    //         return;
    //     }
    //     //opertions
    //     bits(n-1, 0, str+"0");
    //     if(lp==0){
    //         bits(n-1, 1, str+"1");
    //     }
        
    // }

    //freinds pairs 
    // public static int fp(int n){
    //     //base case
    //     if(n==1||n==2){
    //         return n;
    //     }
    //     //operation
    //     //single
    //     int sw=fp(n-1);
    //     //pairs
    //     int pairs=fp(n-2);

    //  return sw+(n-1)*pairs;
    // }

    //length strung 
    // public static int ls(String name,int idx){

    //     int count=0;
    //    //base case
    //    if(idx==name.length()){
    //     return count++;
    //    }
    //       ls(name, idx+1);
    //     return  count;
    //    }
     
    //qn2
    // //convert the string into the nimber
    public static void stru(String str,int num){
         if(num==0) return;

         int rev=num%10;
         stru(str, num/10);
         System.out.println(str[rev]+" ");
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=9;
        int arr[]={1,5,6,2,5};
        String str[]={"zero","one","two","three","four","five"};

        // System.out.println(issort(arr, 0));
       //  System.out.println(factorial(n));
       //System.out.println(sumofn(n));
      // System.out.println(fibonnacci(26));

      //System.out.println(fo(arr, 5,arr.length-1));
      //System.out.println(power(2, 5));

     String name="akramma";
    // bits(3, 0, "");
    
    // removestring(name, 0, new StringBuilder(""),new boolean[26]);
     // System.out.println(fp(4));

     //System.out.println(ls(name,0));
     stru(name, 1234);


    } 

}
