package homework_03_textAnalyzer;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class TextAnalisisHomework {
    public static void main(String[] args) {

        File file = new File("istiklal.txt");

        String text = TextFileReader.getTextAsString(file);

        int lineCount = TextAnalyzer.getLineCount(text);
        System.out.println("lineCount = " + lineCount);

        int wordCount = TextAnalyzer.getWordCount(text);
        System.out.println("wordCount = " + wordCount);

        int characterCount = TextAnalyzer.getCharacterCount(text);
        System.out.println("characterCount = " + characterCount);

        Map<String,Integer> wordFrequency = TextAnalyzer.getWordsWithFrequency(text);
        for (int i = 0; i < 6; i++) {
            String word = wordFrequency.keySet().toArray()[i].toString();
            Integer count = (Integer)wordFrequency.values().toArray()[i];
            System.out.printf("(%10s) kelimesi %d kez geçmektedir",word,count);
            System.out.println();
        }



    }
}
////////////////////////////////////////// TEXT FILE READER CLASS //////////////////////////////////////////////////////
class TextFileReader {

    /**
     * Prevents to contruct an object from this class.
     */
    private TextFileReader(){
    }

    public static String getTextAsString(File file) {
        String text = "";
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line=bufferedReader.readLine())!=null){
                text += line + "\n";
            }
        } catch (Exception e) {
            System.out.println(file.toString() + " file doesn't exist!");
            return null;
        }
        return text;
    }
}
/////////////////////////////////////////// TEXT ANALYZER CLASS ////////////////////////////////////////////////////////
class TextAnalyzer {

    private TextAnalyzer(){
    }

    /**
     * Returns word count of a String variable
     */
    public static int getWordCount(String string) {
        return removeNonAlphabeticCharacters(string).split(" ").length;
    }

    /**
     * Returns line count of a String variable
     */
    public static int getLineCount(String string) {
        return string.split("\n").length;
    }

    /**
     * Returns character count of a String variable
     *<p>White Spaces are not included.
     */
    public static int getCharacterCount(String string) {
        return makeOneLineString(string).replace(" ","").length();
    }

    public static Map<String,Integer> getWordsWithFrequency(String string) {
        String [] words = removeNonAlphabeticCharacters(string).toLowerCase().split(" ");
        Map<String,Integer> hashMap = new LinkedHashMap<>();
        Map<String,Integer> sortedMap = new LinkedHashMap<>();

        for (String s : words) {
            if(!hashMap.containsKey(s)) {
                hashMap.put(s,1);
            } else {
                hashMap.replace(s,hashMap.get(s)+1);
            }
        }

        // bu kısmı https://howtodoinjava.com/java/sort/java-sort-map-by-values/ adresinden arakladım.
        hashMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        return sortedMap;
    }

    private static String makeOneLineString(String string) {
        return string.replace("\n"," ").replace("\r"," ").replace("  "," ").trim();
    }

    private static String removeNonAlphabeticCharacters(String string) {
        char[] chrString = string.toCharArray();
        for (int i = 0; i < chrString.length; i++) {
            if(!Character.isAlphabetic(chrString[i]) && chrString[i]!='\'') {
                chrString[i]=' ';
            }
        }
        return String.valueOf(chrString).replace("   "," ").replace("  "," ").trim();
    }
}

