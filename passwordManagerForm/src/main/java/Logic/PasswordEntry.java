package passwordManagerForm.Logic;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class PasswordEntry{
    private String id;
    private String title;
    private String username;
    private String encryptedPassword;
    private String url;
    private String notes;
    private final EncryptionService encryptionService;

    public PasswordEntry(String id, String title, String username, String password, String url, String notes, EncryptionService encryptionService) throws Exception {
        this.id = id;
        this.title = title;
        this.username = username;
        this.url = url;
        this.notes = notes;
        this.encryptionService = encryptionService;
        // Encripta la contraseña al crear la entrada
        this.encryptedPassword = this.encryptionService.encrypt(password);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String decryptPassword() throws Exception {
        return encryptionService.decrypt(this.encryptedPassword);
    }

}
