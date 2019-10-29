
public class App {
	//"3.commandLine.java"につくったobject、”CommandLine"を参照しています.
	//いつものinitializeと同じ型。”CommandLine"がtypeで、cmdLineがvariable name.
	private static CommandLine cmdLine;
	
	//1.プログラムが終わらないように、デフォルトの値を"false"にしておきます。
	private static boolean _shouldTerminate = false;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4."CommandLine"のinstance(そのプログラムを走らせた結果得られるobject）を作り、"cmdLine"という名前にします。
		cmdLine = new CommandLine(args);
		
		
		//2.'do while'文を使うと、少なくとも１回はランします。（"for”とか”while”とは違って、ランするかどうかの条件が命令の後ろにきてるからね）
		//2.そんで、もし”_shouldTerminate == false”だったらloopを続けます。
		do
		{
			
		}while(_shouldTerminate == false); // "_shouldTerminate == true"になったらloopを抜けます。
		}

	}
