package org.eoti.osv;

import org.eoti.osv.model.Configuration;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by malachi on 9/4/16.
 */
public class MainTest
{
    private static final String FILENAME_TEST1 = "build/resources/test/test1.json";
    private static final String FILENAME_TEST2 = "build/resources/test/test2.json";

    @Test
    @DisplayName("Validate loading the configuration file")
    public void loadConfigurationTest()
    {
        Configuration config1 = Main.loadConfiguration.apply(FILENAME_TEST1);
        assertThat(config1.getWelcomeMessage(), is("Hello Test1!"));

        Configuration config2 = Main.loadConfiguration.apply(FILENAME_TEST2);
        assertThat(config2.getWelcomeMessage(), is("Hello Test2!"));
    }
}
