package testTable;

public class test {
	public static void main(String[] args) {
		int[] x={12,123,325,528,723,1301,1589};
		for(int z:x){
			System.out.println(getLevel(z));
		}
		
	}
	
	public static int getLevel(int xp){
		
		int[] xps={100,300,500,700,1300};
		int i;
		for(i=0;i<xps.length;i++){
			if(xp<xps[i])
				return i;
		}
		return i;
		
	}
}
