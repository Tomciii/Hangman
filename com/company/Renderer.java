package com.company;

public class Renderer
{
    public void drawHangman(int i)
    {
        if (i == 0)
        {

        }
        else if (i == 1)
        {
            drawHangman1();
        }
        else if ( i == 2)
        {
            drawHangman2();
        }
        else if ( i == 3)
        {
            drawHangman3();
        }
        else if ( i == 4)
        {
            drawHangman4();
        }
        else if ( i == 5)
        {
            drawHangman5();
        }
        else if ( i == 6)
        {
            drawHangman6();
        }
        else if ( i >= 7)
        {
            drawHangman7();
        }
    }

    private void drawHangman7()
    {
        System.out.println
                (
                        " __________     " + "\n"   +
                                " I         I     " + "\n"   +
                                "\n"   +
                                " I         I     " +  "\n"   +
                                " I        °O°    " +  "\n"   +
                                " I       __I__    " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I      -------      " +  "\n"   +
                                " I      I     I   " +  "\n"   +
                                " I      I     I   "
                );
    }

    private void drawHangman6()
    {
        System.out.println
                (
                        " __________     " + "\n"   +
                                " I         I     " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I        °O°    " +  "\n"   +
                                " I       __I__    " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I      -------      " +  "\n"   +
                                " I      I     I   " +  "\n"   +
                                " I              "
                );
    }

    private void drawHangman5()
    {
        System.out.println
                (
                        " __________     " + "\n"   +
                                " I         I     " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I        °O°    " +  "\n"   +
                                " I        _I_    " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I        ___      " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              "
                );
    }
    private void drawHangman4()
    {
        System.out.println
                (
                        " __________     " + "\n"   +
                                " I         I     " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I         O    " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              "
                );
    }

    private void drawHangman3()
    {
        System.out.println
                (
                        " __________     " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I         I     " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              "
                );
    }

    private void drawHangman2()
    {
        System.out.println
                (
                        " __________     " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              "
                );
    }

    private void drawHangman1()
    {
        System.out.println
                (
                        " _              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              " +  "\n"   +
                                " I              "
                );
    }
}
