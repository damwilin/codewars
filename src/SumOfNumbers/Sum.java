package SumOfNumbers;

public class Sum
{
    public int GetSum(int a, int b)
    {
        if (a==b)
            return a;
        int smaller;
        int higher;
        int sum=0;
        if (a<b){
            smaller=a;
            higher=b;
        }
        else {
            smaller=b;
            higher=a;
        }
        for (int i=smaller; i<=higher; i++){
            sum+=i;
        }
        return sum;
    }
}
