package checking;

import java.util.Scanner;

public class Table {
	private int rows;
    private int columns;
    private int[][] data;

    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    public void enterData() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập dữ liệu cho bảng:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Nhập giá trị cho ô [" + i + "][" + j + "]: ");
                data[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public void printTable() {
        for (int[] row : data) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
    
    public void checkSaddleEle() {
    	int minmax = data[0][0], l = 0;
    	String st = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(data[i][j] < minmax) {
                	minmax = data[i][j];
                	l = j;
                }
            } 
            for (int k = 0; k < rows; k++) {
            	if(minmax > data[k][l] && k == rows-1) {
            		st = st + minmax;
            	}
            }
        }
        if(st == "") {
        	System.out.println("Không có phần tử yên ngựa");
        }
        else {
        	System.out.println("Phần tử yên ngựa là: " + st);
        }
    }
}
