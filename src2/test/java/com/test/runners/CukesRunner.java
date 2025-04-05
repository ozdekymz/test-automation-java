package com.test.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // Cucumber ile testleri çalıştırmak için bu annotation gerekli
@CucumberOptions(
        features = "src/test/resources/features",  // Özellik dosyalarının bulunduğu klasör
        glue = "com/test/stepDefinitions",                   // Step Definitions'ların bulunduğu paket
        monochrome = true,                          // Konsolda daha okunabilir çıktılar
        plugin = {
                "pretty",                               // Konsolda daha detaylı çıktı verir
                "html:target/cucumber-reports.html",    // HTML raporunu oluşturur
                "json:target/cucumber-reports.json",    // JSON raporunu oluşturur

        },
        tags = "@login",
        dryRun = false //snippet oluştur
)
public class CukesRunner {
    // Bu sınıfın içinde herhangi bir metod gerekmez,
    // sadece Cucumber'ı çalıştırmak için JUnit ile bu sınıfı kullanıyoruz.
}
