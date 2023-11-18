import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void test1() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MovieManager manager = new MovieManager();

        manager.addmovie("Film 1");

        String[] expected = {"Film 1"};

        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        MovieManager manager = new MovieManager();

        manager.addmovie("Film 1");
        manager.addmovie("Film 2");
        manager.addmovie("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};

        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        MovieManager manager = new MovieManager();

        manager.addmovie("Film 1");
        manager.addmovie("Film 2");
        manager.addmovie("Film 3");
        manager.addmovie("Film 4");
        manager.addmovie("Film 5");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};

        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        MovieManager manager = new MovieManager();

        manager.addmovie("Film 1");
        manager.addmovie("Film 2");
        manager.addmovie("Film 3");

        String[] expected = {"Film 3", "Film 2", "Film 1"};

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        MovieManager manager = new MovieManager(8);


        manager.addmovie("Film 1");
        manager.addmovie("Film 2");
        manager.addmovie("Film 3");
        manager.addmovie("Film 4");
        manager.addmovie("Film 5");
        manager.addmovie("Film 6");
        manager.addmovie("Film 7");
        manager.addmovie("Film 8");

        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8"};

        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test8() {
        MovieManager manager = new MovieManager(9);

        manager.addmovie("Film 1");
        manager.addmovie("Film 2");
        manager.addmovie("Film 3");
        manager.addmovie("Film 4");
        manager.addmovie("Film 5");
        manager.addmovie("Film 6");
        manager.addmovie("Film 7");
        manager.addmovie("Film 8");
        manager.addmovie("Film 9");

        String[] expected = {"Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test9() {
        MovieManager manager = new MovieManager(0);

        String[] expected = {};

        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test10() {
        MovieManager manager = new MovieManager(0);

        String[] expected = {};

        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}
