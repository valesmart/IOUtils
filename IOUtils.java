package t13;

import java.io.Reader;
import java.io.Writer;

/**
 * ������� ��� ������ � �������� �����-������. 
 * 
 * @author nedis
 * @version 1.0
 */
public interface IOUtils {
	
	/**
     * ����������� ������� �� �������� ������ � ��������, ������� �������
     ������� �� ������� ���� � <code>inChars</code>, �� ������� �������
     ��������� � ��� �� ������� � <code>outChars</code>. ������
     <code>inChars</code> � <code>outChars</code> ������ ���� ����������
     ������. ���� <code>inChars</code> ��� <code>outChars</code> == null
     ������� ��� �� ���� ���� ������ ������ ������. <b> ������: in =
     1234567890<b> inChars = 357<b> outChars = 480<b> <b> out = 1244860890<b>
     *
     * @param in
     * @param out
     * @param inChars
     * @param outChars
     * @throws NullPointerException ���� ����� �� ���������� in ��� out == null 
     * @throws IllegalArgumentException ���� inChars.length != outChars.length
     */
	void replaceChars(Reader in, Writer out,String inChars,String outChars) throws NullPointerException, IllegalArgumentException;
	
	/**
	 * ������� ������� ��� ����� � ���������� � �������������� � ���������� �� ������ ���� � ���� ������� �����. 
	 * 
	 * @param dir ����� � ������� ���������� ������ ����� 
	 * @return ������ ����� � ������ 
	 * @throws NullPointerException ���� dir == null  
	 * @throws IllegalArgumentException ���� dir �� ����������
	 */
	String[] findFiles(String dir) throws NullPointerException, IllegalArgumentException;
}
