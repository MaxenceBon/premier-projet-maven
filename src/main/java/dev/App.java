package dev;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String asciiArtString = FigletFont.convertOneLine("App");
    	System.out.println(asciiArtString);
    }
}
