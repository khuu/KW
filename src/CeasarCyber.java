


public class CeasarCyber implements CharSequence {

	public String word = "Test";
	public int n;

	public CeasarCyber(String word, int n) {

		this.word = word;
		this.n = n;
		
		char[] oldChar = word.toCharArray();
		
		char[] newChar = new char[oldChar.length];
		
		for(int i =0;i< oldChar.length ;i++)
		{
			if(oldChar[i] == 'z'){newChar[i]='a';}
			else if(oldChar[i] == 'Z'){newChar[i]='A';}
			else if(oldChar[i] == '9'){newChar[i]='0';}
			else if(oldChar[i] == ' '){newChar[i]=' ';}
		 
			else newChar[i]=(char) (oldChar[i]+ n);
			
		}
		
		this.word = String.valueOf(newChar);
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	

	@Override
	public char charAt(int arg0) {
		
		return word.charAt(arg0);
	}

	@Override
	public int length() {
		
		return word.length();
	}

	@Override
	public CharSequence subSequence(int arg0, int arg1) {
		
		return word.subSequence(arg0, arg1);

	}
	public static void main(String[] args) {
		CeasarCyber alice = new CeasarCyber("abcdefghijklmnopz 9 ",1);
		
		
	
		System.out.println(alice.length());
		
		System.out.println(alice.charAt(4));
		
		System.out.println(alice.subSequence(0,20));
	}
}
