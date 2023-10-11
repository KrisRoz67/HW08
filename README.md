## Задание 1
Напишите метод, который принимает два множества и находит их пересечение. Метод возвращает новое множество с  элементами, которые присутствуют в обоих множествах.
Пример
Set<Integer> x = Set.of(1, 2, 3, 4)
Set<Integer> y = Set.of(5, 2, 7, 1)
intersection(x, y) -> (2, 1)
## Задание 2
Напишите метод, которая принимает два множества и находит разницу между ними. Метод возвращает новое множество с элементами, которые присутствуют в первом множестве, но не во втором.
Пример
Set<Integer> x = Set.of(1, 2, 3, 4)
Set<Integer> y = Set.of(5, 2, 7, 1)
difference(x, y) -> (3, 4)
## Задание 3
Напишите метод, который принимает строку и считает, сколько раз встречается каждое слово в этой строке. Метод возвращает Map, где ключом является слово, а значением то, сколько раз оно встретилось
Пример
countWords(“Hello this is a string that contains Hello and other words”) -> Hello:2 this:1, is:1 etc
## Задание 4
Создайте новый класс Book.
У книги должно быть:
Название
Автор
Год выпуска
Жанр (enum)
Создайте все геттеры и сеттеры (валидация не обязательна, но можете), а также конструктор, который принимает все аргументы.
## Задание 5
Напишите метод, который принимает список из книг и группирует их по автору. Метод возвращает Map, где ключом является имя автора, а значением список из книг, который этот автор написал.
Пример
List<Book> books = List.of(new Book("abc", "a", 123, Book.Genre.HORROR),
new Book("abc2", "a", 1777, Book.Genre.HORROR),
new Book("123", "b", 1230, Book.Genre.COMEDY),
new Book("321", "b", 1243, Book.Genre.COMEDY),
new Book("title", "c", 1923, Book.Genre.HORROR),
new Book("title 2", "d", 2023, Book.Genre.HORROR));
groupBooksByAuthor(books) -> {a=[Book{title='abc', author='a', releaseYear=123, genre=HORROR}, Book{title='abc2', author='a', releaseYear=1777, genre=HORROR}], b=[Book{title='123', author='b', releaseYear=1230, genre=COMEDY}, Book{title='321', author='b', releaseYear=1243, genre=COMEDY}], c=[Book{title='title', author='c', releaseYear=1923, genre=HORROR}], d=[Book{title='title 2', author='d', releaseYear=2023, genre=HORROR}]}


