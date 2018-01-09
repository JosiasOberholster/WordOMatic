package com.JosiasOberholster;
public class WordOMatic 
{
	public static void main(String[] args)
	{
		new WordOMatic().build();
	}
	
	public void build()
	{
		String[] word1 = {" 24/7", " multi-tier", " 30,000 foot", " B-to-B", " win-win", " front-end", " web-base", " pervasive",
						  " smart", " six-segma", " critical-path", " dynamic"};
		
		String[] word2 = {" empowered", " sticky", " value-added", " oriented", " centric", " distrubuted", " cluster", " branded",
			              " outside-the-box", " positioned", " networked", " focused", " leverage", " aligned", " targeted", 
			              " shared", " co-opretive", " accelerate"};
		
		String[] word3 = {" process", " tipping-point", " solution", " architecture", " core competency", " strategy", " mindshare",
	              		   " portal", " space", " vision", " paradigm", " mission"};	
		
		int randOne = (int)(Math.random() * word1.length);
		int randTwo = (int)(Math.random() * word2.length);
		int randThree = (int)(Math.random() * word3.length);
		
		String phrase1 = word1[randOne];
		String phrase2 = word2[randTwo];
		String phrase3 = word3[randThree];
		
		String words = phrase1 + phrase2 + phrase3;
		
		System.out.println("What we have here is a" + words);
	}
}
