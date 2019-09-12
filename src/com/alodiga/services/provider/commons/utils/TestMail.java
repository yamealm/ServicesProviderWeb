package com.alodiga.services.provider.commons.utils;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.alodiga.services.provider.commons.exceptions.GeneralException;
import com.alodiga.services.provider.commons.models.Category;
import com.alodiga.services.provider.commons.models.Condicion;
import com.alodiga.services.provider.commons.models.Customer;
import com.alodiga.services.provider.commons.models.Enterprise;
import com.alodiga.services.provider.commons.models.Product;
import com.alodiga.services.provider.commons.models.ProductSerie;
import com.alodiga.services.provider.commons.models.Provider;
import com.alodiga.services.provider.commons.models.Transaction;
import com.alodiga.services.provider.commons.models.User;

public class TestMail {
	
	

	public static void main(String[] args) {
		
		List<ProductSerie> series = new ArrayList<ProductSerie>();
		List<ProductSerie> quarantines = new ArrayList<ProductSerie>();
		Enterprise enterprise = new Enterprise();
		enterprise.setInfoEmail("yalmea@alodiga.us");
		for(int i=0; i<5; i++) {
		ProductSerie productSerie = new ProductSerie();
		productSerie.setId(1L);
		productSerie.setAmount(10f);
		Transaction beginTransactionId = new Transaction();
		productSerie.setBeginTransactionId(beginTransactionId);
		Category category = new Category();
		category.setName("Stock");
		productSerie.setCategory(category);
		Condicion condition = new Condicion();
		condition.setName("New");
		productSerie.setCondition(condition);
		productSerie.setCreationDate(new Timestamp((new java.util.Date().getTime())));
		productSerie.setCure(new Timestamp((new java.util.Date().getTime())));
		Customer customer = new Customer();
		customer.setFirstName("Luis");
		customer.setLastName("Almea");
		productSerie.setCustomer(customer);
		productSerie.setExpirationDate(new Timestamp((new java.util.Date().getTime())));
		productSerie.setObservation("Fecha de vencimiento expirada");
		Product product = new Product();
		product.setActNpNsn("23434");
		product.setPartNumber("AGT675");
		product.setDescription("Producto1");
		product.setUbicationBox("caja 1");
		product.setUbicationFolder("folder 1");
		product.setAmount(10F);
		productSerie.setProduct(product);
		Provider provider = new Provider();
		provider.setName("Provider1");
		productSerie.setProvider(provider);
		productSerie.setSerie("454HY");
		productSerie.setQuarantineReason("Fecha de vencimiento expirada");
		quarantines.add(productSerie);
		}
		User user = new User();
		user.setFirstName("Yamelis");
		user.setLastName("Almea");
		user.setLogin("yalmea");
		user.setEmail("yamealm@gmail.com");
//		try {
//			ServiceMailDispatcher.sendQuarantineDataMail(enterprise, quarantines, "Cuarentena");
//		} catch (GeneralException e) {
//			e.printStackTrace();
//		}

		try {
			Mail mail = ServiceMails.getUserRecoveryPasswordMail(user, "123456", enterprise);
			(new com.alodiga.services.provider.commons.utils.MailSender(mail)).start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
