// 12. Text Analysis: Write a program to process a paragraph of text and perform the following
// operations:
// 1. Count the number of words.
// 2. Find and replace a specific word.
// 3. Extract the first sentence.
// 4. Convert the text to uppercase and lowercase.
public class q12{
     public static void main(String args[]){
          String para="Hello world. This is a sample paragraph for text analysis. It contains multiple sentences.";
          // 1. Count the number of words
          String[] words = para.split(" ");
          int count = words.length;
          System.out.println("Number of words: " + count);
          // 2. Find and replace a specific word
          String modify=para.replace("sample", "example");
          System.out.println("Modified Paragraph: " + modify);
          // 3. Extract the first sentence
          int index = para.indexOf(".");
          String firstSentence = para.substring(0, index+1);
          System.out.println("First Sentence: " + firstSentence);
          // 4. Convert the text to uppercase and lowercase
          String upperCase = para.toUpperCase();
          String lowerCase = para.toLowerCase();
          System.out.println("Uppercase: " + upperCase);
          System.out.println("Lowercase: " + lowerCase);
     }
}