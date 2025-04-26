import java.util.*;
class NumberConverter{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Choose one : ");
		int chooseOption = scanner.nextInt();
		
		
		if(chooseOption == 1){
		
		//////////////decimal to .... converter//////////////////////////////////////
			System.out.print("Enter an Decimal Number : ");
			int decimalNum = scanner.nextInt();
		
			//binary varialbles
			String binaryNum = "";
			int bDecimal = decimalNum;
		
		
			while(bDecimal>0){
				int binaryRemainder = bDecimal%2;
				binaryNum = binaryRemainder + binaryNum;
				bDecimal/=2;
			
			}
			System.out.println(decimalNum != 0 ?binaryNum:0);
		
			//octal variables
			String octalNum = "";
			int oDecimal = decimalNum;
		
			while(oDecimal>0){
				int octalRemainder = oDecimal%8;
				octalNum = octalRemainder + octalNum;
				oDecimal/=8;
			}
			System.out.println(decimalNum != 0 ?octalNum:0);
		
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
			System.out.println(decimalNum != 0 ?hexaNum:0);
		}else if(chooseOption == 2){
		///////////////////binary to ...... converter//////////////////////////
			System.out.print("Enter a binary number: ");
			String binaryStr = scanner.next();

			int decimalNum = 0;
			int length = binaryStr.length();
		
			for (int i = 0; i < length; i++) {
				char binaryDigit = binaryStr.charAt(length - i - 1); 
				int binaryValue = binaryDigit - '0';
            
				decimalNum += binaryValue * Math.pow(2, i);
			}

			System.out.println("Decimal value: " + decimalNum);
        
			//octal variables
			String octalNum = "";
			int oDecimal = decimalNum;
		
			while(oDecimal>0){
				int octalRemainder = oDecimal%8;
				octalNum = octalRemainder + octalNum;
				oDecimal/=8;
			}
			System.out.println(decimalNum != 0 ?octalNum:0);
			
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
			System.out.println(decimalNum != 0 ?hexaNum:0);
		
		}else if(chooseOption == 3){
			
		///////////////octal to ............ convert ///////////////////////
			System.out.print("Enter an octal number : ");
			String octalStr = scanner.next();
		
			int length = octalStr.length();
			int decimalNum = 0;
		
			for (int i = 0; i < length; i++)
			{
				char octalDigit = octalStr.charAt(length - i - 1);
				int octalValue = octalDigit - '0';
			
				decimalNum += octalValue * Math.pow(8,i);
			}
			
			System.out.println("Decimal Value : " + decimalNum);
		
			//binary varialbles
			String binaryNum = "";
			int bDecimal = decimalNum;
		
		
			while(bDecimal>0){
				int binaryRemainder = bDecimal%2;
				binaryNum = binaryRemainder + binaryNum;
				bDecimal/=2;
			
			}
			System.out.println(decimalNum != 0 ?binaryNum:0);
			
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
			System.out.println(decimalNum != 0 ?hexaNum:0);
			
			
		}else if(chooseOption ==4 ){
			
			/////////////////////////////////////hexa decimal to .......... converter /////////////////////////
			System.out.print("Enter a hexa decimla number : ");
			String hexaStr = scanner.next();
			
			int length = hexaStr.length();
			int decimalNum = 0;
			int hexaLetterValue = 0;
			
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
			System.out.println("Decimal Value : " + decimalNum);
			
			//binary varialbles
			String binaryNum = "";
			int bDecimal = decimalNum;
		
		
			while(bDecimal>0){
				int binaryRemainder = bDecimal%2;
				binaryNum = binaryRemainder + binaryNum;
				bDecimal/=2;
			
			}
			System.out.println(decimalNum != 0 ?binaryNum:0);
			
			//octal variables
			String octalNum = "";
			int oDecimal = decimalNum;
		
			while(oDecimal>0){
				int octalRemainder = oDecimal%8;
				octalNum = octalRemainder + octalNum;
				oDecimal/=8;
			}
			System.out.println(decimalNum != 0 ?octalNum:0);
			
			
		}else {System.out.print("Choose corrent option");}
	}
} 
