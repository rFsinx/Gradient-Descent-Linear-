import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GradientDescent
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<DataPoint> dataList = new ArrayList<>();
        Scanner sc = new Scanner(new File("10points.txt"));
        while(sc.hasNextInt())
        {
            int time = sc.nextInt();
            int trafficVolume = sc.nextInt();
            dataList.add(new DataPoint(time, trafficVolume));
        }
        sc.close();

        runGradientDescentSteps(dataList);
    }

    public static void runGradientDescentSteps(ArrayList<DataPoint> dataList) 
    {
        double eta = 0.0003;
        double epsilon = 50;
        double a = 1.0;
        double s = 0.0;
    
        double sumGradS;
        double sumGradA;
        int step = 1;

        System.out.println("---- Begin Gradient Descent training (do-while loop) ----");
    
        do 
        {
            sumGradS = 0;
            sumGradA = 0;

            for (int i = 0; i < dataList.size(); i++) 
            {
                int xi = dataList.get(i).time;
                int yi = dataList.get(i).trafficVolume;
                double pred = (a * xi) + s;
            
                sumGradS += 2 * (pred - yi);
                sumGradA += 2 * xi * (pred - yi);
            }

            s = s - (eta * sumGradS);
            a = a - (eta * sumGradA);

            System.out.printf("Step %3d | a: %8.4f | s: %8.4f\n", step++, a, s);


        } 
        while (Math.abs(sumGradS) > epsilon || Math.abs(sumGradA) > epsilon);
        {
            System.out.println("\n---- final step reached ----");
            System.out.printf("Traffic = (%.4f * Time) + (%.4f)\n", a, s);
        }
    }

}