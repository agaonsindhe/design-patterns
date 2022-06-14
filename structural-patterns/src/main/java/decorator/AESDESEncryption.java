package decorator;

public class AESDESEncryption extends EncryptionDecorator{

    Encryption encryption;

    public AESDESEncryption(Encryption encrypt){
        this.encryption = encrypt;
    }

    @Override
    public String encrypt() {
        return "Encrypting with AES | "+ encryption.encrypt();
    }
}
