<<<<<<< HEAD
package pl.natalamichalowska.model;

import javax.mail.Store;
import javax.mail.Session;
import java.util.Properties;

public class EmailAccount {
    private String address;
    private String password;
    private Properties properties;
    private Store store;
    private Session session;

    public Session getSession() {
        return session;
    }
    public void setSession(Session session) {
        this.session = session;
    }

    public EmailAccount(String address, String password) {
        this.address = address;
        this.password = password;
        properties = new Properties();

        properties.put("incomingHost", "imap.op.pl");
        properties.put("mail.store.protocol", "imaps");

        properties.put("mail.transport.protocol", "smtps");
        properties.put("mail.smtps.host", "smtp.op.pl");
        properties.put("mail.smtps.auth", "true");
        properties.put("outgoingHost", "smtp.op.pl");

    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return address;
    }



}
=======
package pl.natalamichalowska.model;

import javax.mail.Store;
import javax.mail.Session;
import java.util.Properties;

public class EmailAccount {
    private String address;
    private String password;
    private Properties properties;
    private Store store;
    private Session session;

    public void setSession(Session session) {
        this.session = session;
    }

    public EmailAccount(String address, String password) {
        this.address = address;
        this.password = password;
        properties = new Properties();

        properties.put("incomingHost", "imap.op.pl");
        properties.put("mail.store.protocol", "imaps");

        properties.put("mail.transport.protocol", "smtps");
        properties.put("mail.smtps.host", "smtp.op.pl");
        properties.put("mail.smtps.auth", "true");
        properties.put("outgoingHost", "smtp.op.pl");

    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return address;
    }


}
>>>>>>> 7b8aa44dbf64e1ca61ffe1322b704fbce41d8ef2
