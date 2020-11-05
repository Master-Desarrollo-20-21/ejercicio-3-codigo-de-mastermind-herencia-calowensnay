package mastermind;

import java.util.Arrays;

public abstract class Combination {
	Color[] sequence = new Color[6];
	
	
	public boolean containColor(Color color) {
		for (int i = 0;i<6;i++) {
			if (sequence[i]!=null && sequence[i].equals(color)) {
				return true;
			}
		}
		return false;
	}
	
	public Color getColor (int position) {
		Color color = null;
		switch (position){
			case 0:
				color = Color.R;	
				break;
			case 1:
				color = Color.B;	
				break;
			case 2:
				color = Color.G;	
				break;
				
			case 3:
				color = Color.Y;	
				break;
			case 5:
				color =Color.P;	
				break;
			case 6:
				color =Color.M;	
				break;
			case 7:
				color =Color.O;	
				break;
			case 8:
				color =Color.S;	
				break;
			
		}
		return color;
	}
	
	protected abstract void show();
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Combination other = (Combination) obj;
		if (!Arrays.equals(sequence, other.sequence))
			return false;
		return true;
	}

	public static Color toColor(char charColor) {
		
		Color color = null;
		switch (charColor){
			case 'R':
				color = Color.R;	
				break;
			case 'B':
				color = Color.B;	
				break;
			case 'G':
				color = Color.G;	
				break;
				
			case 'Y':
				color = Color.Y;	
				break;
			case 'P':
				color =Color.P;	
				break;
			case 'M':
				color =Color.M;	
				break;
			case 'O':
				color =Color.O;	
				break;
			case 'S':
				color =Color.S;	
				break;
			
		}
		return color;
	}
	
	

}
