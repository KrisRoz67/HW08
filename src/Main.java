import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------Task1--------------");
        System.out.println("Intersection of two sets :" + getIntersection(Set.of(1, 2, 3, 4), Set.of(5, 2, 7, 1)));
        System.out.println("---------Task2--------------");
        System.out.println("Numbers of first set , that are not in second set :"
                + getDifference(Set.of(1, 2, 3, 4), Set.of(5, 2, 7, 1)));
        System.out.println("---------Task3--------------");
        System.out.println(countWords("Hello this is a string that contains Hello and other words"));
        System.out.println("---------Task5--------------");
        List<Book> books = List.of(new Book("abc", "a", 123, Genre.HORROR),
                new Book("abc2", "a", 1777, Genre.HORROR),
                new Book("123", "b", 1230, Genre.COMEDY),
                new Book("321", "b", 1243, Genre.COMEDY),
                new Book("title", "c", 1923, Genre.HORROR),
                new Book("title 2", "d", 2023, Genre.HORROR));

        Map <String,List<Book>> mapOfBooks = getMapOfBooks(books);
        for (Map.Entry<String,List<Book>> mp: mapOfBooks.entrySet()){
            System.out.println(mp);
        }

    }

    /** Task1**/
    public static Set<Integer> getIntersection(Set<Integer> x, Set<Integer> y) {
        Set<Integer> intersection = new HashSet<>();
        for (int i : x) {
            if (y.contains(i)) {
                intersection.add(i);
            }
        }

        return intersection;
    }

    /**
     * Task2
     **/
    public static Set<Integer> getDifference(Set<Integer> x, Set<Integer> y) {
        Set<Integer> difference = new HashSet<>();
        for (int i : x) {
            if (!y.contains(i)) {
                difference.add(i);
            }
        }

        return difference;
    }

    /**
     * Task3
     **/
    public static Map<String, Integer> countWords(String str) {
        Map<String, Integer> countedWords = new HashMap<>();
        List<String> words = new ArrayList<>();
        String s = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            String valueOf = String.valueOf(str.charAt(i));
            s = s + valueOf;
            if (valueOf.isBlank() || i == length - 1) {
                words.add(s);
                s = "";
            }
        }
        for (String word : words) {
            if (countedWords.containsKey(word)) {
                int counter = countedWords.get(word);
                counter++;
                countedWords.replace(word, counter);
            } else {
                countedWords.put(word, 1);
            }

        }
        return countedWords;
    }

    /**Task5**/
    public static Map <String,List<Book>> getMapOfBooks (List<Book> books){
    Map <String ,List<Book>> result = new HashMap<>();
    for (Book book : books){

        String author = book.getAuthor();
        if(!result.containsKey(author)){
            List<Book> authorsBook = new ArrayList<>();
            authorsBook.add(book);
            result.put(author,authorsBook);
        }else {
            result.get(author).add(book);

        }
    }

    return result;
    }

}