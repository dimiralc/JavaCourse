import java.util.Scanner;
import java.lang.*;

public class E1_Funciones {

	public static String[] arr_accounts = new String[10];
	public static int[] arr_categories = new int[10];
	public static String[] arr_categoryNames = new String[10]; 
	public static boolean status = true;	
	public static String[] arr_menu = {"1. Agregar Cuenta", "2. Agregar Categoria", "3. Eliminar Categoria", "4. Listar Categorías", "5. Salir"};
	public static int option = 0;
	public static Scanner scanner =  new Scanner(System.in); // allows user inputs
	public static String txt_input;
	
	public static void main(String[] args) {	
		
		while (status ==  true) {
			
			print_menu(arr_menu);
			option = Integer.parseInt(scanner.nextLine()) ;
			
			switch(option) {
				case 1:
					String account;
					p("Ingrese nombre para la nueva cuenta: ");
					account = scanner.nextLine();
					add_account(account);
					break;
				
				case 2:
					int tipo;
					String category;
					
					p("Ingrese el codigo para el nuevo tipo:");
					tipo = Integer.parseInt(scanner.nextLine());
					add_category(tipo);
					
					p("Ingrese el nomnbre de la categoria:");
					category = scanner.nextLine();
					add_CategName(category);
					break;
				
				case 3:
					
					p("Seleccione la categoría a eliminar:_");
					print_categories (arr_categoryNames);
					tipo = Integer.parseInt(scanner.nextLine());
					del_category(tipo);
					break;
				
				case 4:
					print_categories(arr_categoryNames);
					break;
				
				case 5:
					status = false;			
					scanner.close();
					break;
			}
			
			
			
		};	
	}
	
	
	/*Agregar cuentas*/
	public static void add_account (String acnt_name) {
		
		for(int i = 0; i<= arr_accounts.length-1;i++) {
			if( arr_accounts[i] == null || arr_accounts[i].length() == 0) {
				arr_accounts[i] = acnt_name; 
				break;
			}else {
				continue;
			}			
		}
	}
	
	/*Agregar categorias (tipos)*/
	public static void add_category (int cat) {
		for(int i = 0; i<= arr_categories.length-1 ;i++) {
			if( arr_categories[i] == 0) {
				arr_categories[i] = cat;
				break;
			}else {
				continue;
				
			}
		}
	}
	
	/*Agregar nombre categoria*/
	public static void add_CategName (String category_name) {
		for(int i = 0; i<= arr_categoryNames.length-1; i++) {
			if(arr_categoryNames[i] ==  null || arr_categoryNames[i].length() == 0) {
				arr_categoryNames[i] = category_name;
				break;
			}else {
				continue;
			}
		}
	}
	
	/*Imprime objetos*/
	public static void p(Object obj) {
		System.out.println(obj);
	}
	
	/*Imprime categorias*/
	public static void print_categories (String[] arr_categories) {
		for(int i = 0; i<= arr_categories.length-1; i++) {
			System.out.println(arr_categories[i]);	


		}
	}
	
	/*Imprime cuentas*/
	public static void print_accounts (String[] arr_accounts) {
		for (int i= 0; i<= arr_accounts.length-1; i++) {
			System.out.println(arr_accounts[i]);
		}
	}
	
	/*Imprime menú*/
	public static void print_menu(String[] arr_menu) {
		p("Menú:");
		for (int i = 0; i<= arr_menu.length-1; i++) {
			p(arr_menu[i]);
		} 
		p("Ecoja una opcion:_");	
	}
	
	/*Elimina categorias por posicion*/
	public static void del_category (int pos) {
		arr_categories[pos] = 0 ;
		arr_categoryNames[pos] = null; 
	}

}
