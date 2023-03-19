package ru.netology.afisha_manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    @Test
    public void shouldAddNewFilm() {
        AfishaManager manager = new AfishaManager(1);

        manager.addNewFilm("Film_1");

        String[] expected = {"Film_1"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldNotAddNullFilms() {
        AfishaManager manager = new AfishaManager(0);

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddNewFilms() {
        AfishaManager manager = new AfishaManager(3);

        manager.addNewFilm("Film_1");
        manager.addNewFilm("Film_2");
        manager.addNewFilm("Film_3");

        String[] expected = {"Film_1", "Film_2", "Film_3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAddedFilmsInTheOrderTheyWereAdded() {
        AfishaManager manager = new AfishaManager();

        manager.addNewFilm("Film_1");
        manager.addNewFilm("Film_2");
        manager.addNewFilm("Film_3");

        String[] expected = {"Film_3", "Film_2", "Film_1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastAddedFilmsButNotAboveLimit() {
        AfishaManager manager = new AfishaManager();

        manager.addNewFilm("Film_1");
        manager.addNewFilm("Film_2");
        manager.addNewFilm("Film_3");
        manager.addNewFilm("Film_4");
        manager.addNewFilm("Film_5");
        manager.addNewFilm("Film_6");
        manager.addNewFilm("Film_7");
        manager.addNewFilm("Film_8");
        manager.addNewFilm("Film_9");
        manager.addNewFilm("Film_10");
        manager.addNewFilm("Film_11");

        String[] expected = {"Film_11", "Film_10", "Film_9", "Film_8", "Film_7", "Film_6", "Film_5", "Film_4", "Film_3", "Film_2"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}
