public class backtraking {
    // public static void backonarray(int arr[],int i,int val){
    //     //base 
    //     if(i==arr.length){
    //        printarray(arr);
    //        return;
    //     }
    //     //kaam 
    //     arr[i]=val;
    //     backonarray(arr, i+1, val+1);
    //     arr[i]=arr[i]-2;
    // }
    // public static void printarray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }

    // //2.subset qn
    // public static void subset(String str,int i,String ans){
    //     //base case
    //     if(i==str.length()){
    //         if(ans.length()==0){
    //             System.out.println("null");
    //         }else{
    //             System.out.println(ans);
    //         }
    //         return;
    //     }
    //     //recursion
    //     //yes
    //     subset(str, i+1, ans+str.charAt(i));
    //     //no
    //     subset(str, i+1, ans);
    // }

    //3.qn permutation
    // public static void permutation(String str,String ans){
    //     //base case
    //     if(str.length()==0){
    //         System.out.println(ans);
    //         return;
    //     }
    //    //recursion
    //    for(int i=0;i<str.length();i++){
    //     char ch=str.charAt(i);
    //     String newstr= str.substring(0, i)+str.substring(i+1);
    //     permutation(newstr, ans+ch);      
    // }
    // }

//     public static void printarray(char chess[][]){
//         System.out.println("-----chess board-----");
//         for(int i=0;i<chess.length;i++){
//             for(int j=0;j<chess.length;j++){
//                 System.out.print(chess[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static boolean issafe(char chess[][],int row,int col){
//         //vertical finiding
//         for(int i=row-1;i>=0;i--){
//             if(chess[i][col]=='Q')
//             return false;
//         }
//         //diag up left
//         for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
//             if(chess[i][j]=='Q')
//             return false;

//         }
//         //diag up right
//         for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++){
//             if(chess[i][j]=='Q')
//             return false;
//     }
//     return true;
// }
    
//     public static void nqueens(char chess[][],int row){
//         //base case
//         if(row==chess.length){
//               printarray(chess);
//               return;
//         }
//         for(int j=0;j<chess.length;j++){
//             if(issafe(chess,row,j)){
//                 chess[row][j]='Q';
//                 nqueens(chess, row+1);
//                 chess[row][j]='x';
//             }
           
//         }
       
         
//     }

//grid ways
// //exponention time complexity
// public static int gridways(int i,int j,int n,int m){

//     //base case
//     if(i==n-1 && j==m-1){
//         return 1;
//     }else if(i==n || j==m){
//         return 0;
//     }
//     int dw=gridways(i+1, j, n, m);
//     int rw=gridways(i, j+1, n, m);
//     return dw+rw;

// }

//suduko sum
public static boolean suduko(int sud[][],int row,int col){
    //basse case
    if(row==9 && col==0){
        return true;
    }else if(row==9){
        return false;
    }
    //recursion
    int xrow=row;
    int xcol=col+1;
    if(xcol==9){
        xcol=0;
        xrow=row+1;
    }
    if(sud[row][col]!=0){
        return suduko(sud, xrow, xcol);
    }
    for(int digit=1;digit<=9;digit++){
        if(issafe(sud,row,col,digit)){
            sud[row][col]=digit;
            if(suduko(sud,xrow,xcol)){
                return true;
            }
        }
    }
    return false;
}
public static boolean issafe(int sud[][],int row,int col,int digit){
    //colum
    for(int i=0;i<8;i++){
        if(sud[i][col]==digit)
        return false;
    }
    //row
    for(int j=0;j<8;j++){
        if(sud[row][j]==digit)
        return false;
    }
    //grid
    int sr=(row/3)*3;
    int sc=(col/3)*3;
    for(int i=sr;i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
            if(sud[i][j]==digit){
                return false;
            }
        }
    }
    return true;
}
    public static void main(String[] args) {
        int arr[]=new int [5];
        // backonarray(arr, 0, 0);
        // printarray(arr);
        //subset("abc", 0, "");
        //permutation("abc", "");
        // int n=5;
        // char chess[][]=new char[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         chess[i][j]='x';
        //     }
        // }
        // nqueens(chess, 0);
       // System.out.println(gridways(0, 0, 3, 3));




    }
}
