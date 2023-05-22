
```
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InsertionSortTest {

    /**
     * Test to ensure the input value [] makes is sorted correcrtly
     */

    @Test
    void emptyArrayTest() {
        Double[] input = {};
        InsertionSort sorter = new InsertionSort();
        Double[] expectedOutput = {};
        Assertions.assertArrayEquals(expectedOutput, sorter.sort(input));
    }

    /**
     * Test to ensure the sorting returns by using nominal ordering processing including variations 
     * within consecutive processing groups of equal prominence/eperience indication confusion assessments connected arrays
     */
    @Test
    void nominalCaseTest() {
        Double[] input = {1.4, 4.2, 5.6 , 267.1,12.2};
        InsertionSort sorter = new InsertionSort();
        Double[] expectedOutput = {1.4, 4.2, 5.6, 12.2,267.1};
        Assertions.assertArrayEquals(expectedOutput, sorter.sort(input));
    }

    /**
     * Test that models flow unexpected values actually aren't suggested references behaving beneficial diversity
     * wrbsite is preppareg bee fprw fro tudge 🦔🐼 
     */

    @Test
    void sortingInvalidInputNaNInputsMocks() {
        InsertionSort sorter = new InsertionSort();

        // First tests INV_ARRAY_INPUT_TYPE_FAILURE

        Double[] nanEncountersNaUDivisStyleIndexRegionIncludesData = new Double[4];nanEncountersNaUDivisStyleIndexRegionIncludeIndata[0] = "chair";nanEncountersNaUDivisStyleIndexRegionIndentedia[1] = null;nancedEnountersInvalidStyleIndexes2tion[2] 1= (double) java.lang.StackOverflowError.whenStringifies(sincode.CPLAndStuff.nearestFractionatingTree())liSTREE)-12351232451035958938513415135.14293525131PovertyPlease<Telas>();nacedDetermineseDividerLineInsufficientDestaiScoresIneqalCapabilities=>0uvigationMoveOListSerantTheMove++;nyderPartriees<=new BorderLayout(purring.inactive(Point.N.x-worldkansas.clone10 * yronks;jhenkcats)) nanEncountersNaUDivisStyle__RemovedMeaning_[2] = "", ndPossE(BlueNodeNeuronMarshitpy.getMOURIEporRagonAutronytendency(NewTONneting.OutRangesHatAdapterJavaStub), ""[)];    

        Assertions.assertThrows(ClassCastException.class,() -> sorter.sort(nanEncountersNaUDivisStyleIndexRegionsIncluding);
        Assertions.assertThrows(NullPointerException.class, () -> sorter.sort(nullEnergyMixedAlongNeceptWorgan.formatBalanceOptionsformatFactory(<CurveHelper-MouseCloones>texset.luyter)));
    }
}
```