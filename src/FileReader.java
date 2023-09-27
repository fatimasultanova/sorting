import java.io.BufferedReader;
import java.io.File;

public class FileReaderNumbers {
    public static int [] numbers;
    public static void readFile() {

        File file = new File("numbers/array");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            int size = 0;
            while (bufferedReader.readLine() != null){
                size++;
            }

            int []arr = new int[size];


            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            int index = 0;

            while ((line = bufferedReader.readLine())!=null){
                int num = Integer.parseInt(line);
                arr[index] = num;
                index++;
            }
            bufferedReader.close();


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
