package my.project.com;

public class proverkaMassiva {

public void checkArr (int arr[]) {
	double test = arr[2] - arr[1];
	boolean flag = true;
	for (int i = 0; i <arr.length-1; i++){
		if (arr[i+1] - arr[i] != test)
	flag = false; 
	}
	if (!flag)
		System.out.println("�� �������� �������������� �����������!");
	else
		System.out.println("�������� �������������� �����������");
}

public void checkArr2 (int arr[]) {
	double test = arr[2]/arr[1];
	boolean flag = true;
	for (int i = 0; i <arr.length-1; i++){
		if (arr[i+1]/arr[i] != test)
	flag = false; 
	}
	if (!flag)
		System.out.println("�� �������� �������������� �����������!");
	else
		System.out.println("�������� �������������� �����������");
}
public int[] arreyAsc(int arr[]){
	
			
	int b[] = arr[];
	return b;
}
}
