package decorator;

public class DESAESEncryption extends Encryption{

    Encryption encryption;

    public DESAESEncryption(Encryption encryption){
        this.encryption = encryption;
    }

    @Override
    public String encrypt() {
        return "Encrypting with DES | "+encryption.encrypt();
    }
}
