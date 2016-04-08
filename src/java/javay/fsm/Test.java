package javay.fsm;

public class Test {

	public static void main(String[] args) {
//		String a = "s=" + null;
		System.out.println( null + "s=");
//		StringBuilder a = new StringBuilder();
//		a.append(null);
	}

}
//反编译一下就很清楚了。
//
//0: getstatic     #16                 // Field java/lang/System.out:Ljava/io/PrintStream;
//3: new           #22                 // class java/lang/StringBuilder
//6: dup
//7: ldc           #24                 // String s=
//9: invokespecial #26                 // Method java/lang/StringBuilder."<init>":(Ljava/lang/String;)V
//12: aconst_null
//13: invokevirtual #29                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
//16: invokevirtual #33                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//19: invokevirtual #37                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//通过来构筑输出信息，在append(null)时使用了String.valueOf
//public static String valueOf(Object obj) {
//    return (obj == null) ? "null" : obj.toString();
//}
//所以输出了s=null。