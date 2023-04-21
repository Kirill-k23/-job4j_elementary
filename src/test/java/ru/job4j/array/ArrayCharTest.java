package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'L', 'L', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startWith(word, pref);
        assertThat(result).isTrue();
    }

}