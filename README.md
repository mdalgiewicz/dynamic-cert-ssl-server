# Przykład serwera SSL z wykorzystaniem REST i SpringBoot

### Frameworki i biblioteki
* JDK 8
* SpringBoot v.1.5.2
* Maven
* Lombok

### O projekcie
* Prosta implementacja serwera wykorzystującego komunikację HTTPS.
* Keystore/Truststore oparty o providera typu JSK.
* Truststore zawiera kilka certyfikatów wykorzystywanych przez [klienta](https://github.com/dalgim/dynamic-cert-ssl-client) usługi (Klient zaimplementowany z założeniem dynamicznego wybierania certyfikatu połącznie SSL).

#### Inicjalizacja Keystore oraz Truststore - krok po kroku

keytool -genkeypair -alias serverkey -keyalg RSA -keypass password -keystore server-keystore.jks -storepass password
keytool -exportcert -alias serverkey -file server-public.cer -keystore server-keystore.jks -storepass password

cer1
keytool -genkeypair -alias clientkey1 -keyalg RSA -keypass password -keystore client-keystore.jks -storepass password
keytool -exportcert -alias clientkey1 -file client-public1.cer -keystore client-keystore.jks -storepass password
keytool -importcert -keystore server-truststore.jks -alias clientcert1 -file client-public1.cer -storepass password -noprompt

cer2
keytool -genkeypair -alias clientkey2 -keyalg RSA -keypass password -keystore client-keystore.jks -storepass password
keytool -exportcert -alias clientkey2 -file client-public2.cer -keystore client-keystore.jks -storepass password
keytool -importcert -keystore server-truststore.jks -alias clientcert2 -file client-public2.cer -storepass password -noprompt

cer3
keytool -genkeypair -alias clientkey3 -keyalg RSA -keypass password -keystore client-keystore.jks -storepass password
keytool -exportcert -alias clientkey3 -file client-public3.cer -keystore client-keystore.jks -storepass password
keytool -importcert -keystore server-truststore.jks -alias clientcert3 -file client-public3.cer -storepass password -noprompt
