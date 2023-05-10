
import org.junit.Assert;
import org.junit.Test;

public class HexToOctTest {
    @Test
    public void hex2decimalTest() {
        Assert.assertEquals(255, HexToOct.hex2decimal("FF"));
        Assert.assertEquals(512, HexToOct.hex2decimal("200"));
        Assert.assertEquals(4096, HexToOct.hex2decimal("1000"));
    }

    @Test
    public void decimal2octalTest() {
        Assert.assertEquals(77, HexToOct.decimal2octal(63));
        Assert.assertEquals(746, HexToOct.decimal2octal(398));
        Assert.assertEquals(1401, HexToOct.decimal2octal(769));
    }
}