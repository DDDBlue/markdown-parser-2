import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        List<String> correctList = List.of("https://something.com", "some-thing.html");
        assertEquals(MarkdownParse.getLinks(content),correctList);
    }

    @Test
    public void testFile2() throws IOException{
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        List<String> correctList = List.of("https://google.com", "some-thing.html");
        assertEquals(MarkdownParse.getLinks(content),correctList);
    }
 
    @Test
    public void testFile3() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        List<String> correctList = List.of();
        assertEquals(MarkdownParse.getLinks(content),correctList);
    }

    @Test
    public void testFile4() throws IOException{
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        List<String> correctList = List.of();
        assertEquals(MarkdownParse.getLinks(content),correctList);
    }

    @Test
    public void testFile5() throws IOException{
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        List<String> correctList = List.of("page.com");
        assertEquals(MarkdownParse.getLinks(content),correctList);
    }

    @Test
    public void testFile6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        List<String> correctList = List.of("page.com");
        assertEquals(MarkdownParse.getLinks(content),correctList);
    }

    @Test
    public void testFile7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        List<String> correctList = List.of();
        assertEquals(MarkdownParse.getLinks(content),correctList);
    }

    @Test
    public void testFile8() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        List<String> correctList = List.of();
        assertEquals(MarkdownParse.getLinks(content),correctList);
    }

    @Test
    public void testFile8Again() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        List<String> correctList = List.of();
        assertEquals(MarkdownParse.getLinks(content),correctList);
    }
}
