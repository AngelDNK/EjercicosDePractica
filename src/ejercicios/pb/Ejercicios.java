package ejercicios.pb;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		/*
		 * BLOQUE DE OPERADORES
		 * 
		 * Ejercicio 1:
		 * 
		 * Hacer un programa que calcule e imprima la suma de tres calificaciones
		 * 
		 */

		/*
		 * int nota1, nota2, nota3, suma;
		 * 
		 * System.out.println("Ingrese la primera Nota:"); nota1 = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese la segunda Nota "); nota2 = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese la tecera Nota: "); nota3 = teclado.nextInt();
		 * 
		 * suma = nota1 + nota2 + nota3;
		 * 
		 * System.out.println("La suma de las tres Notas son: " + suma);
		 */

		/*
		 * Ejercicio 2:
		 * 
		 * Hacer un programa que calcule e imprima el salario semanal de un empleado a
		 * partir de sus horas semanales trabajadas y de su salario por hora
		 */

		/*
		 * int salarioSemanal, horasSemanales, salarioPorHora;
		 * 
		 * System.out.println("Ingrese la cantidad de horas trabajadas"); horasSemanales
		 * = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese su salario por hora"); salarioPorHora =
		 * teclado.nextInt();
		 * 
		 * 
		 * salarioSemanal = horasSemanales*salarioPorHora;
		 * 
		 * System.out.println("Su salario semanal es: " + salarioSemanal);
		 */

		/*
		 * Ejercicio 3:
		 * 
		 * Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
		 * Juan tiene la mitad de lo que possen Luis y Guillermo juntos. Hacer un
		 * programa que calcule e imprima la cantidad de dinero que tiene entre los
		 * tres.
		 */

		/*
		 * int guillermo, luis, juan, resultado;
		 * 
		 * System.out.println("Ingrese cuantos Dolares tiene Guillermo: "); guillermo =
		 * teclado.nextInt();
		 * 
		 * luis = guillermo/2;
		 * 
		 * juan = (guillermo + luis)/2;
		 * 
		 * resultado = guillermo + luis + juan;
		 * 
		 * System.out.println("La cantidad de dinero que tienen entre los tres son: $" +
		 * resultado + " Dolares" );
		 */

		/*
		 * Ejercicio 4:
		 * 
		 * Una compañia de venta de carros usados, paga a su personal de ventas un
		 * salario de ventas un salario de $1000 mensuales, mas una comision de $150 por
		 * cada carro vendido, mas el 5% del valor de la venta por carro. ada mes el
		 * capturista de la empresa ingresa en la computadora los datos pertinentes.
		 * Hacer un programa que calcule e imprima el salario mensual de un vendedor
		 * dado
		 */

		/*
		 * int salarioMensual = 1000, comisionDeVenta = 150, cantidadDeAutosVendidos,
		 * valorDelAuto, resultado;
		 * 
		 * 
		 * System.out.println("Ingrese el valor del auto vendido"); valorDelAuto =
		 * teclado.nextInt();
		 * 
		 * System.out.println("Ingrese la cantidad de autos vendidos");
		 * cantidadDeAutosVendidos = teclado.nextInt();
		 * 
		 * resultado = salarioMensual + (cantidadDeAutosVendidos*comisionDeVenta) +
		 * (valorDelAuto%5);
		 * 
		 * System.out.println("El salario Mensual de un vendedor es: " + resultado);
		 */

		/*
		 * Ejercicio 5: La calificación final de un estudiante de Informática se calcula
		 * con base a las calificaciones de cuatro aspectos de su rendimiento académico:
		 * participación, primer examen parcial, segundo examen parcial y examen final.
		 * Sabiendo que las calificaciones anteriores entran a la calificación final con
		 * ponderaciones del 10%, 25%, 25% y 40%, Hacer un programa que calcule e
		 * imprima la calificación final obtenida por un estudiante.
		 * 
		 */

		/*
		 * int participacion, primerExamen, segundoExamen, examenFinal, resultado;
		 * 
		 * System.out.println("Ingrese la Nota de Participacion"); participacion =
		 * teclado.nextInt();
		 * 
		 * System.out.println("Ingrese la Nota del Primer Examen"); primerExamen =
		 * teclado.nextInt();
		 * 
		 * System.out.println("Ingrese la Nota del Segundo Examen"); segundoExamen =
		 * teclado.nextInt();
		 * 
		 * System.out.println("Ingrese la Nota del Examen Final"); examenFinal =
		 * teclado.nextInt();
		 * 
		 * resultado = (participacion%10) + (primerExamen%25) + (segundoExamen%25) +
		 * (examenFinal%40);
		 * 
		 * System.out.println("La calificacion Final obtenida del estudiante es:" +
		 * resultado);
		 */

		/*
		 * Ejercicio 6:
		 * 
		 * Hacer un programa que calcule el cuadrado de una suma.
		 * 
		 * (a+b)"2 = a"2 + b"2 + 2ab
		 */

		/*
		 * int a, b, resultado;
		 * 
		 * System.out.println("Ingrese el valor de A"); a = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese el valor de B"); b = teclado.nextInt();
		 * 
		 * resultado = a*2 + b*2 + 2*a*b ;
		 * 
		 * System.out.println("El resultado de el cuadrado de una suma es: " +
		 * resultado);
		 */

		/*
		 * Ejercicio 7: Construir un programa que, dado un número total de horas,
		 * devuelve el número de semanas, días y horas equivalentes. Por ejemplo, dado
		 * un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
		 */

		/*
		 * int numeroTotalDeHoras, semanas, dias, horas;
		 * 
		 * System.out.println("Ingrese numero total de horas"); numeroTotalDeHoras =
		 * teclado.nextInt();
		 * 
		 * semanas = numeroTotalDeHoras/168;
		 * 
		 * dias = numeroTotalDeHoras%168/24;
		 * 
		 * horas = numeroTotalDeHoras%24;
		 * 
		 * System.out.println("El resultado es" + "\nSemanas: " + semanas + "\nDias: " +
		 * dias + "\nHoras " + horas);
		 */

		/*
		 * Ejercicio 8:
		 * 
		 * Construir un programa que calcule y muestre por pantalla las raices de la
		 * ecuacion de segundo grado de coeficientes reales
		 * 
		 * ax"2 + bx + c = 0
		 * 
		 * x= -b +- RAIZ / b"2 - 4ac //2a
		 * 
		 */

		/*
		 * int a, b, c, resultado; double raiz, potencia, x1, x2;
		 * 
		 * System.out.println("Ingrese el valor de A"); a = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese el valor de B"); b = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese el valor de C"); c = teclado.nextInt();
		 * 
		 * potencia = Math.pow(b, 2);
		 * 
		 * raiz = Math.sqrt(potencia - (4*a*c));
		 * 
		 * x1 = (-b + raiz)/(2*a);
		 * 
		 * x2 = (-b - raiz)/(2*a);
		 * 
		 * System.out.println("Raiz 1: " + x1); System.out.println("Raiz 2: " + x2);
		 */

		/*
		 * BLOQUE DE CONDICIONALES
		 * 
		 * Ejercicio 1:
		 * 
		 * Programa que lea un número entero y muestre si el número es múltiplo de 10.
		 */

		/*
		 * int numero, resultado;
		 * 
		 * System.out.println("Ingrese un numero"); numero = teclado.nextInt();
		 * 
		 * if (numero%10 == 0) { System.out.println("El Numero es multipo de 10"); }
		 * else { System.out.println("El Numero no es multipo de 10"); }
		 */

		/*
		 * Ejercicio 2:
		 * 
		 * Pedir dos numeros y decir cual es el mayor o sin son iguales
		 * 
		 */

		/*
		 * int numeroA, numeroB;
		 * 
		 * System.out.println("Ingrese el primer numero"); numeroA = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese el segundo numero"); numeroB = teclado.nextInt();
		 * 
		 * if (numeroA > numeroB) { System.out.println("El numero: " + numeroA +
		 * " es mayor que el numero: " + numeroB); }
		 * 
		 * else if (numeroA < numeroB) { System.out.println("El numero: " + numeroB +
		 * " es mayor que el numero: " + numeroA); }
		 * 
		 * else { System.out.println("Los numeros " + numeroA + " y " + numeroB +
		 * " son iguales"); }
		 */

		/*
		 * Ejercicio 3
		 * 
		 * Programa que lea un carácter por teclado y compruebe si es una letra
		 * mayúscula.
		 */

		/*
		 * char caracter;
		 * 
		 * System.out.println("Ingrese una letra: "); caracter =
		 * teclado.next().charAt(0);
		 * 
		 * if (Character.isUpperCase(caracter)) {
		 * System.out.println("Es una letra Mayuscula"); } else {
		 * System.out.println("Es una letra Miniscula"); }
		 */

		/*
		 * Ejericio 4:
		 * 
		 * En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere
		 * los $300 ¿Cual sera la cantidad que pagara una persona por su compra?
		 * 
		 */

		/*
		 * int compra, compraDescuento, resultado; float descuento ;
		 * 
		 * System.out.println("Ingrese la cantidad gastada en su compra"); compra =
		 * teclado.nextInt();
		 * 
		 * if (compra >= 300) { compraDescuento = compra*20/100; resultado = compra -
		 * compraDescuento;
		 * System.out.println("La cantidad que pagara por su compra es de: " +
		 * resultado);
		 * 
		 * } else { System.out.println("El precio final es de: " + compra); }
		 */

		/*
		 * Ejercicio 5:
		 * 
		 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la
		 * siguiente manera: Si trabaja 40 horas o menos se le paga $16 por hora. Si
		 * trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas
		 * y $20 por cada hora extra.
		 */

		/*
		 * int horasTrabajadas, salarioTotal;
		 * 
		 * System.out.println("Ingrese las horas trabajadas"); horasTrabajadas =
		 * teclado.nextInt();
		 * 
		 * if (horasTrabajadas <= 40) { salarioTotal = horasTrabajadas * 16; } else {
		 * salarioTotal = (40 * 16) + (horasTrabajadas - 40) * 20;
		 * 
		 * } System.out.println("El salario total es: " + salarioTotal);
		 */

		/*
		 * Ejercicio 6:
		 * 
		 * Hacer un programa que tome dos numeros y diga si ambos son pares o impares.
		 */

		/*
		 * int numero1, numero2;
		 * 
		 * System.out.println("Ingrese el primer Numero"); numero1 = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese el segundo Numero"); numero2 = teclado.nextInt();
		 * 
		 * if (numero1%2 == 0 && numero2%2==0) {
		 * System.out.println("Los dos numeros son Pares"); } else if(numero1%2!=0 &&
		 * numero2%2!=0) { System.out.println("Los dos numeros son Impares"); } else {
		 * System.out.println("Uno de los numeros es Par y el otro es Impar"); }
		 */

		/*
		 * Ejercicio 7:
		 * 
		 * Pedir tres números y mostrarlos ordenados de mayor a menor.
		 */

		/*
		 * int numero1, numero2, numero3;
		 * 
		 * System.out.println("Ingrese tres numeros: "); numero1 = teclado.nextInt();
		 * numero2 = teclado.nextInt(); numero3 = teclado.nextInt();
		 * 
		 * if ((numero1 > numero2) && (numero2 > numero3)) {
		 * System.out.println("Orden: " + numero1 + " " + numero2 + " " + numero3);
		 * 
		 * } else if ((numero1>numero3) && (numero3>numero2)) {
		 * System.out.println("Orden: " + numero1 + " " + numero3 + " " + numero2); }
		 * else if((numero2>numero1) && (numero1>numero3)) {
		 * System.out.println("Orden: " + numero2 + " " + numero1 + " " + numero3); }
		 * 
		 * else if((numero2>numero3) && (numero3>numero1)) {
		 * System.out.println("Orden: " + numero2 + " " + numero3 + " " + numero1 ); }
		 * 
		 * else if((numero3>numero1) && (numero1>numero2)) {
		 * System.out.println("Orden: " + numero3 + " " + numero1 + " " + numero2); }
		 * 
		 * else if ((numero3>numero2) && (numero2>numero1)) {
		 * System.out.println("Orden: " + numero3 + " " + numero2 + " " + numero1); }
		 */

		/*
		 * Ejercicio 8:
		 * 
		 * Pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene.
		 * 
		 */

		/*
		 * int numero = 0;
		 * 
		 * System.out.println("Ingrese un numero entre el 0 hasta el 99999"); numero =
		 * teclado.nextInt();
		 * 
		 * if (numero<=9) { System.out.println("el numero tiene una cifra"); } else
		 * if(numero<=99) { System.out.println("el numero tiene dos cifras"); } else
		 * if(numero<=999) { System.out.println("el numero tiene tres cifras"); } else
		 * if(numero<=9999) { System.out.println("el numero tiene cuatro cifras"); }
		 * else if(numero<=99999) { System.out.println("el numero tiene cinco cifras");
		 * }
		 */

		/*
		 * Ejercicio 9:
		 * 
		 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta.
		 * Suponiendo todos los meses de 30 días.
		 */

		/*
		 * int dia, mes, anio;
		 * 
		 * System.out.println("Ingrese el dia"); dia = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese el mes"); mes = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese el anio"); anio = teclado.nextInt();
		 * 
		 * if ((dia >= 1) && (dia <= 30)) { if ((mes >= 1) && (mes <= 12)) { if
		 * (anio!=0) { System.out.println("La fecha es correcta"); } else {
		 * System.out.println("la fecha es incorrecta"); } } else {
		 * System.out.println("la fecha es incorrecta"); } } else {
		 * System.out.println("la fecha es incorrecta"); }
		 * 
		 * System.out.println("La fecha registrada es: " + dia + "/" + mes + "/" + anio
		 * );
		 */

		/*
		 * Ejercicio 10:
		 * 
		 * Pedir el dia, mes y año de una fecha e indicar si la fecha es correcta. Con
		 * meses de 28,30 y 31 dias Sin años bisiestos.
		 */

		/*
		 * int dia, mes, anio;
		 * 
		 * System.out.println("Ingrese el dia"); dia = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese el mes"); mes = teclado.nextInt();
		 * 
		 * System.out.println("Ingrese el anio"); anio = teclado.nextInt();
		 * 
		 * if ((dia >=1 && dia<=28) || (dia>=1 && dia<=30) || (dia>=1 && dia<=31) ) { if
		 * (mes>=1 && mes<=12) { if (anio!=0) {
		 * System.out.println("La fecha es correcta");
		 * 
		 * } } else { System.out.println("la fecha es incorrecta"); } } else {
		 * System.out.println("la fecha es incorrecta"); }
		 * 
		 * System.out.println("La fecha registrada es: " + dia + "/" + mes + "/" + anio
		 * );
		 */

		/*
		 * Ejercicio 11:
		 * 
		 * Construir un programa que simule el funcionamiento de una calculadora que
		 * puede realizar las cuatro operaciones aritméticas básicas (suma, resta,
		 * producto y división) con valores numéricos enteros. El usuario debe
		 * especificar la operación con el primer carácter del primer parámetro de la
		 * línea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para
		 * el producto y D o d para la división.
		 */

		/*
		 * int operacion1, operacion2, suma, resta, multiplicacion, division; char
		 * opciones = 'a';
		 * 
		 * System.out.println("Ingrese el primer Numero: "); operacion1 =
		 * teclado.nextInt();
		 * 
		 * System.out.println("Ingrese el segundo Numero: "); operacion2 =
		 * teclado.nextInt();
		 * 
		 * System.out.println("Ingrese la operacion que desea realizar: ");
		 * 
		 * System.out.println("S - Suma" + "\nR - Resta" + "\nM - Multiplicacion" +
		 * "\nD - Division"); opciones = teclado.next().charAt(0);
		 * 
		 * switch (opciones) { case 'S', 's': suma = operacion1 + operacion2;
		 * System.out.println("La suma es: " + suma); break; case 'R', 'r': resta =
		 * operacion1 - operacion2; System.out.println("La resta es: " + resta); break;
		 * case 'M', 'm': multiplicacion = operacion1 * operacion2;
		 * System.out.println("La multiplicacion es: " + multiplicacion); break; case
		 * 'D', 'd': division = operacion1 / operacion2;
		 * System.out.println("La division es: " + division); break; default:
		 * System.out.println("Error"); break; }
		 */

		/*
		 * Ejercicio 12:
		 * 
		 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente,
		 * Bien, Notable y Sobresaliente.
		 */

		/*
		 * int nota, insuficiente, suficiente, bien, notable, sobresaliente;
		 * 
		 * System.out.println("Ingrese la nota: "); nota = teclado.nextInt();
		 * 
		 * if (nota>=0 && nota<=2) { System.out.println("Su nota es Insuficente"); }
		 * else if(nota>=2 && nota<=4) { System.out.println("Su nota es Suficiente"); }
		 * else if (nota>=4 && nota<=6) { System.out.println("Su nota es Bien"); } else
		 * if(nota>=6 && nota<=8) { System.out.println("Su nota es Notable"); } else
		 * if(nota>=8 && nota<=10) { System.out.println("Su nota es Sobresaliente"); }
		 */

		/*
		 * Ejercicio 13:
		 * 
		 * Hacer un programa que simule un cajero automático con un saldo inicial de
		 * 1000 dólares, con el siguiente menú de opciones:
		 * 
		 * 1. Ingresar dinero a la cuenta. 2. Retirar dinero de la cuenta. 3. Salir
		 */

		/*
		 * int saldo = 1000, saldoAcutal, opciones, depositar, retirar ;
		 * 
		 * System.out.println("Menu de opciones");
		 * System.out.println("1 - Ingresar dinero a la cuenta" +
		 * "\n2 - Retirar dinero de la cuenta" + "\n3 - Salir"); opciones =
		 * teclado.nextInt();
		 * 
		 * switch (opciones) { case 1:
		 * System.out.println("Ingrese la cantidad que desea depositar: "); depositar =
		 * teclado.nextInt(); saldoAcutal = saldo + depositar;
		 * System.out.println("Se ha ingresado correctamente, su saldo es: " +
		 * saldoAcutal); break; case 2:
		 * System.out.println("Ingrese la cantidad que desea retirar"); retirar =
		 * teclado.nextInt(); if (retirar>saldo) {
		 * System.out.println("No cuenta con el saldo suficiente"); } else { saldoAcutal
		 * = saldo - retirar;
		 * System.out.println("Se ha retirado correctamente, su saldo es: " + saldo); }
		 * break; case 3: System.out.println("Adios ;D "); break;
		 * 
		 * default: break; }
		 */

		/*
		 * BLOQUE: Ciclos o Bucles
		 */

		/*
		 * Ejercicio 1:
		 * 
		 * Leer un numero y mostrar su cuadrado, repetir el procreso hasta que se
		 * introduzca un numero negativo
		 */

		/*
		 * int numero = 0, cuadrado;
		 * 
		 * System.out.println("Ingrese un numero"); numero = teclado.nextInt();
		 * 
		 * while (numero>=0) { cuadrado = (int)Math.pow(numero, 2);
		 * System.out.println("El numero: " + numero + " elevado al cuadrado es " +
		 * cuadrado);
		 * 
		 * System.out.println("Digite otro Numero"); numero = teclado.nextInt();
		 * 
		 * }
		 */

		/*
		 * Ejercico 2:
		 * 
		 * Leer un numero e indicar si es positivo o negativo. El proceso se repetira
		 * hasta que se introduzca un 0.
		 */

		/*
		 * int numero;
		 * 
		 * System.out.println("Ingrese un numero:"); numero = teclado.nextInt();
		 * 
		 * while (numero !=0 ) { if (numero>0) {
		 * System.out.println("El numero es positivo"); } else {
		 * System.out.println("El numero es negativo"); }
		 * System.out.println("Ingrese otro numero"); numero = teclado.nextInt(); }
		 */

		/*
		 * Ejercicio 3:
		 * 
		 * Leer numeros hasta que se introduzca un 0. Para cada uno indicar si es par o
		 * impar.
		 */

		/*
		 * int numero;
		 * 
		 * System.out.println("Ingrese un numero:"); numero = teclado.nextInt();
		 * 
		 * while (numero!=0) { if (numero %2 == 0) { System.out.println("El numero " +
		 * numero + " es par"); } else { System.out.println("El numero " + numero +
		 * " es impar"); } System.out.println("Ingrese otro numero"); numero =
		 * teclado.nextInt(); }
		 */

		/*
		 * Ejercicio 4:
		 * 
		 * Pedir numeros hasta que se teclee uno negativo, y mostrar cuantos numeros se
		 * han introducido.
		 */

		/*
		 * int numero, contador = 0;
		 * 
		 * System.out.println("Ingrese un Numero "); numero = teclado.nextInt();
		 * 
		 * while (numero>=0) { contador++; System.out.println("Ingrese un Numero ");
		 * numero = teclado.nextInt(); } System.out.println("Se registraron " + contador
		 * + " ");
		 */

		/*
		 * Ejercicio 5:
		 * 
		 * Realizar un juego para adivinar un número. Para ello generar un número
		 * aleatorio entre 0-100, y luego ir pidiendo números indicando “es mayor” o “es
		 * menor” según sea mayor o menor con respecto a N. El proceso termina cuando el
		 * usuario acierta y mostrar el número de intentos.
		 */

		/*
		 * int numero, contador = 0; int aleatorio;
		 * 
		 * 
		 * 
		 * 
		 * aleatorio = (int)(Math.random()*100);
		 * 
		 * do { System.out.println("Ingrese un Numero"); numero = teclado.nextInt(); if
		 * (aleatorio > numero) { System.out.println("Ingrese un numero Mayor"); } else
		 * { System.out.println("Ingrese un numero Menor"); } contador++; } while
		 * (numero!=aleatorio);
		 * 
		 * System.out.println("Encontraste el Numero en : " + aleatorio + " en " +
		 * contador + " intentos");
		 */

		/*
		 * Ejercicio 6:
		 * 
		 * Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros
		 * introducidos.
		 */

		/*
		 * int numero, contador = 0;
		 * 
		 * System.out.println("Ingrese un numero"); numero = teclado.nextInt();
		 * 
		 * while (numero != 0) { contador = contador + numero;
		 * 
		 * System.out.println("Ingrese un numero"); numero = teclado.nextInt();
		 * 
		 * } System.out.println("La suma de todos los numeros ingresados son: " +
		 * contador);
		 */

		/*
		 * Ejercico 7:
		 * 
		 * Pedir numeros hasta que se introduzca uno negativo, y calcular la media.
		 */

		/*
		 * int numero, elementos= 0, suma = 0; float media;
		 * 
		 * System.out.println("Ingrese un numero"); numero = teclado.nextInt();
		 * 
		 * while (numero>=0) { suma = suma + numero;
		 * 
		 * elementos++;
		 * 
		 * System.out.println("Ingrese un Numero"); numero = teclado.nextInt(); } if
		 * (elementos==0) { System.out.println("La division entre 0 no existe"); } else
		 * { media = (float)suma/elementos; System.out.println("La media es: " + media);
		 * }
		 */

		/*
		 * Ejercicio 9: Escribir todos los números del 100 al 0 de 7 en 7.
		 */

		/*
		 * int numero;
		 * 
		 * for (int i = 100; i >= 0; i = i-7) { System.out.println(i);
		 * 
		 * }
		 */

		/*
		 * Ejercicio 10:
		 * 
		 * Pedir 10 numeros y escribir la suma total
		 */

		/*
		 * int numero, contador = 0, suma= 0;
		 * 
		 * for (int i = 1; i <= 10; i++) { System.out.println("Ingrese varios numeros");
		 * numero = teclado.nextInt();
		 * 
		 * suma = suma + numero; } System.out.println("La suma es: " + suma);
		 */

		/*
		 * Ejercicio 11: Diseñar un programa que muestre el producto de los 10 primeros
		 * números impares.
		 */

		/*
		 * long producto = 1;
		 * 
		 * for (int i = 1; i <= 20; i += 2) { producto = producto * i; }
		 * System.out.println("El producto es: " + producto);
		 */

		/*
		 * Ejercicio 12:
		 * 
		 * Pedir un numero y calcular su factorial.
		 * 
		 * N! = 1*2*3*...*N
		 */

		/*
		 * int numero; double prodfact = 1;
		 * 
		 * System.out.println("Ingrese un Numero"); 
		 * numero = teclado.nextInt();
		 * 
		 * for(int i =1; i<=numero; i++) { 
		 * prodfact= prodfact*i; }
		 * System.out.println("Factorial de: " + numero + " es " + prodfact);
		 */

		/*
		 * Ejercicio 13: Pedir 10 números. Mostrar la media de los números positivos, la
		 * media de los números negativos y la cantidad de ceros.
		 * 
		 */

		int numero, sumaPositivos = 0, conteoPositivos= 0, sumaNegativos = 0, conteoNegativos = 0, conteoCeros = 0;
		float mediaPositivos, mediaNegativos;
		
		for(int i =1; i<=10; i++) {
			System.out.println("Ingrese un numero");
			numero = teclado.nextInt();
			
			if (numero == 0) {
				conteoCeros++;
			} else if(numero>0){
				sumaPositivos = sumaPositivos + numero;
				conteoPositivos++;
			
			}
			else {
				sumaNegativos = sumaNegativos + numero;
				conteoNegativos++;
			}
		}
		
		if (conteoPositivos == 0) {
			System.out.println("No se puede sacar la media de los positivos");
		} else {
			mediaPositivos = (float)sumaPositivos/conteoPositivos;
			System.out.println("La media de los numeros positivos es: " + mediaPositivos);
		}
		
		if (conteoNegativos == 0) {
			System.out.println("No se puede sacar la media de los negativos");
			
		
		} else {
			mediaNegativos = (float)sumaNegativos/conteoNegativos;
			System.out.println("La media de los numeros negativos es: " + mediaNegativos);
		}
	
		System.out.println("La cantidad de los ceros es: " + conteoCeros);
	
	}
	
	
}