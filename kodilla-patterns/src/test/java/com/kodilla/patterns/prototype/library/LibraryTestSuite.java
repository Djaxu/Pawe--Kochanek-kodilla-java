package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("title1","author1", LocalDate.of(1999,5,1));
        Book book2 = new Book("title2","author2", LocalDate.of(2000,6,1));
        Book book3 = new Book("title3","author3", LocalDate.of(1899,10,1));
        Book book4 = new Book("title4","author4", LocalDate.of(1985,11,1));
        Library booksSet = new Library("List of the books");
        booksSet.getBooks().add(book1);
        booksSet.getBooks().add(book2);
        booksSet.getBooks().add(book3);
        booksSet.getBooks().add(book4);

        //making a shallow clone of object Library
        Library clonedLibrary = null;
        try {
            clonedLibrary = booksSet.shallowCopy();
            clonedLibrary.setName("List of the books number 2");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        System.out.println(clonedLibrary);

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = booksSet.deepCopy();
            deepClonedLibrary.setName("List of the books number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        clonedLibrary.getBooks().remove(book4);
        //Then
        System.out.println(booksSet);
        Assert.assertEquals(4,booksSet.getBooks().size());
        System.out.println(clonedLibrary);
        Assert.assertEquals(3,clonedLibrary.getBooks().size());
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4,deepClonedLibrary.getBooks().size());
    }
}
