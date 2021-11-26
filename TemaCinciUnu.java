public class TemaCinciUnu{
    public static void main (String[]args){
    int[][] myArray = new int [6][6];
    int i=1;
    int j=0;
            for (int n =0; n<myArray.length; n++){
                for (int m=0; m< myArray[n].length; m++){

                    if (n%2==0 && m%2==0){
                        myArray[n][m] = i;
                        i=i+2;
                    }    
                    
                    else {
                        myArray[n][m]= n+m;
                    }
                    
                    if (n%2!=0 && m%2!=0){
                        myArray[n][m] = j;
                        j=j+2;
                    }
                }
        }
        
        for (int[] vector:myArray){
            for (int elem:vector){
                System.out.print (elem+ " ");
            }
            System.out.println();
        }
    }
}