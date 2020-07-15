using iText.Html2pdf;
using System;
using System.IO;

namespace Articles
{
    class Program
    {
        static void Main(string[] args)
        {
            string html = "<!doctype html>\n" +
                "<html>\n" +
                "<head>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div><label>Label</label><input type=\"number\" value=\"-4\">\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>";

            try
            {
                HtmlConverter.ConvertToPdf(html, new FileStream("src/main/java/misc/articleExamples/out.pdf", FileMode.Create);
            }
            catch (IOException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}
