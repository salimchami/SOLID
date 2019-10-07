package io.shodo.formations.solid.di;

/**
 * Created by mrk on 4/8/14.
 */
public class EmailClient implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if ("sunny".equals(weatherConditions)) {
            System.out.print("It is sunny");
        }
    }
}
