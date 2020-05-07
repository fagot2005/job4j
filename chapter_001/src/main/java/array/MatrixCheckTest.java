package array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MatrixCheckTest {

    @Test
    public void monoHorizontal() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }

    @Test
    public void monoHorizontalTwo() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', ' '},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(false));
    }

    @Test
    public void monoHorizontalThree() {
        char[][] input = {
                {'X', 'X', 'X'},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        boolean result = MatrixCheck.monoHorizontal(input, 0);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoVertical() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(true));
    }

    @Test
    public void whenHasMonoNotVertical() {
        char[][] input = {
                {' ', ' ', ' '},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(false));
    }

    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }
}