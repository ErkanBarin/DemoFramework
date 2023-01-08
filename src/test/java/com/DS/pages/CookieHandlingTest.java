package com.DS.pages;

import com.DS.utilities.ConfigurationReader;
import com.DS.utilities.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class CookieHandlingTest {
    @Test
    public void cookieHandling(){
        Driver.get().get(ConfigurationReader.getProperty("url"));
        Set<Cookie>cookies = Driver.get().manage().getCookies();

        System.out.println(cookies.size());
        Driver.get().manage().deleteAllCookies();
        cookies= Driver.get().manage().getCookies();
        System.out.println(cookies.size());
        Driver.closeDriver();

    }
}
