package ru.mirea.kicha0819.pr10;

import ru.mirea.kicha0819.pr10.Complex;
import ru.mirea.kicha0819.pr10.ComplexAbstractFactory;

public class ConcreteFactory implements ComplexAbstractFactory
{
    public Complex createComplex()
    {
        return new Complex();
    }

    public Complex CreateComplex(int real, int image)
    {
        return new Complex(real,image);
    }
}
