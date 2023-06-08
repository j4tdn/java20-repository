package view;

import bean.SaddleElement;
import bean.SaddleElementUtils;

public class Ex03SaddlElement {
	public static void main(String[] args) {
		SaddleElement se = SaddleElementUtils.inputMatrixRandom();
		SaddleElementUtils.outputMatrix(se);
		SaddleElementUtils.printSaddleElement(se);
	}
}
