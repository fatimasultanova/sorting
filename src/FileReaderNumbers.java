import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderNumbers {
    public static int [] arr;
    public static int[] readFile() {

        File file = new File("numbers/array");
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            int size = 0;
            while (bufferedReader.readLine() != null){
                size++;
            }
            arr = new int[size];

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
        return arr;
    }


}
