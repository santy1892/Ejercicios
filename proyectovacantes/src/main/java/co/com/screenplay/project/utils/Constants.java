package co.com.screenplay.project.utils;

import net.serenitybdd.core.SerenitySystemProperties;
import net.thucydides.core.ThucydidesSystemProperty;

public class Constants {

    private Constants() {
    }

    public static final String BASE_URL = SerenitySystemProperties.getProperties().getValue(ThucydidesSystemProperty.WEBDRIVER_BASE_URL, "environments.default.webdriver.base.url");
    public static final int TIME_SHORT=3;
    public static final String TITLE ="OrangeHRM";
}
