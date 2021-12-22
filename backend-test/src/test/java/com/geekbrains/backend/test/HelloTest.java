package com.geekbrains.backend.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты функциональности класса Hello")
// extends FunctionalTest наследуется от абстрактного класса FunctionalTest
class HelloTest extends FunctionalTest{

 /*  Для урока 3

    static Hello hello;

    // сгенерили BeforeClassMethod метод ПередВсем
    // это то, что будет создано перед тем, как каждый тест будет загружаться
    @BeforeAll
    static void beforeAll() {
        hello = new Hello();
    }

    // сгенерили SetUp метод ПередКаждым
    @BeforeEach
    void setUp() {

    }



    public static Stream<Arguments> paramsForSum() {    // параметры для testFooWithParams
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(5,5,10),
                Arguments.of(-1,1,0)
        );
    }

    // value check  проверка значений
    @Test
    void testFoo() {
        //Hello hello = new Hello();    // это уже генерируется в SetUp методе BeforeAll
        assertEquals(2, hello.sum(1,1));    // assert - утверждать
    }

    //exception check   проверка исключений
    @Test
    @DisplayName("Тест классическое деление без ошибок")
    void testDivideCommonCase() {
        assertDoesNotThrow(() -> {              // стало с лямбда-выражением; assert - утверждать
                hello.divide(5,2);
        });

        *//* assertDoesNotThrow(new Executable() {       // было
            @Override
            public void execute() throws Throwable {
                hello.divide(5,2);
            }
        }); *//*
    }
    @Test
    @DisplayName("Тест на ошибку при делении на 0")
    void testDividedByZero() {
        // assert - утверждать
        assertThrows(
                ArithmeticException.class,      //арифметическое исключение
                () -> hello.divide(1,0)
        );
    }



    @ParameterizedTest(name = "Тест {index}: {0} + {1} = {2}")  // тест с параметрами
    @MethodSource("paramsForSum")
    @DisplayName("Тест суммы двух чисел")
    void testFooWithParams(int a, int b, int expected) {
        //Hello hello = new Hello();    // это уже генерируется в SetUp методе BeforeAll
        assertEquals(expected, hello.sum(a, b));
    }

    @Test
    @DisplayName("Тест зачитывания ресурса")
    void testWithResource() throws IOException {
        String resource = getStringResource("data.json");
        System.out.println(resource);
        assertTrue(!resource.isEmpty());        // ресурс не пустой
    }*/
}