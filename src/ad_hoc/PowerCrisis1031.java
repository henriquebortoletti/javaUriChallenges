package ad_hoc;

import java.util.Scanner;

public class PowerCrisis1031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		while((i = sc.nextInt()) !=0){
			System.out.println(resultado(i));	
		}
	}
	public static boolean contem(int []vetor, int x){
		for(int i =0;i<vetor.length;i++)
			if(vetor[i]==x)return true;
		return false;
	}
	
	public static int verifica(int[] vetor, int lim,int m, int atual){
		int valor = vetor[atual-1];
		for(int i =0;i<m;i++){
			int soma=1;
			if((valor+soma)>lim) valor=1;
			while(contem(vetor,valor+soma)){
				soma++;
				if((valor+soma)>lim) {
					valor=1;
					soma=1;
				}
			}
			valor+=soma;
		}
		return valor;
	}
	
	public static int resultado(int x){
		int i = 1;
		while(true){
			int num[] = new int[x];
			num[0] = 1;
			int j = 1;
			while(j<num.length){
				num[j]=verifica(num,x,i,j); 
			j++;
			}
			if(num[num.length-1]==13)return i;
			i++;
		}
	}
}
