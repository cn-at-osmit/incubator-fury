package io.fury.io;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.ByteBuffer;

import static org.testng.Assert.assertEquals;

public class MockOutputStreamTest {

  @Test
  public void testMockStream() throws IOException {
    try(MockOutputStream stream = new MockOutputStream();) {
      stream.write(new byte[100]);
      stream.write(new byte[100], 10, 20);
      stream.write(ByteBuffer.allocate(100), 50);
      assertEquals(stream.totalBytes(), 170);
    }
  }
}