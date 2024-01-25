import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TriangleClassifierTest {
    @Test
    public void testABCIs2(){
        String expected = "Tam giác đều";
        String result = TriangleClassifier.triangleCheck(2,2,2);

        assertEquals(expected,result);
    }
    @Test
    public void testAIs2BIs2CIs3(){
        String expected = "Tam giác cân";
        String result = TriangleClassifier.triangleCheck(2,2,3);

        assertEquals(expected,result);
    }
    @Test
    public void testAIs3BIs4CIs5(){
        String expected = "Tam giác thường";
        String result = TriangleClassifier.triangleCheck(3,4,5);

        assertEquals(expected,result);
    }
    @Test
    public void testAIs8BIs2CIs3(){
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.triangleCheck(8,2,3);

        assertEquals(expected,result);
    }
    @Test
    public void testAIsNegative1BIs2CIs1(){
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.triangleCheck(-1,2,1);

        assertEquals(expected,result);
    }

}
