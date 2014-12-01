package objects;

import objects.JLSElement;

public class AndGate extends JLSElement
{
	int id;
	int x;
	int y;
	int width;
	int height;
	int bits;
	int numInputs;
	String orientation;
	int delay;

	protected String printObject()
	{
		return (  "ELEMENT AndGate\n"
				+ " int id " + id + "\n"
				+ " int x " + x + "\n"
				+ " int y " + y + "\n"
				+ " int width " + width + "\n"
				+ " int height " + height + "\n"
				+ " int bits 1\n"
				+ " int numInputs 2\n"
				+ " String orientation \"right\"\n"
				+ " int delay 10\n"
				+ "END\n"
				);
	}
}