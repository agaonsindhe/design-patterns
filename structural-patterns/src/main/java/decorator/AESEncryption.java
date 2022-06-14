package decorator;

public class AESEncryption extends Encryption{

    @Override
    public String encrypt() {
        return "Encrypting using AES Encryption!";
    }
}
