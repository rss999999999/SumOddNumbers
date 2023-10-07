import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Random;


public class RowSumOddNumbersTest {

    @Test
    public void test1() {
        Random rnd = new Random();
        for(int i=0;i<50;i++){
            int n = rnd.nextInt(500)+1;
            assertEquals((int) Math.pow(n,3), RowSumOddNumbers.rowSumOddNumbers(n));
        }
    }
}