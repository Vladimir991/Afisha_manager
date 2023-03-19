package ru.netology.afisha_manager;

public class AfishaManager {
    private int limit;
    private String[] films = new String[0];


    public AfishaManager() {
        this.limit = 10;
    }

    public AfishaManager(int limit) {
        this.limit = limit;
    }

    public void addNewFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLimit;
        if (films.length < limit) {
            resultLimit = films.length;
        } else {
            resultLimit = limit;
        }
        String[] result = new String[resultLimit];
        for (int i = 0; i < result.length; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

}
