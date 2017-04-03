package com.zawadzki;

public class App
{
    private static void makeSpace(int width)
    {
        for (int j = 0; j < width; ++j) {
            System.out.print("\t");
        }
    }

    public static void showInTwoColumns(String text, int charsNumber, int columnWidth) throws NullPointerException, IllegalArgumentException
    {
        if (text == null)
        {
            throw new NullPointerException("Text is empty!");
        }

        if (charsNumber <= 0)
        {
            throw new IllegalArgumentException("Number of chars is not correct!");
        }

        if (columnWidth <= 0)
        {
            throw new IllegalArgumentException("Column width is not correct");
        }

        int i = 0;
        while ( i <= text.length() - 2*charsNumber)
        {
            System.out.print(text.substring(i, i + charsNumber));
            makeSpace(columnWidth);
            System.out.println(text.substring(i + charsNumber, i + 2*charsNumber));

            i += 2*charsNumber;
        }

        if (i > text.length() - charsNumber && i < text.length())
        {
            System.out.println(text.substring(i, text.length()));
        }
        else
        {
            System.out.print(text.substring(i, i + charsNumber));
            makeSpace(columnWidth);
            System.out.println("\t" + text.substring(i + charsNumber, text.length()));
        }
    }
    public static void main( String[] args )
    {
        final String text = "Grupa CGM dostarcza rozwiązania informatyczne do 400 000 klientów z 43 krajów świata. Dostarczamy najnowocześniejsze rozwiązania " +
                "informatyczne, które usprawniają pracę placówek medycznych. Na świecie ponad 4200 pracowników CGM codziennie stawia czoła nowym wyzwaniom.";
        final int charsNumber = 200;
        final int columnWidth = 7;
        showInTwoColumns(text, charsNumber, columnWidth);

    }

    //skad mam pobierac text: baza danych, plik, user
    //czy zaproponowae przeze mnie parametry szerokosc odstepu pomiedzy kolumnami, ilosc znakow w jednej kolumnie sa wystarczajace czy mam
    //uwzglednic jeszcze jakies czynniki
    //55 min
}
