import java.util.*;
class NumberConverter{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		String line1 = "+--------------------------------------------------------------+";
		char doAgain = 'N';
		
		do{
			
		System.out.println("				           ,----..               ,--,              ");
		System.out.println("				  ,--,    /   /   \\            ,--.\'|             ");
		System.out.println("				,--.'|   |   :     :           |  | :              ");
		System.out.println("				|  |,    .   |  ;. /           :  : '              ");
		System.out.println("				`--'_    .   ; /--`   ,--.--.  |  ' |      ,---.   ");
		System.out.println("				,\' ,\'|   ;   | ;     /       \\\\ \'  | |     /     \\  ");
		System.out.println("				'  | |   |   : |    .--.  .-. ||  | :    /    / '  ");
		System.out.println("				|  | :   .   | \'___  \\__\\/: . .\'  : |__ .    \' /   ");
		System.out.println("				\'  : |__ \'   ; : .\'| ,\" .--.; ||  | \'.\'|\'   ; :__  ");
		System.out.println("				|  | '.'|'   | '/  :/  /  ,.  |;  :    ;'   | '.'| ");
		System.out.println("				;  :    ;|   :    /;  :   .\'   \\  ,   / |   :    : ");
		System.out.println("				|  ,   /  \\   \\ .\' |  ,     .-./---`-\'   \\   \\  /  ");
		System.out.println("				 ---`-'    `---`    `--`---'              `----'   ");
		
		System.out.println();
		System.out.println();
		
		System.out.println("		 _   _                 _                 _____                           _            ");
		System.out.println("		| \\ | |               | |               /  __ \\                         | |           ");
		System.out.println("		|  \\| |_   _ _ __ ___ | |__   ___ _ __  | /  \\/ ___  _ ____   _____ _ __| |_ ___ _ __ ");
		System.out.println("		| . ` | | | | \'_ ` _ \\| \'_ \\ / _ \\ \'__| | |    / _ \\| \'_ \\ \\ / / _ \\ \\'__| __/ _ \\ \'__|");
		System.out.println("		| |\\  | |_| | | | | | | |_) |  __/ |    | \\__/\\ (_) | | | \\ V /  __/ |  | ||  __/ |   ");
		System.out.println("		\\_| \\_/\\__,_|_| |_| |_|_.__/ \\___|_|     \\____/\\___/|_| |_|\\_/ \\___|_|   \\__\\___|_|   ");
		
		System.out.println();
		
		System.out.println("=========================================================================================================================");
		
		System.out.println();
		
		System.out.println("	[1] Decimal Converter");
		System.out.println("	[2] Binary Converter");
		System.out.println("	[3] Octal Converter");
		System.out.println("	[4] Hexadecimal Converter");
		
		System.out.println();
		
		int chooseOption = 0;
		boolean isOptionNumCorrect;
		
		do{
		isOptionNumCorrect = true;
		System.out.print("Choose one : ");
		chooseOption = scanner.nextInt();
		
		if(chooseOption < 1 || chooseOption > 4){
			 System.out.println("Choose corrent option");
			 isOptionNumCorrect = false;
		 }
		
		}while(!isOptionNumCorrect);
		
		
		
		if(chooseOption == 1){
		
		//////////////decimal to .... converter//////////////////////////////////////
		
		System.out.println(line1);
		System.out.println("|                   Decimal Converter                          |");
		System.out.println(line1);
		
		char doDecimalAgain = 'N';
		do{
			
			doDecimalAgain = 'N';
			
			System.out.print("Enter an Decimal Number : ");
			int decimalNum = scanner.nextInt();
		
			if(decimalNum >= 0){
		
			//binary varialbles
			String binaryNum = "";
			int bDecimal = decimalNum;
		
		
			while(bDecimal>0){
				int binaryRemainder = bDecimal%2;
				binaryNum = binaryRemainder + binaryNum;
				bDecimal/=2;
			
			}
			System.out.println("Binary Number : " + (decimalNum != 0 ?binaryNum:0));
		
			//octal variables
			String octalNum = "";
			int oDecimal = decimalNum;
		
			while(oDecimal>0){
				int octalRemainder = oDecimal%8;
				octalNum = octalRemainder + octalNum;
				oDecimal/=8;
			}
			System.out.println("Octal Number : "+(decimalNum != 0 ?octalNum:0));
		
			//hexadecimal variables
			String hexaNum = "";
			String hexaLetter = "";
			int hDecimal = decimalNum;
		
			while(hDecimal > 0){
				int hexaRemainder = hDecimal%16;
			
				// 10,11,12.... to A,B,C
				if(hexaRemainder >= 10){
					switch(hexaRemainder){
						case 10 :
							hexaLetter = "A";
							break;
						case 11 :
							hexaLetter = "B";
							break;
						case 12 :
							hexaLetter = "C";
							break;
						case 13 :
							hexaLetter = "D";
							break;
						case 14 :
							hexaLetter = "E";
							break;
						case 15 :
							hexaLetter = "F";
							break;	
					}
					hexaNum = hexaLetter + hexaNum;
				
				}else hexaNum = hexaRemainder + hexaNum;
			
				hDecimal/=16;
			}
			System.out.println("Hexa Number : "+(decimalNum != 0 ?hexaNum:0));
			
			System.out.print("Do you want to go to homepage(Y/N) : ");
			doAgain = scanner.next().charAt(0);
		}else{
			System.out.println("Invalid input....");
			System.out.print("Do you want to input again(Y/N) : ");
			doDecimalAgain = scanner.next().charAt(0);
		}
		}while(doDecimalAgain == 'Y');
			
		}else if(chooseOption == 2){
		///////////////////binary to ...... converter//////////////////////////
		
			System.out.println(line1);
			System.out.println("|                       Binary Converter                       |");
			System.out.println(line1);
		
			char doBinaryAgain = 'N';
			boolean isWrongInput = false;
			
			do{
			isWrongInput = false;
			doBinaryAgain = 'N';
			
			FirstCondition : if(!isWrongInput){
			System.out.print("Enter a binary number: ");
			String binaryStr = scanner.next();

			int decimalNum = 0;
			int length = binaryStr.length();
		
			for (int i = 0; i < length; i++) {
				char binaryDigit = binaryStr.charAt(length - i - 1); 
				int binaryValue = binaryDigit - '0';
				
				if(binaryValue > 1 || binaryValue < 0){
					isWrongInput = true;
					break FirstCondition;
				}
				
				decimalNum += binaryValue * Math.pow(2, i);
			}

			System.out.println("Decimal Number : " + decimalNum);
        
			//octal variables
			String octalNum = "";
			int oDecimal = decimalNum;
		
			while(oDecimal>0){
				int octalRemainder = oDecimal%8;
				octalNum = octalRemainder + octalNum;
				oDecimal/=8;
			}
			System.out.println("Octal Number : "+(decimalNum != 0 ?octalNum:0));
			
			//hexa decimal variables
			String hexaNum = "";
			String hexaLetter = "";
			int hDecimal = decimalNum;
			
			while(hDecimal > 0){
				int hexaRemainder = hDecimal%16;
			
				// 10,11,12.... to A,B,C
				if(hexaRemainder >= 10){
					switch(hexaRemainder){
						case 10 :
							hexaLetter = "A";
							break;
						case 11 :
							hexaLetter = "B";
							break;
						case 12 :
							hexaLetter = "C";
							break;
						case 13 :
							hexaLetter = "D";
							break;
						case 14 :
							hexaLetter = "E";
							break;
						case 15 :
							hexaLetter = "F";
							break;	
					}
					hexaNum = hexaLetter + hexaNum;
				
				}else hexaNum = hexaRemainder + hexaNum;
			
				hDecimal/=16;
			}
			System.out.println("Hexa Number : "+(decimalNum != 0 ?hexaNum:0));
			
			System.out.print("Do you want to go to homepage(Y/N) : ");
			doAgain = scanner.next().charAt(0);
		}
		if(isWrongInput){
			System.out.println("Invalid input....");
			System.out.print("Do you want to input again(Y/N) : ");
			doBinaryAgain = scanner.next().charAt(0);
		}
			
		}while(doBinaryAgain == 'Y');
		
		}else if(chooseOption == 3){
			
		///////////////octal to ............ convert ///////////////////////
		
			
			System.out.println(line1);
			System.out.println("|                        Octal Converter                       |");
			System.out.println(line1);
		
			char doOctalAgain = 'N';
			boolean isWrongInput = false;
			
			do{
		
			isWrongInput = false;
			doOctalAgain = 'N';
			
			OctalIfCondition : if(!isWrongInput){
			System.out.print("Enter an octal number : ");
			String octalStr = scanner.next();
		
			int length = octalStr.length();
			int decimalNum = 0;
		
			for (int i = 0; i < length; i++)
			{
				char octalDigit = octalStr.charAt(length - i - 1);
				int octalValue = octalDigit - '0';
				
				if(octalValue > 7 || octalValue < 0){
					isWrongInput = true;
					break OctalIfCondition;
				}
				
				decimalNum += octalValue * Math.pow(8,i);
			}
			
			System.out.println("Decimal Number : " + decimalNum);
		
			//binary varialbles
			String binaryNum = "";
			int bDecimal = decimalNum;
		
		
			while(bDecimal>0){
				int binaryRemainder = bDecimal%2;
				binaryNum = binaryRemainder + binaryNum;
				bDecimal/=2;
			
			}
			System.out.println("Binary Number : "+(decimalNum != 0 ?binaryNum:0));
			
			//hexa decimal variables
			String hexaNum = "";
			String hexaLetter = "";
			int hDecimal = decimalNum;
			
			while(hDecimal > 0){
				int hexaRemainder = hDecimal%16;
			
				// 10,11,12.... to A,B,C
				if(hexaRemainder >= 10){
					switch(hexaRemainder){
						case 10 :
							hexaLetter = "A";
							break;
						case 11 :
							hexaLetter = "B";
							break;
						case 12 :
							hexaLetter = "C";
							break;
						case 13 :
							hexaLetter = "D";
							break;
						case 14 :
							hexaLetter = "E";
							break;
						case 15 :
							hexaLetter = "F";
							break;	
					}
					hexaNum = hexaLetter + hexaNum;
				
				}else hexaNum = hexaRemainder + hexaNum;
			
				hDecimal/=16;
			}
			System.out.println("Hexa Number : "+(decimalNum != 0 ?hexaNum:0));
			
			System.out.print("Do you want to go to homepage(Y/N) : ");
			doAgain = scanner.next().charAt(0);
		}
		if(isWrongInput){
			System.out.println("Invalid input.....");
			System.out.println("Do you want to input again(Y/N) : ");
			doOctalAgain = scanner.next().charAt(0);
		}
			
		}while(doOctalAgain == 'Y');
			
		}else if(chooseOption ==4 ){
			
			/////////////////////////////////////hexa decimal to .......... converter /////////////////////////
			
			System.out.println(line1);
			System.out.println("|                    Hexadecimal Converter                     |");
			System.out.println(line1);
			
			char doHexaAgain = 'N';
			boolean isWrongInput = false;
			
			do{
			
			doHexaAgain = 'N';
			isWrongInput = false;
			
			HexaIfCondition : if(!isWrongInput){
			System.out.print("Enter a hexa decimla number : ");
			String hexaStr = scanner.next();
			
			int length = hexaStr.length();
			int decimalNum = 0;
			int hexaLetterValue = 0;
			
			for (int i = 0; i < hexaStr.length(); i++) {
            char c = hexaStr.charAt(i);

            if (!(c >= '0' && c <= '9') && !(c >= 'A' && c <= 'F')) {
                isWrongInput = true;
                break HexaIfCondition;
            }
			}
			
			for (int i = 0; i < length; i++)
			{
				char hexaDigit = hexaStr.charAt(length - i - 1);
				switch(hexaDigit){
					case 'A':
						hexaLetterValue = 10;
						break;
					case 'B':
						hexaLetterValue = 11;
						break;
					case 'C':
						hexaLetterValue = 12;
						break;
					case 'D':
						hexaLetterValue = 13;
						break;
					case 'E':
						hexaLetterValue = 14;
						break;
					case 'F':
						hexaLetterValue = 15;
						break;
					default :
						hexaLetterValue = hexaDigit - '0';
						break;
				}
				
				
				decimalNum += hexaLetterValue * Math.pow(16,i);
			}
			System.out.println("Decimal Number : " + decimalNum);
			
			//binary varialbles
			String binaryNum = "";
			int bDecimal = decimalNum;
		
		
			while(bDecimal>0){
				int binaryRemainder = bDecimal%2;
				binaryNum = binaryRemainder + binaryNum;
				bDecimal/=2;
			
			}
			System.out.println("Binary Number : " +(decimalNum != 0 ?binaryNum:0));
			
			//octal variables
			String octalNum = "";
			int oDecimal = decimalNum;
		
			while(oDecimal>0){
				int octalRemainder = oDecimal%8;
				octalNum = octalRemainder + octalNum;
				oDecimal/=8;
			}
			System.out.println("Octal Number : "+(decimalNum != 0 ?octalNum:0));
			
			System.out.print("Do you want to go to homepage(Y/N) : ");
			doAgain = scanner.next().charAt(0);
		}
		
		if(isWrongInput){
			System.out.println("Invalid input......");
			System.out.println("Do you want to input again(Y/N) : ");
			doHexaAgain = scanner.next().charAt(0);
		}
			
		}while(doHexaAgain == 'Y');
		}	
	}while(doAgain == 'Y');
	}
} 
