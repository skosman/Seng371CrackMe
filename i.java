import java.io.*;

public class I {

  static String[] intern;
  static int[] read;
  static byte[] getResourceAsStream;

  static {
    I.intern = new String[0x100];
    I.read = new int[0x100];

    try {
      final InputStream resourceAsStream = new I().getClass().getResourceAsStream(
        new StringBuffer().append('I').append('.').append('g').append('i').append('f').toString()
      );

      if (resourceAsStream != null) {
        int i = resourceAsStream.read() << 16 | resourceAsStream.read() << 8 | resourceAsStream.read();
        I.getResourceAsStream = new byte[i];
        int j = 0;

        final byte b = (byte)i;
        final byte[] getResourceAsStream = I.getResourceAsStream;

        while(i != 0) {
          final int read = resourceAsStream.read(getResourceAsStream, j, i);
          if (read == -1) {
            break;
          }
          i -= read;

          while(j < read + j) {
            final byte[] array = getResourceAsStream;
            final int n = j;
            array[n] ^= b;
            ++j;
          }
        }
        resourceAsStream.close();
      }
    } catch (Exception e) {}
  }

  public static final synchronized String I(int n) {
    final int n2 = n & 0xFF;
    
    if (I.read[n2] != n) {
      if ((I.read[n2] = n) < 0) {
        n = n & 0xFFFF;
      }
      I.intern[n2] = new String(I.getResourceAsStream, n, I.getResourceAsStream[n - 1] & 0xFF).intern();
    }
    return I.intern[n2];
  }
}
