//Caesar Cipher Greek
public class R_3_3 {

        protected char[] encoder = new char[24];
        protected char[] decoder = new char[24];

        public R_3_3 (int rotation) {
            for (int k = 0; k < 24; k++) {
                encoder[k] = (char) ('α' + (k + rotation) % 24);
                decoder[k] = (char) ('α' + (k - rotation + 24) % 24);
            }
        }

        public String encrypt(String message) {
            return transform(message, encoder);
        }

        public String decrypt(String secret) {
            return transform(secret, decoder);
        }

        private String transform(String original, char[] code) {
            char[] msg = original.toCharArray();
            for (int k = 0; k < msg.length; k++) {
                if (Character.isLetter(msg[k])) {
                    int j = msg[k] - 'α';
                    msg[k] = code[j];
                }
            }
            return new String(msg);
        }

        public static void main(String[] args) {
            R_3_3 cipher = new R_3_3(3);
            System.out.println("Encryption code: " + new String(cipher.encoder));
            System.out.println("Decryption code: " + new String(cipher.decoder));
            String message = "Γεια σου, Κόσμε!";
            String coded = cipher.encrypt(message);
            System.out.println("Secret: " + coded);
            String answer = cipher.decrypt(coded);
            System.out.println("Message: " + answer);
        }
    }


