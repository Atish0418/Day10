
    class AlphabetConverter {
        public void printLowercaseAlphabet() {
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.println((char)(ch | ' ')); // uses OR logic and there ASCII value of '' is 32
            }
        }
    }
    
    public class Coverter {
        public static void main(String[] args) {
            AlphabetConverter converter = new AlphabetConverter();
            converter.printLowercaseAlphabet();
        }
    }

