package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }
    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
	@Override
	public Temperature toCelsius() {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public Temperature toFahrenheit() {
		float value = ((this.getValue() *9)/5) + 32;
		return new Fahrenheit(value);
	}
}
