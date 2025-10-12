package stringtopic.mutableway;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		String name = "royal";
//		System.out.println(name+"---"+name.hashCode()); 
		// Immutable
//		name = name.concat("technosoft");// royaltechnosoft
//		System.out.println(name+"---"+name.hashCode()); 
		
//		StringBuilder sb = new StringBuilder("royal");
		StringBuffer sb = new StringBuffer("royal");
		System.out.println(sb+"---"+sb.hashCode());

		// mutable
		sb.append(" technosoft");// royaltechnosoft
		
		System.out.println(sb+"---"+sb.hashCode());
	}
}
