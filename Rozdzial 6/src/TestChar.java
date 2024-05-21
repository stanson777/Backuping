public class TestChar {

    public static void main(String[] args) {
        String[][] test_char = new String[3][8];

        test_char[0][0] = "A\\240b3&4\\040";
        test_char[1][0] = "\bo\u0002 0+\\t";
        test_char[2][0] = "#\\\"\\304\\\\\\344\\b\\n";

        Funkcje_na_stringach[] funkcje = {
                new CzyJestCyfa(),
                new CzyJestLitera()
        };

        for (Funkcje_na_stringach funkcja : funkcje) {
            System.out.println(funkcja.opis());
            for (String[] row : test_char) {
                char[] result;
                if (funkcja instanceof CzyJestCyfa) {
                    result = ((CzyJestCyfa) funkcja).CzyJestLiteraCyfra(row[0]);
                } else if (funkcja instanceof CzyJestLitera) {
                    result = funkcja.CzyJestLitera(row[0]);
                } else {
                    // Handle other cases if necessary
                    result = new char[0];
                }
                System.out.println(result);
            }
        }
    }

    interface Funkcje_na_stringach {

        String opis();

        char[] CzyJestCyfra(String tekst);

        char[] CzyJestLitera(String tekst);

        char[] CzyJestLiteraCyfra(String tekst);
    }

    static class CzyJestCyfa implements Funkcje_na_stringach {
        @Override
        public char[] CzyJestCyfra(String text) {

            if(text==null){
                return new char[0];
            }
            StringBuilder cyfryStringowe = new StringBuilder();
            for (char ch : text.toCharArray()) {
                if (Character.isDigit(ch)) {
                    cyfryStringowe.append(ch);
                }
            }
            return cyfryStringowe.toString().toCharArray();
        }

        @Override
        public char[] CzyJestLitera(String text) {
            return null;
        }

        @Override
        public char[] CzyJestLiteraCyfra(String text) {

            return null;
        }

        @Override
        public String opis() {
            return "Czy jest cyfra?";
        }
    }

    static class CzyJestLitera implements Funkcje_na_stringach {
        @Override
        public char[] CzyJestCyfra(String text) {
            return null;
        }

        @Override
        public char[] CzyJestLitera(String text) {
            if(text==null){
                return new char[0];
            }
            StringBuilder literyStringowe = new StringBuilder();
            for (char ch : text.toCharArray()) {
                if (Character.isLetter(ch)) {
                    literyStringowe.append(ch);
                }
            }
            return literyStringowe.toString().toCharArray();
        }

        @Override
        public char[] CzyJestLiteraCyfra(String text) {
            // Implementacja dla CzyJestLitera
            return null;
        }

        @Override
        public String opis() {
            return "Znalezione litery w tekście?";
        }
    }
}
