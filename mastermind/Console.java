package mastermind;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console {
///////////////////////////////////////////////// Public Methods

	public String inString() {
		String input = null;
		try {
			input = b.readLine();
		} catch (Exception e) {
			this.getOut();
		}
		return input;
	}

	public int inInt() {
		int input = 0;
		try {
			input = Integer.parseInt(this.inString());
		} catch (Exception e) {
			this.getOut();
		}
		return input;
	}

	public float inFloat() {
		float input = 0;
		try {
			input = Float.parseFloat(this.inString());
		} catch (Exception e) {
			this.getOut();
		}
		return input;
	}

	public double inDouble() {
		double input = 0.0;
		try {
			input = Double.parseDouble(this.inString());
		} catch (Exception e) {
			this.getOut();
		}
		return input;
	}

	public long inLong() {
		long input = 0;
		try {
			input = Long.parseLong(this.inString());
		} catch (Exception e) {
			this.getOut();
		}
		return input;
	}

	public byte inByte() {
		byte input = 0;
		try {
			input = Byte.parseByte(this.inString());
		} catch (Exception e) {
			this.getOut();
		}
		return input;
	}

	public short inShort() {
		short input = 0;
		try {
			input = Short.parseShort(this.inString());
		} catch (Exception e) {
			this.getOut();
		}
		return input;
	}

	public char inChar() {
		char caracter = ' ';
		String input = this.inString();
		if (input.length() > 1) {
			this.getOut();
		} else
			caracter = input.charAt(0);
		return caracter;
	}

	public boolean inBoolean() {
		boolean inputLogica = true;
		String input = this.inString();
		if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false"))
			inputLogica = Boolean.valueOf(input).booleanValue();
		else {
			this.getOut();
		}
		return inputLogica;
	}

	public void out(String output) {
		System.out.print(output);
	}

	public void out(int output) {
		System.out.print(output);
	}

	public void out(float output) {
		System.out.print(output);
	}

	public void out(double output) {
		System.out.print(output);
	}

	public void out(long output) {
		System.out.print(output);
	}

	public void out(byte output) {
		System.out.print(output);
	}

	public void out(Short output) {
		System.out.print(output);
	}

	public void out(char output) {
		System.out.print(output);
	}

	public void out(boolean output) {
		System.out.print(output);
	}

///////////////////////////////////////////////// Implementation

	private void getOut() {
		System.out.println("input/output Error");
		System.exit(0);
	}

	private static BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) {
		Console console = new Console();

		System.out.println("ENTERO");
		console.out(console.inInt());
		System.out.println();
		System.out.println("CARACTER");
		console.out(console.inChar());
		System.out.println();
		System.out.println("REAL");
		console.out(console.inFloat());
		System.out.println();
		System.out.println("BOOLEAN");
		console.out(console.inBoolean());
	}

	public char inChar(String string) {
		out(string);
		return inChar();
	}

	public String inString(String string) {
		out(string);
		return inString();
	}
}
