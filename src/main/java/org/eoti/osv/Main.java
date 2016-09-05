package org.eoti.osv;

import com.google.gson.Gson;
import org.eoti.osv.model.Configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by malachi on 9/4/16.
 */
public class Main
{
    public static void main(String ... args) throws IOException {
        /**
         * Simple example to validate JDK8 streams are working in OSv.
         */
        Stream.of(args)
            .filter(Objects::nonNull)
            .limit(1)
            .map(loadConfiguration)
            .filter(Objects::nonNull)
            .map(Configuration::getWelcomeMessage)
            .forEach(System.out::println);
    }

    /**
     * Store the configuration in src/main/resources/external/*.json
     */
    public static Function<String,Configuration> loadConfiguration = filename -> {
        try(BufferedReader file = new BufferedReader(new FileReader(filename)))
        {
            return new Gson().fromJson(file, Configuration.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    };
}
