package com.example.Testing28;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;
import java.util.List;

import static com.example.Testing28.Sequence.seq;
import static java.util.OptionalDouble.empty;
import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SpringExtension.class)
public class SequenceTest {


    @Test
    void testSeq() throws Exception {

        List < Integer > grup1 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 0, 0);
        List < Integer > grup2 = Arrays.asList(0, 0);
        List < Integer > grup3 = Arrays.asList(1, 1, 1, 1, 1);
        List < Integer > grup4 = Arrays.asList(0, 1, 1, 1, 0, 7, 1, 1, 1, 1, 1);
        List < Integer > grup5 = Arrays.asList();




        var result = seq(grup1);
        assertThat(result).isEqualTo(7);


        var result2 = seq(grup2);
        assertThat(result2).isEqualTo(0);

        var result3 = seq(grup3);
        assertThat(result3).isEqualTo(5);

        var result4 = seq(grup4);
        assertThat(result4).isEqualTo(5);

        var result5 = seq(grup5);
        assertThat(grup5.isEmpty());



    }



}