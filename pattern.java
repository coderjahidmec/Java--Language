public class pattern {
    
    public static void main(String args[]){
    
        int m =4;
        int n =7;

        for(int i =0;i<=m;i++){
            
            for(int j=1;j<=n;j++){
                System.out.print("*"); //rectangle
            }

            System.out.println();

        }

        System.out.println();
        // hollow rectangle

        for(int i =1;i<=m;i++){

            for(int j=1;j<=n;j++){

                if(i == 1 || j==1 || i ==m || j == n ){

                    System.out.print("**");

                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        //pyramid 

        for(int i=m;i>=1;i--){

            for(int j=1;j<=i;j++){

                System.out.print("*");
            }
            System.out.println();
        }
// another half pyramid
        for(int i=1;i<=m;i++) {

            for(int j=1; j<=m-i; j++){

                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }


        // Another pattern

        for(int i =1; i<=n;i++){

            for(int j=1; j<=i;j++){
                System.out.print(j + " ");
            }System.out.println();

        }

        System.out.println();

        for(int i =1; i<=n;i++){

            for(int j=1; j<=n-i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }

        System.out.println();

        int number =1;
        for(int i =1; i<=m;i++){

            for(int j=1; j<=i;j++){
                System.out.print(number +" ");
                number++;
            }
            System.out.println();

        }

        System.out.println();

        for(int i =1; i<=5;i++){

            for(int j=1; j<=i;j++){
                int sum =i+j;

                if(sum %2 ==0){
                    System.out.print("1"); //even
                }else{
                    System.out.print("0");
                }

            }System.out.println();//programming

        }

    }
}

