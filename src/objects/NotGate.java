package objects;

import objects.JLSElement;

public class NotGate extends JLSElement
{
	//variables assumed
	
	
	protected String printObject()
	{
		return (  "ELEMENT NotGate\n"
				+ " int id " + id + "\n"
				+ " int x " + x + "\n"
				+ " int y " + y + "\n"
				+ " int width " + width + "\n"
				+ " int height " + height + "\n"
				+ " int bits 1\n"
				+ " int numInputs 2\n"
				+ " String orientation \"right\"\n"
				+ " int delay 5\n"
				+ "END\n"
				);
	}

}