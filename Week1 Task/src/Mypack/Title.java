package Mypack;

public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello buddy how are you doing";
		System.out.println(convertTotiltleCase(s));

	}
	public static String convertTotiltleCase(String s)
	{
		String st[]=s.split(" ");
		StringBuffer b=new StringBuffer();
		for(int w=0; w< st.length;w++)
		{
			b.append(Character.toUpperCase(st[w].charAt(1))).append(st[w].substring(1)).append(" ");
		}
		return b.toString().trim();
	}

}
