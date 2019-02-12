public class My1DArray {

    public double getTotal(double arr[]){
        double sum = 0;
        for(int i=0; i< arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public double getAverage(double arr[]){
        double sum = getTotal(arr);
        return sum / arr.length;
    }

    public double getHighestInRow(double arr[]){
        double max = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        return max;
    }
}
