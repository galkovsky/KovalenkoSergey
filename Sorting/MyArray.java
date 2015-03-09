package my.project.com;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyArray {
public static void main(String[] args) throws IOException{
	
	System.out.println("Введите число, отображающее размер массива");
	Scanner scan = new Scanner(System.in); 
 	String l = scan.nextLine();  
 	while (!checkString(l)) {  //метод для проверки числа
 		System.out.println("Введите корректное число для размера массива:");
 		l = scan.nextLine();
 	}
  	int dlinnaMassiva = Integer.parseInt(l);	
 	int[] arr1 = new int [dlinnaMassiva];
 	
 	for (int z=0; z<dlinnaMassiva; z++){
		System.out.println("Введите значения всех ячеек массива"); //вводим значения массива
		int znachMassiva = scan.nextInt();
		arr1[z] = znachMassiva;    //ВВЕЛИ НАШ МАССИВ
		}
 	System.out.println("Ваш массив"+Arrays.toString(arr1));
 	System.out.println("Для сортировки по увеличении введите asc, по убывании desc");
  	String operation = scan.next();
 		 		
  				while(!operation.equals("asc") && !operation.equals("desc")) {
  					System.out.println("Введите asc для(1,2,3) или desc для(3,2,1), пожалуйста!");
  					operation = scan.next();
	 				}
 				
	 		switch (operation) {
			case "asc": //сортировка по возрастанию
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
			
			case "desc": //сортировка по убыванию
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
	 		System.out.println("Если Вы хотите найти ячейку с определенным числом в массиве, введите это число:");
	 			
	 			int key = scan.nextInt();
	 			int left = 0;
	 		    int right = arr1.length;
	 		   	 		    
	 		    while (left!=(right - left) || (right - left) <= 1)
	 		    {
	 		    	int middle = left + (right - left) / 2;
	 		    	if (arr1[middle] == key)
	 		    		System.out.println("Ваше число " + arr1[middle]+ " в ячейке " + middle);
	 		    	 		        
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

