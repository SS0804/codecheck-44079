package codecheck;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		String subCommand = args[0];
		String param = args[1];

		if (subCommand.equals("encode")) {


		} else if(subCommand.equals("decode")) {

			List<String> list = new ArrayList<String>();

			for (int i = 0, l = param.length(); i < l; i++) {
				list.add(String.valueOf(param.charAt(i)));
			}

			int result = 0;
			int cal = 0;
			int len = list.size();

			for (int i = 0, l = list.size(); i < l; i++) {

				if (list.get(i).equals("A")) {

					cal= 0;

				} else if (list.get(i).equals("B")) {

					cal= 1;
				} else if (list.get(i).equals("C")) {

					cal= 2;
				} else if (list.get(i).equals("D")) {

					cal= 3;
				} else if (list.get(i).equals("E")) {

					cal= 4;
				} else if (list.get(i).equals("F")) {

					cal= 5;
				} else if (list.get(i).equals("G")) {

					cal= 6;
				} else if (list.get(i).equals("H")) {

					cal= 7;
				} else if (list.get(i).equals("I")) {

					cal= 8;
				}

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
}
