import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TriangleClassifierTest {
    @Test
    public void testABCIs2(){
        String expected = "Tam giác đều";
        String result = TriangleClassifier.triangleCheck(2,2,2);

        assertEquals(expected,result);
    }

}