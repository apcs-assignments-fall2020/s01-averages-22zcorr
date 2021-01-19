public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double runSum = 0.0;
        for(int x = 0; x<mat.length; x++){
            for(int y = 0; y<mat[1].length;y++){
                runSum+=mat[x][y];
            }
        }
        return runSum/(mat.length*mat[1].length);
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        int xVal = 0;
        int yVal = 0;

        if(((mat.length/2)%2)==0){xVal=((mat.length/2))-1;}
        else{xVal=((mat.length/2));}

        if(((mat[xVal].length/2)%2)==0){yVal=((mat[xVal].length/2))-1;}
        else{yVal=(int)(mat[xVal][(mat[xVal].length/2)]);}



        if(  ((mat.length/2)%2)==0&&(mat[xVal].length/2)%2==0){
             return ( mat[xVal][yVal]+ mat[xVal+1][yVal+1]  )/2.0;

        }
        return  mat[xVal][yVal];
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        double count = 0.0;
        double TopNUM = 0.0;
        double TopCOUNT = 0.0;
        double z=0.0;
        for(int x = 0; x<mat.length; x++){
            for(int y = 0; y<mat[1].length;y++){
                z=mat[x][y];
                count=0;
                for(int a = 0; x<mat.length; x++){
                    for(int b = 0; y<mat[1].length;y++){
                    if(mat[a][b]==z){
                        count++;

                    }

                    }   
                
                }
                if(count>TopCOUNT){
                    TopCOUNT=count;
                    TopNUM=z;
                    }

            }
        }
        return TopNUM;

    }
    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
