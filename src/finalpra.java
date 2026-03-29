import java.util.Scanner;

public class finalpra {
//    static int fab(int n){
//        if(n==0 || n==1){
//            return n;
//        }
//        int prev=fab(n-1);
//        int pp=fab(n-2);
//        return prev+pp;
//    }
//    static int fac(int n){
//        if(n==0){
//            return 1;
//        }
//
//        return n*fac(n-1);
//    }
//    static int sod(int n){
//        if(n>=0 && n<=9){
//            return 1;
//        }
//        int small = sod(n/10);
//      int ans = small + n%10;
//        return small + n%10;
//        return sod(n/10) + n%10;
//    }
//        static int sod(int n){
//            if(n==0){
//                return 0;
//            }
//            return 1 + sod(n/10);
//
//}
//static int pow(int p, int q){
//    if(q==0){
//        return 1;
//    }
//
//    return pow(p,q-1) * p;
//
//
//}
//static int pow(int p, int q){
//    if(q==0){
//        return 1;
//    }
//    if(q%2==0){
//        int smaallpow = pow(p, q/2);
//        return smaallpow*smaallpow;
//    }
//    else{
//        int smaallpow = pow(p, q/2);
//        return smaallpow * smaallpow *p;
//
//    }




//}
//        static void mul(int num, int k){
//            if(k==1){
//                System.out.println(num);
//                return;
//            }
//            mul(num, k-1);
//            System.out.println(num*k);
//
//        }
//    static int seriessum(int n){
//        if(n==0){
//            return 0;
//        }
//        if(n%2==0){
//            return seriessum(n-1)-n;
//        }else{
//            return seriessum(n-1)+n;
//        }
//
//    }
//static void print1toN(int n) {
//    if (n == 0) return;
//    print1toN(n - 1);
//    System.out.print(n + " ");
//}
//static int sum(int n) {
//    if (n == 1) return 1;
//    return n + sum(n - 1);
//}
//    static int gcd(int x, int y){
//        while(x%y != 0){
//            int rem = x%y;
//            x=y;
//            y=rem;
//        }
//        return y;
//    }
    static int gcd(int x, int y){
        if(y==0){
            return x;
        }
        return gcd(y, x%y);
    }





    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x,y));




//        int arr[] = {1,2,3,5,9,4,};
//        int max = arr[0];
//        int min = arr[0];
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//
//            }
//            else if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        for(int i=0; i<=n; i++){
//            System.out.println(fab(i));
//        }
//        System.out.println(fac(5));
        //mul(n, k);
//        System.out.println(seriessum(n));
//        print1toN(6);
//        System.out.println(sum(5));
        

    }
}

