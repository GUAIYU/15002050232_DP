package week2.validator_ex;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AuthenticatorFactory {

    private static Properties sak = new Properties();
    static {
        try {
            sak.load(new FileInputStream("src/week2/validator_ex/auth.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Authenticator createAuthenticator() {
        KeyValueKeeper keeper = createKeyValueKeeper();
        Encrypter encrypter = createEncrypter();
        return new Authenticator(keeper, encrypter);
    }

    private static KeyValueKeeper createKeyValueKeeper() {
        KeyValueKeeper keeper = null;
        try {
            keeper = (KeyValueKeeper) Class.forName( sak.getProperty("KeyValueKeeper") ).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return keeper;
    }

    private static Encrypter createEncrypter() {
        Encrypter encrypter = null;
        try {
            encrypter = (Encrypter) Class.forName( sak.getProperty("Encrypter") ).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return encrypter;

    }
}
