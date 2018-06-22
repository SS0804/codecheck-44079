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



		if (subCommand.equals("encode")) {

//		    int parameter = Integer.parseInt(param);
//			int sum = 0;
//
//			int count = 0;
//
//			for (int i = parameter; i > 9;) {
//
//				i = i / 9;
//
//				count += 1;
//
//
//			}













		} else if(subCommand.equals("decode")) {

			List<String> list = new ArrayList<String>();

			for (int i = 0, l = param.length(); i < l; i++) {

				System.out.println(String.valueOf(param.charAt(i)));

				list.add(String.valueOf(param.charAt(i)));
			}

			int result = 0;
			int cal = 0;
			int len = list.size();

			for (int i = 0, l = list.size(); i < l; i++) {

				cal = convertAlphabettoNumber(list.get(i));

				for (int t = len ; t > 1; --t ) {

					cal = cal * 9;

				}

				result += cal;

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

	public static String convertNumbertoAlphabet(int num) {
		String result = null;

		if (num == 0) {

			result= "A";

		} else if  (num == 1)  {

			result= "B";

		} else if  (num == 2)  {

			result= "C";

		} else if  (num == 3)  {

			result= "D";

		} else if  (num == 4)  {

			result= "E";

		} else if  (num == 5)  {

			result= "F";

		} else if  (num == 6)  {

			result= "G";

		} else if  (num == 7)  {

			result= "H";

		} else if  (num == 8)  {

			result= "I";

		}

		return result;


	}


}
