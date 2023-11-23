package aplication;
/*
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Invoice;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;


//Implementação da camada Servios, com o uso de uma classe para associar duas outras classe - Interfaces 


public class Program1 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println("----Entre com os dados do aluguel----");
		System.out.println("Modelo do Carro: ");
		String carModel = sc.nextLine();
		
		System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
		System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.println("Entre com o preço por hora");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(cr);
		System.out.println("FATURA");
		System.out.println("Pagamento basico: "+cr.getInvoice().getBasicPayment());
		System.out.println("Imposto: "+cr.getInvoice().getTax());
		System.out.println("pagmento total: " +cr.getInvoice().getTotalPayment());
		
		sc.close();
		
			

	}

}
*/