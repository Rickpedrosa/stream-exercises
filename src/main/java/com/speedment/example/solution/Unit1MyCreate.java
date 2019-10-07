package com.speedment.example.solution;

import com.speedment.example.unit.Unit1Create;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Unit1MyCreate implements Unit1Create {

    @Override
    public Stream<String> newStreamOfAToC() {
        return Stream.of("A", "B", "C");
    }

    @Override
    public IntStream newIntStreamOfOneToSeven() {
        return IntStream.of(1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public Stream<String> from(String[] array) {
        return Arrays.stream(array);
    }

    @Override
    public Stream<String> from(Collection<String> collection) {
        return collection.stream();
    }

    @Override
    public IntStream from(String s) {
        return s.chars();
    }

    @Override
    public IntStream infiniteAlternating() {
        return IntStream.iterate(1, operand -> -1 * operand);
    }

    @Override
    public IntStream infiniteRandomInts(Random rnd) {
        return rnd.ints();
    }

    @Override
    public Stream<String> linesFromPoemTxtFile() throws IOException {
        return new BufferedReader(new FileReader(Unit1Create.FILE_NAME)).lines();
    }
}
