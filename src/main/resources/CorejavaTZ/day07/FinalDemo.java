package com.corejava.day07;

/**
 * ����������ʾfinal�ؼ���
 *
 * ����:JSD1412
 * ʱ��:2015-1-13 ����4:36:50
 */
//final�������ʾ����಻�ܱ��̳�
public final class FinalDemo {

	//����������ߴ���Ŀɶ���

	//��������
	//public static final int ROW_EACH_PAGE = 10;
	public static final int ROW_EACH_PAGE;

	//��������ͨ����̬������ʼ��
	static {
		ROW_EACH_PAGE = 10;
	}

	public static void main(String[] args) {

		//����һ����ֵ,�޷��ı�
		final int ROWS = 3;
		//ROWS = 10;
	}

	//final���η���,��ʾ����������ܱ���д
	public final void method() {

	}
}

/*class Test extends FinalDemo {
	@Override
	public void method() {
		super.method();
	}
}*/
