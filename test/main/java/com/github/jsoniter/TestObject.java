package com.github.jsoniter;

import junit.framework.TestCase;

import java.io.IOException;

public class TestObject extends TestCase {

    public void test_empty_object() throws IOException {
        Jsoniter iter = Jsoniter.parseString("{}");
        assertNull(iter.readObject());
    }

    public void test_one_field() throws IOException {
        Jsoniter iter = Jsoniter.parseString("{'hello': 'world'}".replace('\'', '"'));
        assertEquals("hello", iter.readObject().toString());
        assertEquals("world", iter.readString().toString());
        assertNull(iter.readObject());
    }
}