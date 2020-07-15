package misc.articleExamples.input;

import com.itextpdf.html2pdf.HtmlConverter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class NegativeInputHtml {
    public static void main(String[] args) {
        String html = "<!doctype html>\n" +
                "<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div><label>Label</label><input type=\"number\" value=\"-4\">\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";
        try {
            HtmlConverter.convertToPdf(html, new FileOutputStream("src/main/java/misc/articleExamples/out.pdf"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
