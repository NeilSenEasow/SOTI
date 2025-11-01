package Day16;

public class School{

    public static int getAverage(int[] marks){
    
    int n = marks.length; //length of the marks array
    int sum=0;
    int avg=0;
    for(int i=0 ; i<n ; i++)  {
        sum+=marks[i];
    }
    
    avg=sum/(marks.length);

        return avg;
    }
}

class Main{
    public static void main(String[] args) {
        School mySchool = new School();
    }
}