package codecheck;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		String subCommand = null;
		String param = null;

		subCommand = args[0];
		param = args[1];

		System.out.println("subCommand:" + subCommand);
		System.out.println("param:" + param);


		List<String> list = new ArrayList<String>();



		for (int i = 0, l = param.length(); i < l; i++) {

			System.out.println(String.valueOf(param.charAt(i)));

			list.add(String.valueOf(param.charAt(i)));
		}

		if (subCommand.equals("encode")) {




		} else if(subCommand.equals("decode")) {

			int result = 0;
			int cal = 0;
			int len = list.size();

			for (int i = 0, l = list.size(); i < l; i++) {

				cal = convertAlphabettoNumber(list.get(i));

				for (int t = len ; t > 1; --t ) {

					cal = cal * 9;

				}

				System.out.println("計算結果:" + cal);

				result =+ cal;

				--len;

			}

			System.out.println(result);





		} else if(subCommand.equals("align")) {



		}








	}

	public static int convertAlphabettoNumber(String alphabet) {
		int result = 0;

		if (alphabet.equals("A")) {

			result= 0;

		} else if (alphabet.equals("B")) {

			result= 1;
		} else if (alphabet.equals("C")) {

			result= 2;
		} else if (alphabet.equals("D")) {

			result= 3;
		} else if (alphabet.equals("E")) {

			result= 4;
		} else if (alphabet.equals("F")) {

			result= 5;
		} else if (alphabet.equals("G")) {

			result= 6;
		} else if (alphabet.equals("H")) {

			result= 7;
		} else if (alphabet.equals("I")) {

			result= 8;
		}
		return result;


	}


}
