package by.training.homework6.comparator;


import by.training.homework6.model.entity.Book;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
