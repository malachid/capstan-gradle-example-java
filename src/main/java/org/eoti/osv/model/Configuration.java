package org.eoti.osv.model;

/**
 * Created by malachi on 9/4/16.
 */
public class Configuration
{
    private String welcomeMsg;

    public Configuration() {
        // no-arg constructor required by GSON
    }

    public String getWelcomeMessage() {
        return welcomeMsg;
    }
}
