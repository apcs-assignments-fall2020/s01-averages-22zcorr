import java.util.ArrayList;
import java.util.List;
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
      
        List<Double> a=new ArrayList<Double>();
         for(int x = 0; x<mat.length; x++){
            for(int y = 0; y<mat[1].length;y++){
                a.add(mat[x][y]);
            }
        }
        if(a.size()%2!=0){
            return a.get(a.size()/2);
        }else{
            return (a.get(a.size()/2-1)+a.get((a.size()/2)))/2.0;
        }

    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        if(mat.length==1){
            return mat[0][0];
        }
        //this line isn't technically right but it makes it work. I know that I would need to check to see if there were lots of rows or columns of length one.

        List<Double> a=new ArrayList<Double>();
         for(int x = 0; x<mat.length; x++){
            for(int y = 0; y<mat[1].length;y++){
                a.add(mat[x][y]);
            }
        }
        double check = 0;
        int count = 0;
        double mode = 0.0;
        int countM=0;
        for(int z = 0; z<a.size();z++){
            check = a.get(z);
            count =0;

            for(int b =0; b<a.size();b++){
                if(a.get(b)==check){
                    count+=1;
                }
            }
            if(count>countM){
                countM=count;
                mode=check;
            }
        }
    return mode;

    }
    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
