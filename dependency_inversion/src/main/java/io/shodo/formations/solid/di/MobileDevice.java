package io.shodo.formations.solid.di;

/**
 * Created by mrk on 4/8/14.
 */
public class MobileDevice implements Notifier {
    public void alertWeatherConditions(String weatherConditions) {
        if ("rainy".equals(weatherConditions)) {
            System.out.print("It is rainy");
        }
    }
}
