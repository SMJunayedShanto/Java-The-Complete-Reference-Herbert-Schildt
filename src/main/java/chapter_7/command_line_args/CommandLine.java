/**
 * 
 */
package chapter_7.command_line_args;

/**
 * @author Shanto
 *
 */
public class CommandLine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for(String s : args) {
//			System.out.println(s);
//		}
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
