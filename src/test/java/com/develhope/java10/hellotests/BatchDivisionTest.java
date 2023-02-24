package com.develhope.java10.hellotests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.util.Assert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BatchDivisionTest {
    private List<String> stringList;
    private BatchDivision batchDivision;

    private File file;
    List<Double> doubles;

    @BeforeEach
    void setUp() {

        file = new File("C:\\Users\\Federico\\Desktop\\HelloTests\\src\\main\\java\\com\\develhope\\java10\\hellotests\\test.txt");
        stringList = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String strCurrentLine;
            while ((strCurrentLine = bufferedReader.readLine()) != null) {
                stringList.add(strCurrentLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        batchDivision = new BatchDivision(stringList);


    }

    @Test
    void doublesListLenght(){
        doubles=batchDivision.result();
        assertEquals(3,doubles.size());
    }

    @Test
    void resultContainsNoNull(){
        doubles=batchDivision.result();
            Assert.noNullElements(doubles,"Contains null");
    }


    @Test
    public void testNoException() {
        assertDoesNotThrow(() -> {
           doubles=batchDivision.result();
        });
    }

}