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
        while (sc.hasNextInt()) 
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
        double m = 1.0;
        double b = 0.0;

        int step = 1;
        Gradient grad = new Gradient(1000, 1000);

        System.out.println("---- Begin Gradient Descent training ----");
    
        while (Math.abs(sumGradM) > epsilon || Math.abs(sumGradB) > epsilon)
        {
            double sumGradM = 0;
            double sumGradB = 0;

            for (int i = 0; i < dataList.size(); i++)
            {
                int xi = dataList.get(i).time;
                int yi = dataList.get(i).trafficVolume;
                double linReg = (m * xi) + b;
            
                sumGradM += 2 * xi * (linReg - yi);
                sumGradB += 2 * (linReg - yi);
            }
            
            grad = new Gradient(sumGradM, sumGradB);
            m = m - (eta * sumGradM);
            b = b - (eta * sumGradB);

            System.out.printf("Step %3d | m: %8.4f | b: %8.4f | ||∇f||: %8.2f\n", step++, m, b, grad.getMagnitude());
        } 

        System.out.println("\n---- final step reached (||∇f|| <= epsilon) ----");
        System.out.printf("Traffic = (%.4f * Time) + (%.4f)\n", m, b);
    }

}
