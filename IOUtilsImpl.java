package t13;

import java.awt.List;
import java.io.*;
import java.nio.charset.Charset;
import java.util.LinkedList;

public class IOUtilsImpl implements IOUtils{
	
	@Override
	public void replaceChars(Reader in, Writer out, String inChars, String outChars)throws NullPointerException, IllegalArgumentException {		
		if (inChars==null || outChars==null) {
			throw new  NullPointerException("inChars==null || outChars==null");
		}
		if (inChars.length()!=outChars.length()) {
			throw new IllegalArgumentException("inChars.length()!=outChars.length()");
		}

		 StringBuilder sb = new StringBuilder();
		
		try(BufferedReader br = new BufferedReader(in); BufferedWriter bw = new BufferedWriter(out)){
			
			 String line;
			 String line2 = null;
		     while((line = br.readLine()) != null){      
		            //System.out.println(line);
		            line2=line;
		     }
		     br.close();
		    // System.out.println(line2);
		     
		     char [] a = line2.toCharArray();
		     char [] b = inChars.toCharArray();
		     char [] t = outChars.toCharArray();
		     int i,j;
		     j=0;
		     for (i = 0; i < a.length; i++) {
					System.out.print(a[i]);
				}
		     
		     System.out.println();
		     for (i = 0; i < a.length; i++) {
				
				if (a[i]==b[j]) {
					a[i]=t[j];
					j++;
				}if(j==t.length){i=a.length-1;}
				//System.out.print(a[i]);
			}
		     for (i = 0; i < a.length; i++) {
					System.out.print(a[i]);
				}
		     
		    bw.write(a);
		    bw.flush();
		    bw.close();
		    
		     /*String replace = line2.replace(inChars, outChars);
		     System.out.println(replace);*/
		        
		} catch (Exception e) {e.printStackTrace();}
		
	}

	@Override
	public String[] findFiles(String dir) throws NullPointerException, IllegalArgumentException {
		if (dir==null) {
			throw new  NullPointerException("inChars==null || outChars==null");
		}
		
		File[] files = (new File(dir)).listFiles();
		LinkedList<String> list = new LinkedList<String>();
		
		for (File ff: files) {
			if(ff.isFile()){
			//System.out.println("Τΰιλ: " + ff.getPath());
			list.add(ff.getPath());
			}
		}
		String[] findFiles = new String[list.size()];
		list.toArray(findFiles);
		return findFiles;
	}
}
