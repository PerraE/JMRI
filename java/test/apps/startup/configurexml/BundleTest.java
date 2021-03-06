package apps.startup.configurexml;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for the Bundle class
 *
 * @author Bob Jacobsen Copyright (C) 2012
 * @author Paul Bender Copyright (C) 2016
 */
public class BundleTest {

    @Test
    public void testGoodKeysMessage() {
        Assert.assertEquals("File", Bundle.getMessage("MenuFile"));
        Assert.assertEquals("Turnout", Bundle.getMessage("BeanNameTurnout"));
    }

    @Test(expected = java.util.MissingResourceException.class)
    public void testBadKeyMessage() {
            Bundle.getMessage("FFFFFTTTTTTT");
    }

    @Test
    public void testGoodKeysMessageArg() {
        Assert.assertEquals("File", Bundle.getMessage("MenuFile", new Object[]{}));
        Assert.assertEquals("Turnout", Bundle.getMessage("BeanNameTurnout", new Object[]{}));
    }

    @Test(expected = java.util.MissingResourceException.class)
    public void testBadKeyMessageArg() {
        Bundle.getMessage("FFFFFTTTTTTT", new Object[]{});
    }

}
