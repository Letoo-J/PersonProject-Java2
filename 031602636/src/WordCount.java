import java.io.IOException;

public interface WordCount {
	
	/**
	 * ��������
	 * @param filename
	 * @return
	 * @throws IOException
	 */
	int linesCount(String filepath) throws IOException;
	
	/**
	 * ���غϷ�������
	 * @param filepath
	 * @return
	 * @throws IOException
	 */
	int wordsCount(String filepath) throws IOException;
}
