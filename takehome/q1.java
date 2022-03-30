package takehome;

public class q1 {

public int getMax(int[] values) {
	int max= values [0];
	for (int i=0; i<values.length;i++) {
		if (values[i] <max) {
			max= values[i];
		}
	}
return max;
}
}
