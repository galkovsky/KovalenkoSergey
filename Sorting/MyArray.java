package my.project.com;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
public static void main(String[] args) throws IOException{
	
	System.out.println("������� �����, ������������ ������ �������");
	Scanner scan = new Scanner(System.in); 
 	String l = scan.nextLine();  
 	while (!checkString(l)) {  //����� ��� �������� �����
 		System.out.println("������� ���������� ����� ��� ������� �������:");
 		l = scan.nextLine();
 	}
  	int dlinnaMassiva = Integer.parseInt(l);	
 	int[] arr1 = new int [dlinnaMassiva];
 	
 	for (int z=0; z<dlinnaMassiva; z++){
		System.out.println("������� �������� ���� ����� �������"); //������ �������� �������
		int znachMassiva = scan.nextInt();
		arr1[z] = znachMassiva;    //����� ��� ������
		}
 	System.out.println("��� ������"+Arrays.toString(arr1));
 	System.out.println("��� ���������� �� ���������� ������� asc, �� �������� desc");
  	String operation = scan.next();
 		 		
  				while(!operation.equals("asc") && !operation.equals("desc")) {
  					System.out.println("������� asc ���(1,2,3) ��� desc ���(3,2,1), ����������!");
  					operation = scan.next();
	 				}
 				
	 		switch (operation) {
			case "asc": //���������� �� �����������
						for(int i = arr1.length-1 ; i > 0 ; i--){
							for(int j = 0 ; j < i ; j++){
		 		                if( arr1[j] > arr1[j+1] ){
		 		                int tmp = arr1[j];
		 		                arr1[j] = arr1[j+1];
		 		                arr1[j+1] = tmp;
		 		            }
		 		        }
		 		    }
		 		break;
			
			case "desc": //���������� �� ��������
						for(int i = 0; i<arr1.length; i++){
							for(int j = arr1.length-1; j > i; j--){
		 		                if( arr1[j] > arr1[j-1] ){
		 		                int tmp = arr1[j];
		 		                arr1[j] = arr1[j-1];
		 		                arr1[j-1] = tmp;
		 		            }
		 		        }
		 		    }
		 		break;
						
			default:
				break;
			}
	 		System.out.println(Arrays.toString(arr1));
	 		System.out.println("���� �� ������ ����� ������ � ������������ ������ � �������, ������� ��� �����:");
	 			
	 			int key = scan.nextInt();
	 			int left = 0;
	 		    int right = arr1.length;
	 		   	 		    
	 		    while (left!=(right - left) || (right - left) <= 1)
	 		    {
	 		    	int middle = left + (right - left) / 2;
	 		    	if (arr1[middle] == key)
	 		    		System.out.println("���� ����� " + arr1[middle]+ " � ������ " + middle);
	 		    	 		        
	 		    	switch (operation) {
	 		    	case ("asc"):
		 		    	if (key < arr1[middle])
		 		            right = middle ;
		 		        else
		 		            left = middle + 1;
	 		    	break;
	 		    	case ("desc"):	
	 		    		if (key > arr1[middle])
		 		            right = middle ;
		 		        else
		 		            left = middle + 1;
	 		    }
	 		  }
	 	}
public static boolean checkString(String string) {
    try {
        Integer.parseInt(string);
    } catch (Exception e) {
        return false;
    }
    return true;
}
}

